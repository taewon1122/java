package day16.student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class StudentProgram implements Program {
	static Scanner scan = new Scanner(System.in);
	static List<Student> list = new ArrayList<Student>();
	
	@Override
	public void run() {
		
		int menu = 0;
		String fileName = "src/day16/student/list.txt";
		load(fileName);
		do {
			try {
				//메뉴 출력
				printMenu();
				//메뉴 선택
				menu = scan.nextInt();
				//메뉴 실행
				runMenu(menu);
			}catch(Exception e){
				System.out.println("예외가 발생했습니다.");
				scan.nextLine();
			}
		}while(menu != 3);
		
		save(fileName);
		
	}

	private void load(String fileName) {
		try(FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis)){
			list = (List<Student>)ois.readObject();
			System.out.println("학생 정보를 불러왔습니다.");
		} catch (Exception e) {
			System.out.println("불러오기에 실패했습니다.");
		}
	}

	private void save(String fileName) {
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(list);
		} catch (IOException e) {
			System.out.println("저장에 실패했습니다.");
		} 
	}

	@Override
	public void printMenu() {
		System.out.println("---------------");
		System.out.println("메뉴");	
		System.out.println("1. 학생 추가");	
		System.out.println("2. 학생 조회[전체]");	
		System.out.println("3. 종료");
		System.out.println("---------------");	
		System.out.print("메뉴선택 : ");	
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertStudent();
			break;
		case 2:
			printStudent(s->true);
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		default:
			throw new RuntimeException();
		}
		
	}


	private void insertStudent() {
		//학생 입력
		//학년
		System.out.print("학년 입력 : ");
		int grade = scan.nextInt();
		//반
		System.out.print("반 입력 : ");
		int classNum = scan.nextInt();
		//번호
		System.out.print("번호 입력 : ");
		int num = scan.nextInt();
		//이름
		System.out.print("이름 입력 : ");
		String name = scan.next();
		
		//객체 생성
		Student std = new Student(grade, classNum, num, name);
		
		//같은 학생이 있는지 확인하고
		if(!list.contains(std)) {
			//없으면 추가
			list.add(std);
			System.out.println("학생을 추가했습니다.");
			return;
		}
		
		//있으면 안내문구
		//student class에서 equals hashcode 재정의해서 학년 반 번호가 같으면 이미 등록된 학생이라고 출력되게 만듬.
		//동명이인은 추가가 된다. 재정의 할때 name을 제외해서
		System.out.println("이미 등록된 학생입니다.");
	}	
	
	private void printStudent(Predicate<Student> p) {
		//forEach가 반복문을 대신해줌
		list.stream().forEach(s -> System.out.println(s));
		
	}

}
