package day12;

public class PolymrophiscmEx2 {

	public static void main(String[] args) {
		/* 다형성 예제
		 * 1. 매개변수의 다형성
		 * 
		 * 상속을 하는 이유
		 * 1. 코드(의 중복)를 줄일 수 있다.
		 * 2. 다형성을 통해서 기능(메서드)를 쉽게 만들어 호출할 수 있다.
		 * 3. 프레임워크(기능들의 틀을 갖춰놓은 코드)에서 특정 기능 구현을 위해 지정된 클래스를 상속받아야
		 * 실행되도록 구현
		 * 
		 * -extends 키워드 이용
		 * -언제 상속이 가능?
		 * A is B, A는 B이다가 성립할 때, B 라 부모, A가 자식
		 * 
		 * super
		 * 부모 인스턴스를 가르킴
		 * super()
		 * 부모 생성자
		 * 
		 * 메서드 오버라이딩
		 * 부모 메서드를 재정의함
		 * 
		 * 클래스 형변환
		 * 업캐스팅 : 자식 인스턴스를 부모 인스턴스에 저장
		 * 다운캐스닝 : 부모 인스턴스를 자식 인스턴스에 저장(조건부로 가능)
		 * 
		 * instanceof 연산자 : 클래스 형변환이 가능한지를 확인하는 연산자
		 * 
		 * 다형성 ; 매개변수나 인스턴스를 이용할 때 부모 인스턴스를 이용하여 효율적으로 코딩하는 방법
		 * 매개변수 다형성
		 * 포함 다형성
		 * 
		 */
		Remocon r = new Remocon();
		Tv tv = new Tv();
		AirConditioner aircon = new AirConditioner();
		Projector projector = new Projector();
		r.turnOn(tv);
		r.turnOn(aircon);
		r.turnOn(projector);
	}

}

class Remocon{
	/*
	void turnOn(TV target) {
		System.out.println("제품이 켜졌ㅅ브니다.");
	}
	void turnOn(AirConditioner target) {
		System.out.println("제품이 켜졌습니다.");
	}*/
	/*  매개변수의 다형성을 이용하여 turnOn 메서드를
	 * 	1개만 생성
	 */
	void turnOn(ElectronicProduct target) {
		if(target instanceof Tv) {
			System.out.println("TV ");
		}else if(target instanceof AirConditioner) {
			System.out.println("에어컨 ");
		}else if (target instanceof Projector) {
			System.out.println("빔 프로젝터 ");
		}else {
			System.out.println("전자 ");
		}
		System.out.println("제품이 켜졌습니다.");			
	}
	
}
class ElectronicProduct{
	
}

class Tv extends ElectronicProduct{
	
}

class AirConditioner extends ElectronicProduct{
	
}

class Projector extends ElectronicProduct{
	
}