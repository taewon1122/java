package homework;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EnglishProgram implements Program2 {
	static List<Word> list = new ArrayList<Word>();
	static int EXIT = 4;
	static Scanner scan = new Scanner(System.in);
	// * - 한 단어에 뜻이 여러개 있을 수 있음
	// * - 단어, 품사, 뜻을 관리
	// 궁금한점 - 품사별로 뜻을 관리해야하는데 switch문을 이용해서 품사를 선택하고 그 품사별로 의미를 저장한다.
	// 품사별로 의미를 저장하는데 단어와 매치되게 품사를 검색했을때 해당 뜻을 저장하고 있는 단어와 함께 출력되게 할수있는 방법?..
	// list를 두개이상 만들어서 매치를 시켜야하는건지 (단어, 품사(n개), 의미)를 저장하고 있는 list에서 원하는 정보만 출력할수있는것인지? 방법을 잘 모르겠습니다.,,
	// 1. 품사 클래스를 하나 더 만들어서?
	// 2. 단어배열의 index와 품사배열의 index가 일치하게
	// 2_1 -> 삭제할때, 수정할때 단어 index 품사 index 동시에 관리해주기
	// 3 -> 품사별 의미 저장할때 아예 단어를 다시 입력 받아서 equals를 이용해서 단어가 같다면 해당 단어에 저장된 품사와 의미 출력해줄 수 있을것 같습니다 
	@Override
	public void run() {
		int menu = 0;
		do {
			try {
			//메뉴 출력
			printMenu();
			//메뉴 입력
			menu = scan.nextInt();
			//선택된 메뉴 실행
			runMenu(menu);
			}catch(InputMismatchException e){
				System.out.println("잘못 입력된 메뉴입니다.");
				scan.nextLine();
			}
		}while(menu != EXIT);
	}

	@Override
	public void printMenu() {
		System.out.println("------------------------");
		System.out.println("1. 단어관리");
		System.out.println("2. 의미관리");
		System.out.println("3. 단어조회");
		System.out.println("4. 프로그램 종료");
		System.out.println("------------------------");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			wordManager();
		case 2:
			meanManager();
			break;
		case 3:
			searchWord();
		break;
		case 4:
			//종료
			System.out.println("프로그램 종료");
			break;
		default:
			throw new InputMismatchException();
		}
	}

	private void searchWord() {
		int submenu;
		do {
			//메뉴 출력
			printSerchWord();
			//메뉴 선택
			submenu = scan.nextInt();
			//선택한 메뉴 실행
			runSerchWord(submenu);
		}while(submenu != EXIT);
	}

	private void printSerchWord() {
		System.out.println("메뉴");
		System.out.println("1. 품사별 조회");
		System.out.println("2. 단어 및 의미 조회");
		System.out.println("3. 전체 조회");
		System.out.println("4. 돌아가기");
		System.out.print("메뉴 선택 : ");
	}
	
	private void runSerchWord(int submenu) {
		switch(submenu) {
		case 1: 
		//의미 추가
			serchPartOfSpeech();
		case 2:
		//의미 수정
			serchWord();
		case 3:
		//의미 삭제
			serchAllWords();
		case 4:
			System.out.println("돌아가기");
			break;
		default	:
			System.out.println("잘못된 메뉴 선택");
		}
	}

	private void serchAllWords() {
		// 저장된 모든 단어 및 의미 조회
		
	}

	private void serchWord() {
		// 입력한 단어의 단어와 품사별 의미 조회
		
	}

	private void serchPartOfSpeech() {
		// 품사별 단어와 선택한 품사의 의미 조회
		// ex) 명사를 선택하면 명사가 저장되어있는 단어와 그 의미 출력
		
	}

	private void meanManager() {
		int submenu;
		do {
			//메뉴 출력
			printMeanManager();
			//메뉴 선택
			submenu = scan.nextInt();
			//선택한 메뉴 실행
			runMeanManger(submenu);
		}while(submenu != EXIT);
	}

	private void printMeanManager() {
		System.out.println("메뉴");
		System.out.println("1. 의미 추가");
		System.out.println("2. 의미 수정");
		System.out.println("3. 의미 삭제");
		System.out.println("4. 돌아가기");
		System.out.print("메뉴 선택 : ");
	}

	private void runMeanManger(int submenu) {
		switch(submenu) {
		case 1: 
		//의미 추가
			insertMean();
		case 2:
		//의미 수정
			updateMean();
		case 3:
		//의미 삭제
			deleteMean();
		case 4:
			System.out.println("돌아가기");
			break;
		default	:
			System.out.println("잘못된 메뉴 선택");
		}
	}

	private void insertMean() {
		// 품사별 저장하는 리스트를 새로 생성?.. 
		// 품사별 의미 추가
			//switch문을 이용해서 품사선택
			//의미추가
			//같은 품사에서 의미추가가 된다면 수정되는게 아니라 의미만 추가되는거
	}
	
	private void updateMean() {
		// 단어 수정에서 기능이랑 중복되는거 같기도 합니다
		//단어 입력후 검색
		//switch문을 이용해서 품사선택 (없다면 return;)
		//"해당 품사에 대한 의미 리스트"에서 삭제후 새로 입력한 의미 저장
		
	}

	private void deleteMean() {
		// 품사별 검색후 삭제
		
	}

	private void wordManager() {
		int submenu;
		do {
			//메뉴 출력
			printWordManager();
			//메뉴 선택
			submenu = scan.nextInt();
			//선택한 메뉴 실행
			runWordManger(submenu);
		}while(submenu != EXIT);
	}

	private void printWordManager() {
		System.out.println("메뉴");
		System.out.println("1. 단어 추가");
		System.out.println("2. 단어 수정");
		System.out.println("3. 단어 삭제");
		System.out.println("4. 돌아가기");
		System.out.print("메뉴 선택 : ");
	}

	private void runWordManger(int submenu) {
		switch(submenu) {
		case 1: 
			//의미 추가
			insertWord();
			break;
		case 2:
			//단어 수정
			updateWord();
			break;
		case 3:
			//단어 삭제
			deleteWord();
			break;
		case 4:
			System.out.println("돌아가기");
			break;
		default	:
			System.out.println("잘못된 메뉴 선택");
		}
		
	}

	private void insertWord() {
		//단어 추가
		//단어 입력
		System.out.print("단어 입력 : ");
		String word = scan.next();
		//품사 입력
		System.out.print("품사 입력 : ");
		String partOfSpeech = scan.next();
		//의미 입력
		System.out.print("의미 입력 : ");
		String mean = scan.next();
		//word 클래스의 새로운 인스턴스를 만들고 거기에 입력값을 저장
		Word wrd = new Word(word, partOfSpeech, mean);
		
		//std가 리스트에 있는지 확인해서 없으면 추가
		//contains는 Objects.equals(a,b)를 호출해서 a와 b의 클래스가 같으면
		//a.equals(b)를 이용하여 있는지 없는지 확인
		if(!list.contains(wrd)) {
			list.add(wrd);
			System.out.println("단어를 등록했습니다.");
			return;
		}
	}
	
	private void updateWord() {
		System.out.println("단어 수정");
		//기존 단어 정보 입력
		System.out.print("단어 입력 : ");
		String word = scan.next();
		System.out.print("품사 입력 : ");
		String partOfSpeech = scan.next();
		System.out.print("의미 입력 : ");
		String mean = scan.next();
		
		Word wrd = new Word(word, partOfSpeech, mean);
		int index = list.indexOf(wrd); 
		
		if(index == -1) {
			System.out.println("등록되지 않은 단어입니다.");
			return;
		}
		
		wrd = list.get(index);
		
		System.out.println("수정할 내용 입력");
		//수정할 단어 입력
		System.out.print("단어 입력 : ");
		String Word = scan.next();
		System.out.print("품사 입력 : ");
		String PartOfSpeech = scan.next();
		System.out.print("의미 입력 : ");
		String Mean = scan.next();
		
		//수정할 단어 저장할 새로운 배열 생성
		Word newWrd = new Word(Word, PartOfSpeech, Mean);
		//이미 수정된 정보라면 = 새로 입력한 정보와 일치하다면
		if(list.contains(newWrd)) {
			//이미 수정된 정보라고 출력
			System.out.println("이미 수정된 단어입니다.");
		}
		
		//그렇지 않다면 수정된 정보 저장
		newWrd.setWord(wrd.getWord());
		newWrd.setPartOfSpeech(wrd.getPartOfSpeech());
		newWrd.setMean(wrd.getMean());
		
		//기존 정보 삭제
		list.remove(index);
		
		//수정된 정보 리스트에 추가
		list.add(newWrd);
		
		System.out.println("수정 완료");
	}
	
	private void deleteWord() {
		System.out.print("단어 입력 : ");
		String Word = scan.next();
		System.out.print("품사 입력 : ");
		String PartOfSpeech = scan.next();
		System.out.print("의미 입력 : ");
		String Mean = scan.next();
		
		Word wrd = new Word(Word,PartOfSpeech,Mean);
		
		if(list.equals(wrd)) {
			list.remove(wrd);
			System.out.println("단어가 삭제되었습니다.");
		}else {
			System.out.println("존재하지 않는 단어입니다.");
		}
	}

}
