package homework.word;

import java.util.ArrayList;
import java.util.List;

import day18.student.Student;


public class WordManager {
	List<Word> wordList = new ArrayList<Word>();
	List<Means> mean = new ArrayList<Means>();
	
	//단어 있다면? false, 없으면 true
	public boolean insertWord(Word tmpWord) {
		if(wordList.contains(tmpWord)) {
			System.out.println("이미 등록된 단어입니다.");
			return false;
			
		} 
			wordList.add(tmpWord);
			return true;
	}
	
	//뜻 있으면 이미 존재하는 뜻 없으면 추가.
	public boolean insertMean(Means tmp) {
		if(mean.contains(tmp)){
			System.out.println("이미 등록된 의미입니다.");
			return false;
		} 
			mean.add(tmp);
			return true;
	}
	
	//뜻 수정
	//뜻 삭제
	

}
