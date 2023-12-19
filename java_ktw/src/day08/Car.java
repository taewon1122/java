package day08;

public class Car {
	//- 정보 : 멤버변수 -> 추상화를 통해서 어떻게 표현할지 고민해야함 방법이 다양하기때문
	//- 무게 : 단위는 톤으로, 브랜드, 분류, 색상, 바퀴 종류, 차명, 년식
	double weight;
	String brand;
	//0: 소형, 1: 중형 2: 대형, 3: 화물, 4:세단 int로도 할 수 있다. 하기나름
	String category;
	//0xff0000
	//int color;
	String color;
	//바퀴가 여러개라서 배열로
	String [] tires;
	String carname;
	int year;
	boolean power; //시동 boolean 초기값 false로 되어있으므로 따로 선언 안해줘도 됨
	int speed; //현재 속력 = 속도계기판
	boolean leftLight; //좌측 깜빡이 처음엔 꺼져있으니까 초기값 false
	boolean rightLight; //우측 깜빡이
	//- 기능 : 메서드
	//- 가속(엑셀을 밟음), 감속(브레이크를 밟음), 시동을 켜기/끄기
	//- 좌측 우측 깜짝이를 켜기/ 끄지
	
	//시동을 켜기/끄기 버튼이 따로있다면 각각 메서드를 만드는게 맞음. 같은 버튼으로 켜고 끈다면 하나의 기능으로 통합
	//시동이 꺼져있으면 켜짐, 시동이 켜져있으면 꺼짐.
	//멤버변수가 알고있는 정보 = false라고 되어있기 때문에 매개변수를 넘겨줄 필요 없음.
	public void turn() {
		power = !power;
		if(power) {
			System.out.println("시동이 켜졌습니다.");
		}else {
			System.out.println("시동이 꺼졌습니다.");
		}
	}
	//가속
	//speedUp이 실행됐다면 이미 밟고있다는뜻.밟는 강도를 신경쓰지 않기때문에 매개변수가 필요없음.
	//계기판에 속력이 나오고있기때문에 다시 알려줄 필요가 없음
	public void speedUp() {
		speed++;
	}
	//감속한다.
	public void speedDown() {
		speed--;
	}
	//좌측|우측 깜빡이 켜기/끄기, 위:우측 1, 가운데 0 , 아래:좌측 -1
	//내정보를 단순히 바꾸면 된다 == void
	public void turnLight(int direction) {
		switch(direction) {
		case 1:		rightLight = true; leftLight = false; break;
		case -1:	rightLight = false; leftLight = true; break;
		case 0:		rightLight = false; leftLight = false; break;
		}
	}
	
	//자동차 현재 상태를 출력하는 메서드
	public void print() {
		System.out.println("---------------------");
		System.out.println("시동 : " + power);
		System.out.println("속력 : " + speed);
		System.out.println("좌깜 : " + leftLight);
		System.out.println("우깜 : " + rightLight);
		System.out.println("---------------------");
	}
}


