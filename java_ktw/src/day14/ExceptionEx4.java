package day14;

import lombok.Data;

public class ExceptionEx4 {

	public static void main(String[] args) {

		try {
			test();
		}catch (MyException e) {
			e.print();
			//빨간줄이 떠도 정상 실행되는것임. 어디서 예외가 발생한건지 알려주는 메서드
			e.printStackTrace();
			
		}
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("종료");
		
	}
	public static void test() throws MyException{
		throw new MyException("안녕하세요", "예외 발생");
	}

}

@Data
class MyException extends Exception{
	
	private String title;
	
	public MyException() {}
	
	public MyException(String title, String message) {
		super(message);
		this.title = title;
	}
	
	public void print() {
		System.out.println(title);
		System.out.println(getMessage());
	}
	
}