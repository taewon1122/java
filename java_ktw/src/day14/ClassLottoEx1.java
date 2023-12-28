package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassLottoEx1 {

	public static void main(String[] args) {
		/*	랜덤으로 당첨 번호를 생성하고 사용자가 로또 번호를 입려하면 등수를 알려주는 코드를 작성하세요
		 * 단, 컬렉션을 이용
		 * 당첨번호 : 6개, 보너스 : 1ㅐ
		 * 사용자 : 6개
		 */
		
		//랜덤생성 번호 받아넣을 list
		ArrayList<Integer> list = new ArrayList<Integer>();
		//사용자 list
		ArrayList<Integer> user = new ArrayList<Integer>();
		//bonus 저장할 int
		int bonus;
		
		//min = 1, max = 45
		int min = 1, max = 10;
		//int count = 0; -> 일치하는 개수 계산용
		
		
		
		//컴퓨터 랜덤 번호 생성 7개가 될때까지
		while(list.size() < 7) {
			//랜덤숫자 만드는 변수 선언
			int r = (int)(Math.random()*(max - min + 1) + min);
			for(int i = 0; i < list.size(); i++) {
				if(!list.contains(i)) {
					continue;
				}
			}
			
			list.add(r);
		}
		
		//보너스번호 생성
		List<Integer> lotto2 = new ArrayList<Integer>();
		lotto2.addAll(list);
		bonus = lotto2.remove(list.size()-1);
		
		System.out.println(lotto2 + ", 보너스 : "+ bonus);
		
		
		//사용자 당첨번호 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("중복되지 않은 6개 번호 입력 : ");
		while(user.size()<6) {
			int tmp = scan.nextInt();
			user.add(tmp);
		}
		
		int count = 0;
		for(int tmp : user) {
			if(lotto2.contains(user)) {
				count++;
			}
		}
		
		//컴퓨터 사용자 숫자 맞춰보며 등수 출력
		switch(count) {
		case 5:
			System.out.println("1등 입니다.");
			break;
		case 4:
			//user리스트에 bonus와 같은게 있다면 rank = 2, 없다면 rank = 3.
			int rank = user.contains(bonus) ? 2 : 3;
			System.out.println(rank + "등 입니다.");
			break;
		case 3:
			System.out.println("4등 입니다.");
			break;
		case 2:
			System.out.println("5등 입니다.");
			break;
			
		}
		
		
		
		
	}

}
