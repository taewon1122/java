package day14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ClassLottoEx1_1 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		Set<Integer> lotto = new HashSet<Integer>();
		Set<Integer> user = new HashSet<Integer>();
		int bonus;
		int min = 1, max = 10;
		
		//로또 당첨번호 6개를 랜덤으로 생성(중복 X)
		while(lotto.size() < 7) {
			int tmp = (int)(Math.random() * (max - min + 1) + min);
			lotto.add(tmp);
		}
		//보너스 번호를 생성
		List<Integer> lotto2 = new ArrayList<Integer>();
		lotto2.addAll(lotto);
		
		//방법 1
		//bonus = lotto2.get(lotto2.size()-1)
		
		//방법 2 => remove() 값 삭제하고 반환해줌
		bonus = lotto2.remove(lotto2.size() - 1);
		
		System.out.println(lotto2 + ", 보너스 : " + bonus);
		//사용자가 당첨 번호를 입력
		System.out.println("번호(중복되지 않는 6개) : ");
		Scanner scan = new Scanner(System.in);
		while(user.size() < 6) {
			int tmp = scan.nextInt();
			user.add(tmp);
		}
		
		//일치하는 개수 계산
		int count = 0;
		for(int tmp : user) {
			if(lotto2.contains(tmp)) {
				count++;
			}
		}
		//등수를 출력
		switch(count) {
		case 6:
			System.out.println("1등 입니다");
			break;
		case 5:
			int rank = user.contains(bonus) ? 2 : 3;
			System.out.println(rank+"등입니다.");
			break;
		case 4:
			System.out.println("4등 입니다");
			break;
		case 3:
			System.out.println("5등 입니다");
			break;
		default:
			System.out.println("꽝 입니다.");
		}
		
		
	}

}
