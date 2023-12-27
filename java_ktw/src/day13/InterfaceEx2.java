package day13;

public class InterfaceEx2 {

	public static void main(String[] args) {
		print(new Product());
		print(new Student());
	}

	public static void print(Print p) {
		p.print();
	}
}

//인터페이스
//부모가 같지 않지만 하나의 인터페이스로 형변환이 불가능한 서로다른 클래스를 같은 형식으로 출력할 수 있다.
interface Print{
	void print();
}

//구현
class Product implements Print{
	
	String name = "TV";
	String code = "TV001";
	
	@Override
	public void print() {
		System.out.println("제품명 : " + name);
		System.out.println("제품코드 : " + code);
	}
	
}

//구현
class Student implements Print{

	@Override
	public void print() {
		int grade = 1;
		int classNum = 1;
		int num = 1;
		String name = "홍길동";
		
		System.out.println("학년 : " + grade + ", 반 : " + classNum + ", 번호 : " + num + ", 이름 : " + name);
	}
	
}