package ktw_test.team1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//Program interface를 구현하는 WordProgram
public class WordProgram implements Program{
	
	//단어를 입력받아 저장하는 list 생성
	List<Word> wordList = new ArrayList<Word>();
	//뜻과 품사를 입력받아 저장하는 list 생성
	List<Means> meanList = new ArrayList<Means>();
	Scanner scan = new Scanner(System.in);
	
	@Override
	public void run() {
		//실행하면 무조건 1번은 실행되게 do while 반복문
		int menu = 0;
		do {
			//메뉴 출력
			printMenu();
			//메뉴선택 잘못할 시 예외처리
			try {
				//메뉴 입력
				menu = scan.nextInt();
				//선택한 메뉴 실행
				runMenu(menu);
			} catch (Exception e) {
				System.out.println("잘못 선택된 메뉴");
				scan.nextLine(); //엔터처리
			}
		}while(menu != 3);
	}

	@Override
	public void printMenu() {
		System.out.println("-----------");
		System.out.println("메뉴");
		System.out.println("1. 단어 관리");
		System.out.println("2. 의미 관리");
		System.out.println("3. 종료");
		System.out.println("-----------");
		System.out.println("메뉴 선택 : ");
	}
	
	//메뉴 실행
	@Override
	public void runMenu(int menu) {
		//switch로 메뉴 선택
		switch(menu) {
		case 1:
			//단어 관리
			printWordManager();
			menu = scan.nextInt();
			runWordManager(menu);
			break;
		case 2:
			//뜻 관리
			printMeanManager();
			menu = scan.nextInt();
			runMeanManager(menu);
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		default:
			//예외처리
			throw new InputMismatchException();
		}
		
	}

	//단어 관리 메뉴 출력
	private void printWordManager() {
		System.out.println("-----------");
		System.out.println("단어 관리 메뉴");
		System.out.println("1. 단어 추가");
		System.out.println("2. 단어 수정");
		System.out.println("3. 단어 삭제");
		System.out.println("4. 돌아가기");
		System.out.println("-----------");
		System.out.println("메뉴 선택 : ");
	}
	
	//단어 관리 메뉴 실행
	private void runWordManager(int menu) {
		switch(menu) {
		case 1:
			insertWord();
			//단어 추가
			break;
		case 2:
			updateWord();
			//단어 수정
			break;
		case 3:
			deleteWord();
			//단어 삭제
			break;
		case 4:
			System.out.println("돌아가기");
			//단어 삭제
			break;
		default:
			throw new InputMismatchException();
		}
	}

	//단어 추가
	private void insertWord() {
		//단어 입력받는다.
		System.out.println("단어 입력 : ");
		String word = scan.next();
		//word 클래스의 변수를 포함하고 있는 wordList에 입력받은 단어를 넣기 위해 인스턴스 생성
		Word tmpWord = new Word(word);
		//단어가 단어리스트에 이미 있는 단어인지 확인한다.
		if(wordList.contains(tmpWord)) {
			System.out.println("중복된 단어");
			//중복된 단어면 저장하지 않고 빠져나간다.
			return;
		}
		//없다면 저장
		wordList.add(tmpWord);
		//확인 출력
		System.out.println(wordList);
		
		//의미 입력 받는다
		System.out.print("의미 입력 : ");
		String mean = scan.next();
		//품사 입력 받는다
		System.out.print("품사 입력 : ");
		String wordClass = scan.next();
		//meanList에 입력값 넣기위한 인스턴스 생성. 하기 위해 means 클래스에 생성자를 생성 한게 @data
		Means tmpMeans = new Means(mean, wordClass);
		if(meanList.contains(mean)) {
			System.out.println("이미 입력된 의미");
			return;
		}
		//없다면 저장
		meanList.add(tmpMeans);
		//단어 배열에다가 뜻 배열 집어넣고싶어
	
	}

	//단어 수정
	private void updateWord() {

	}

	//단어 삭제
	private void deleteWord() {

	}
	
	//뜻 관리 메뉴 출력
	private void printMeanManager() {
		System.out.println("-----------");
		System.out.println("의미 관리 메뉴");
		System.out.println("1. 의미 추가");
		System.out.println("2. 의미 수정");
		System.out.println("3. 의미 삭제");
		System.out.println("4. 돌아가기");
		System.out.println("-----------");
		System.out.println("메뉴 선택 : ");
	}
	
	//뜻 관리 메뉴 실행
	private void runMeanManager(int menu) {
		switch(menu) {
		case 1:
			//뜻 추가
			insertMean();
			break;
		case 2:
			//뜻 수정
			updateMean();
			break;
		case 3:
			//뜻 삭제
			deleteMean();
			break;
		case 4:
			System.out.println("돌아가기");
			//단어 삭제
			break;
		default:
			throw new InputMismatchException();
		}
	}

	private void insertMean() {
		// 뜻 추가
		
	}
	
	private void updateMean() {
		//뜻 수정
		
	}
	
	private void deleteMean() {
		//뜻 삭제
		
	}

}
