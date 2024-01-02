package homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class WordProgram1 implements Program {
	List<Word> wordList = new ArrayList<Word>();
	String fileName = "src/day15/homework/WordList.txt";
	Scanner scan = new Scanner(System.in);
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
		
		loadList();
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
		}while(menu != 4);
		saveList();
	}
	
	// 단어장 불러오기
		private void loadList() {
			try(FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fis)){
				wordList = (ArrayList<Word>)ois.readObject();
			} catch (Exception e) {
				System.out.println("단어장 파일이 없거나 불러오기에 실패했습니다.");
			}
		}
			
			
		// 단어장 저장하기	
		private void saveList() {
			try(FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(wordList);
				System.out.println("단어장이 저장되었습니다.");
			} catch (IOException e) {
				System.out.println("단어장 저장 중 오류가 발생했습니다.");
			}
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
		}while(submenu != 4);
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
			serchAll();
		case 2:
			serchWord();
		case 3:
			serchMean();
		case 4:
			serchWordClass();
		case 5:
			serchFirstSpell();
		case 6:
			System.out.println("돌아가기");
			break;
		default	:
			System.out.println("잘못된 메뉴 선택");
		}
	}

	private void serchAll() {
		for(Word tmp : wordList) {
			tmp.printWord();
		}
	}
	
	private void serchWord() {
		int index = -1;
		System.out.println("검색할 단어 입력 : ");
		String word = scan.next();
		Word tmpWord = new Word(word);
		if(!wordList.contains(tmpWord)) {
			System.out.println("등록된 단어가 아닙니다.");
			return;
		}
		else {
			index = wordList.indexOf(tmpWord);
		}
		wordList.get(index).printWord();
	}

	private void serchWordClass() {
		boolean ok = false;
		System.out.println("검색할 품사 입력 : ");
		String wordClass = scan.next();
		for(int i = 0; i < wordList.size(); i++) {
			for(int j = 0; j < wordList.get(i).mean.size(); j++)
			if(wordList.get(i).mean.get(j).getWordClass().equals(wordClass)) {
				wordList.get(i).printWord();
				ok = true;
			}
		}
		if(!ok) {
			System.out.println(wordClass + "로 등록된 단어가 없습니다.");
		}
	}
	
	private void serchMean() {
		scan.nextLine();
		String mean = scan.nextLine();
		Means means = new Means(" ", mean);
		for(int i = 0; i < wordList.size(); i++) {
			if(wordList.get(i).mean.contains(means)) {
				wordList.get(i).printWord();
				return;
			}
		}
		System.out.println("등록 되지 않은 뜻입니다.");
	}
	
	private void serchFirstSpell() {
		System.out.println("검색할 알파벳 : ");
		char ch = scan.next().charAt(0);
		boolean ok = false;
		for(int i = 0; i < wordList.size(); i++) {
			if(wordList.get(i).getWord().charAt(0) == ch) {
				wordList.get(i).printWord();
				ok = true;
			}
		}
		if(!ok) {
			System.out.println(ch + "로 시작하는 단어가 등록되지 않았습니다.");
		}
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
		}while(submenu != 4);
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
			break;
		case 2:
		//의미 수정
			updateMean();
			break;
		case 3:
		//의미 삭제
			deleteMean();
			break;
		case 4:
			System.out.println("돌아가기");
			break;
		default	:
			System.out.println("잘못된 메뉴 선택");
		}
	}
	
	private void insertMean() {
		int index = -1;
		System.out.print("뜻 추가할 단어 : ");
		String word = scan.next();
		Word tmpWord = new Word(word);
		if(!wordList.contains(tmpWord)) {
			System.out.println("등록 되지 않은 단어입니다.");
			return;
		}
		else {
			index = wordList.indexOf(tmpWord);
		}
		wordList.get(index).printWord();
		
		scan.nextLine();
		System.out.print("추가할 뜻 : ");
		String mean = scan.nextLine();
		System.out.print("추가할 뜻 품사 : ");
		String wordClass = scan.next();
		Means tmpMean = new Means(wordClass, mean);
		wordList.get(index).mean.add(tmpMean);
		wordList.get(index).printWord();
	}
	
	private void updateMean() {
		int index = -1;
		System.out.println("뜻 수정할 단어 : ");
		String word = scan.next();
		Word tmpWord = new Word(word);
		if(!wordList.contains(tmpWord)) {
			System.out.println("등록 되지 않은 단어입니다.");
			return;
		}
		else {
			index = wordList.indexOf(tmpWord);
		}
		wordList.get(index).printWord();
		System.out.println("수정할 뜻 번호 : ");
		int num = scan.nextInt();
		scan.nextLine();
		System.out.println("뜻 수정 : ");
		String mean = scan.nextLine();
		System.out.println("품사 수정 : ");
		String wordClass = scan.next();
		wordList.get(index).mean.remove(num-1);
		Means tmpMean = new Means(wordClass,mean);
		wordList.get(index).mean.add(tmpMean);
		wordList.get(index).printWord();
	}

	private void deleteMean() {
		int index = -1;
		System.out.println("뜻 수정할 단어 : ");
		String word = scan.next();
		Word tmpWord = new Word(word);
		if(!wordList.contains(tmpWord)) {
			System.out.println("등록 되지 않은 단어입니다.");
			return;
		}
		else {
			index = wordList.indexOf(tmpWord);
		}
		wordList.get(index).printWord();
		System.out.println("삭제할 뜻 번호 : ");
		int num = scan.nextInt();
		wordList.get(index).mean.remove(num-1);
		wordList.get(index).printWord();
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
		}while(submenu != 4);
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
		List<Means> means = new ArrayList<Means>();
		System.out.print("단어 입력 : ");
		String word = scan.next();
		//word 클래스의 새로운 인스턴스를 만들고 거기에 입력값을 저장
		Word tmpWord = new Word(word);
		if(wordList.contains(tmpWord)) {
			System.out.println("이미 등록된 단어입니다.");
		}
		scan.nextLine();
		//의미 입력
		System.out.print(word + "의미 입력 : ");
		String tmpMean = scan.nextLine();
		//품사 입력
		System.out.print(word + "품사 입력 : ");
		String tmpClass = scan.next();
		Means tmp = new Means(tmpMean, tmpClass);
		means.add(tmp);
		Word tmpword = new Word(word);
		tmpword.setMean(means);
		wordList.add(tmpword);
		tmpword.printWord();
	}
	
	private void updateWord() {
		//초기값 false로 하기 위해서
		int index = -1;
		Word tmpWord = new Word(null);
		if(wordList.size() == 0) {
			System.out.println("아직 등록된 단어가 없습니다.");
			return;
		}
		System.out.print("수정할 단어 입력 : ");
		String word = scan.next();
		tmpWord.setWord(word);
		if(wordList.contains(tmpWord)) {
			index = wordList.indexOf(tmpWord);
		}
		else {
			System.out.println("등록 되지 않은 단어입니다.");
			return;
		}
		
		System.out.print(word + " 수정 : ");
		word = scan.next();
		wordList.get(index).setWord(word);
		wordList.get(index).printWord();

		}
	
	private void deleteWord() {
		int index = -1;
		Word tmpWord = new Word(null);
		if(wordList.size() == 0) {
			System.out.println("아직 등록된 단어가 없습니다.");
			return;
		}
		System.out.println("삭제할 단어 : ");
		String word = scan.next();
		tmpWord.setWord(word);
		if(wordList.contains(tmpWord)) {
			index = wordList.indexOf(tmpWord);
		}
		else {
			System.out.println("등록 되지 않은 단어입니다.");
			return;
		}
		System.out.print("삭제 되었습니다 : ");
		wordList.get(index).printWord();
		wordList.remove(index);
	}

}