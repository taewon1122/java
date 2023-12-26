package day12;

public class AbstractEx1 {

	public static void main(String[] args) {
		//추상 클래스 예제
		//AA 추상 클래스는 추상 메서드가 없지만 추상 클래스를 이용하여 인스턴스를 생상할 수 없음
		//추상 클래스의 인스턴스를 만들려면 익명 클래스를 이용하거나
		AA aa1 = new AA(){
		};
		//추상 클래스를 상속받은 일반 클래스를 생성해서 인스턴스를 생성(업캐스팅)
		AA aa2 = new CA();
		DA da1 = new DA();
		da1.print();
	}

}

abstract class AA{
	int num;
}
abstract class AB{
	int num;
	//추상 메서드
	public abstract void print();
}
class CA extends AA{
	
}
//abstract를 class 앞에 붙여 추상클래스로 만들어주거나
class DA extends AB{
	//오버라이딩 해서 재정의해줘야함
	@Override
	public void print() {
		System.out.println("num1 : " + num);
		
	}
	
}