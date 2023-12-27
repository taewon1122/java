package day13;

public interface Program {
	//int num1 = 10; //변수 앞에 final static이 자동으로 추가 ==> 상수밖에 사용할 수 없기 때문. 상수는 선언과 동시에 초기화해줘야함.
	//final static int num2 = 20;
	
	//메서드 앞에 public abstract가 자동으로 추가
	void printMenu(); //메뉴 출력
	public void runMenu(int menu); //메뉴 실행
	public abstract void printExit(); //프로그램 종료
	void run(); //프로그램 실행
	default void test() {}
}


abstract class TestA{
	//클래스에서는 final static을 생략하면 멤버변수, 붙여주면 상수
	int num1 = 20; //멤버변수
	final static int num2 = 20;
	//클래스에서는 추상 메서드에 abstract가 자동으로 추가되지 않음
	public abstract void printMenu();
}