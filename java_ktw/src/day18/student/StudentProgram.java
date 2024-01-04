package day18.student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentProgram implements Program{
	private StudentManager sm = new StudentManager();
	private Scanner scan = new Scanner(System.in);
	private final int EXIT = 4;
	private Socket socket;
	
	ObjectOutputStream oos;
	ObjectInputStream ois;
	
	@Override
	public void run() {
		int menu = 0;
		do {
			String ip = "192.168.30.22";
			int port = 5001;
			
			//서버와 연결
			connectServer(ip, port);
			
			load();
			
			printMenu();
			try {
				menu = scan.nextInt();
				runMenu(menu);
			} catch(Exception e) {
				System.out.println("잘못 선택한 메뉴");
				scan.nextLine(); //입력 버퍼에 잘못 입력된 값을 제거 또는 공백을 제거
			}
				
		}while(menu != EXIT);
	}

	private void load() {
		if(socket == null) {
			System.out.println("[서버에 연결되지 않아 불러올 수 없습니다.]");
		}
		try {
			oos.writeUTF("LOAD");
			oos.flush();
			List<Student> list = (List<Student>) ois.readObject();
			sm = new StudentManager(list);
			System.out.println("[불러오기 성공]");
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("[불러오기 중 예외가 발생했습니다.]");
		}
		
	}

	private void connectServer(String ip, int port) {
		try {
			socket = new Socket(ip, port);
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			
			System.out.println("[서버 연결 성공]");
		} catch(IOException e) {
			System.out.println("[서버 연결 실패]");
		}
		
		
	}

	@Override
	public void printMenu() {
		System.out.println("-----메뉴-----");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 조회(전체)");
		System.out.println("3. 학생 수정(이름)");
		System.out.println("4. 종료");
		System.out.println("-------------");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertStudent();
			break;
		case 2:
			sm.printStudent();
			break;
		case 3:
			updateStudent();
			break;
		case 4:
			exit();
			System.out.println("프로그램 종료");
			break;
		default:
			throw new InputMismatchException();
		}
		
	}

	private void updateStudent() {
		//학생 정보 입력
		System.out.println("학생 등록 기능");
		//학년
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		//반
		System.out.print("반 : ");
		int classNum = scan.nextInt();
		//번호
		System.out.print("번호 : ");
		int num = scan.nextInt();
		//이름
		System.out.print("이름 : ");
		String name = scan.next();

		//학생 정보 수정
		Student std = new Student(grade, classNum, num, name);
		if (sm.updateStudent(std)){
			System.out.println("이름을 수정했습니다.");
			sendUpdateStudent(std);
		}else {
			System.out.println("등록되지 않은 학생입니다,");
		}
	}

	private void sendUpdateStudent(Student std) {
		try {
			oos.writeUTF("UPDATE");
			oos.flush();
			oos.writeObject(std);
			oos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private void exit() {
		try {
			oos.writeUTF("SAVE");
			oos.flush();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void insertStudent() {
		System.out.println("학생 등록 기능");
		//학년
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		//반
		System.out.print("반 : ");
		int classNum = scan.nextInt();
		//번호
		System.out.print("번호 : ");
		int num = scan.nextInt();
		//이름
		System.out.print("이름 : ");
		String name = scan.next();
		//인스턴스 생성하고 저장
		Student std = new Student(grade, classNum, num, name);
		//만약 contains list = 이미 있는 학생
		if(sm.insertStudent(std)) {
			System.out.println("학생 등록 완료");
			sendStudent(std);
			return;
		}else
		//없다면 저장
		System.out.println("이미 등록된 학생");
	}

	private void sendStudent(Student std) {
		if(socket == null) {
			System.out.println("[서버에 연결되지 않아 서버에 학생 정보를 추가할 수 없습니다.]");
		}
		
		try {
			oos.writeUTF("INSERT");
			oos.flush();
			oos.writeObject(std);
			oos.flush();
			//읽어옴
			System.out.println("[불러오기 성공]");
		} catch (IOException e) {
			System.out.println("[불러오기 중 예외가 발생했습니다.]");
		}
	}

}
