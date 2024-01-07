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
		//없다면 저
		//확인 출력
		//의미 입력 받는다
		System.out.print("의미 입력 : ");
		String mean = scan.next();
		//품사 입력 받는다
		System.out.print("품사 입력 : ");
		String wordClass = scan.next();
		//meanList에 입력값 넣기위한 인스턴스 생성
		Means means = new Means(mean,wordClass);
		//meanList에 means 집어넣는다.
		meanList.add(means);
		//tmpword에 meanlist 집어넣는다
		tmpWord.setMean(meanList);
		//wordList에 tmpWord 집어넣는다.
		wordList.add(tmpWord);
		//출력
		for(int i = 0; i<wordList.size(); i++) {
			System.out.println(wordList.get(i).toString());
		}
	}
		
		//단어 출력하는게 계속 바껴서 나오는게 입력한 tmpWord를 해서그런가
		//[[단어 : 1[[품사] : 1 [뜻] : 1, [품사] : 2 [뜻] : 2]], [단어 : 2[[품사] : 1 [뜻] : 1, [품사] : 2 [뜻] : 2]]]
		//이유는 단어리스트의 [0]에 품사리스트가 따로 관리되지 않아서.???
		
		//단어 리스트가 wordProgram에 선언되어있다. 근데 word clas
		/*
		 * for(int i = 0; i<wordList.size(); i++) {
			System.out.println(wordList.get(i).toString());
		}
		 */
//		이렇게 쓰니까 단어는 저장이 다 된다. 근데 품사랑 뜻이 둘다적용이되버려
//		for(int i = 0; i<wordList.size(); i++) {
//		System.out.println(wordList.get(i).toString() + means.toString());
//	}
		
		/*
		 * [단어 : 1][품사] : 2 [뜻] : 2
			[단어 : 2][품사] : 2 [뜻] : 2
		 */
//		이거까지 해봤을때 	품사 입력하는게 mean배열에 잘 안들어갖나봐 하
		
//			System.out.println("이미 입력된 의미");
//			return;
//		}

	//단어 수정
	private void updateWord() {
		//단어 입력한다
		System.out.println("단어 입력 : ");
		String word = scan.next();
		//word 클래스의 변수를 포함하고 있는 wordList에 입력받은 단어를 넣기 위해 인스턴스 생성
		Word tmpWord = new Word(word);
		//입력한 단어 있는지 확인
		if(!wordList.contains(tmpWord)) {
			//없으면 빠져나간다.
			System.out.println("저장되지 않은 단어.");
			return;
		}else {
			//tmpWord의 주소값을 index에 넣는다.
			int index = wordList.indexOf(tmpWord); 
			System.out.println("수정할 단어 입력 : ");
			word = scan.next();
			Word tmpWord1 = new Word(word);
			//입력한 단어가 있다면 위치한 번지의 단어를
			wordList.remove(index);
			//새로운 입력값 저장
			wordList.add(tmpWord1);
		}
		return;
		//지우고
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
