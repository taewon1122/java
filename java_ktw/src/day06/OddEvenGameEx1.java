package day06;

import java.util.Scanner;

public class OddEvenGameEx1 {

	public static void main(String[] args) {
		
		//정수 num가 주어졌을 때 홀수인지 짝수인지 판별하는 예제
		int num = 10;
		int min = 1, max = 100;
		Scanner scan = new Scanner(System.in);
		int totalMoney = 10000; // 게임 시작시 주어지는 금액
		
		//아래 코드를 현재 금액이 0이 될때까지 반복하도록
		//랜덤한 숫자가 게임 할때마다 바껴야하기때문에 num위에서 while로 묶어줘야함
		while(totalMoney != 0) {
			//num가 1~100사이의 랜덤한 수를 생성하는 코드를 작성
			num = (int)(Math.random()*(max - min + 1) + min);
			
			//사용자가 게임에 투입할 금액을 입력하는 코드(1~현재 금액까지)
			
			System.out.print("배팅할 금액을 입력하세요(1~"+totalMoney+") : ");
			int money = scan.nextInt();
			//입력받은 money가 totalMoney보다 크면 totalMoney로 수정
			//money = money > totalMoney ? totalMoney : money;
			//
			if(money > totalMoney) {
				money = totalMoney;
				System.out.println("배팅금액(배팅금액 초과) : " + totalMoney);
			}else {
				System.out.println("배팅금액 : " + money);
			}
			/*
			if(money > totalMoney) {
				System.out.println("현재 금액보다 많이 배팅함");
				break;
			}
			*/

			//사용자가 0또는 1을 입력받는 코드를 작성
			System.out.print("홀(1)/짝(0)? : ");
			int user = scan.nextInt();
			//System.out.println("입력값 : " + user);콘솔창에 떠서
			
			/* if(num % 2 == 0) {
				System.out.println("짝수");
			}else if(num < 0){
				System.out.println("정수입력");
			}else {
				System.out.println("홀수");
			}
			*/
			if(num % 2 == 0) {
				System.out.println(num + "는 짝수");
			}else {
				System.out.println(num + "는 홀수");
			}
			
			//사용자가 입력한 값이 맞았는지 틀렸는지를 출력하는 코드를 작성  -> 내가쓴코드 num % 2 == 0 && user == 0 || num % 2 == 1 && user == 1
			//승이면 배팅금액을 주고(배팅금액을 차감한것이 아니기 때문에.), 패이면 배팅 금액을 차감
			if(user == num % 2) {
				System.out.println("정답");
				totalMoney += money; //totalMoney = totalMoney + money
			}else {
				System.out.println("틀렸음");
				totalMoney -= money;
			}
			System.out.print("현재 금액 : " + totalMoney);
			System.out.println();
		}
		System.out.println("배팅금액이 없음으로 게임을 종료합니다.");
		scan.close();
	}

}
