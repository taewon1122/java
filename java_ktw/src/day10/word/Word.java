package day10.word;

import java.util.Scanner;

import day09.board.Board;

public class Word {
	private String word, meaning;
	static Scanner scan = new Scanner(System.in);
	
	
	public String getKor() {
		return meaning;
	}
	public void setKor(String meaning) {
		this.meaning = meaning;
	}
	public String getEng() {
		return word;
	}
	public void setEng(String word) {
		this.word = word;
	}
	
	public void printWordList() {
		System.out.println(word);
	}
	
	
	
	//단어 뜻 출력해주는 메서드
	//void
	//wordMean
	public void printWord() {
		System.out.println("word" + " : " + "meaning");
	}
	//뜻 수정해주면 뜻 멤버변수에 저장하는 메서드
	public void update(String meaning) {
		this.meaning = meaning;
	}
	//단어랑 뜻 멤버변수에 저장하는 생성ㅇ자
	public Word(String word, String meaning) {
		this.word = word;
		this.meaning = meaning;
	}
	public boolean equals(String word) {
		return this.word.equals(word);
	}
	
}


