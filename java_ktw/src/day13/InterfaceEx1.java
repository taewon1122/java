package day13;

public class InterfaceEx1 {

	public static void main(String[] args) {
		//스태틱 메서드들은 인스턴스 없이 호출 가능
		System.out.println(KiaCar.brand);
		Printer.print();
	}

}

class KiaCar{
	public static String brand = "기아";
}

interface Printer{
	//static이 붙은 메서드는 반드시 구현 해야함.
	static void print() {
		System.out.println("프린터입니다.");
	}
	//static이 안 붙은 메서드는 추상메서드로 만들어서 구현하지 않거나
	void test();
	//default 메서드로 만들어서 구현
	default void test2() {}
}