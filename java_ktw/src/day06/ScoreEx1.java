package day06;

import java.util.Scanner;

public class ScoreEx1 {

	public static void main(String[] args) {
		/* 다음 기능을 가진 성적 관리 프로그램을 작성하세요
		 * - 1반의 성적을 관리
		 * - 최대 30명
		 * - 성적은 번호순으로 관리
		 * - 성적은 국어, 영어, 수학 성적을 관리
		 * 메뉴
		 * 1.성적수정
		 * 2.성적조회
		 * 3.프로그램 종료
		 * 메뉴 선택 :
		 * 
		 * --성적수정--
		 * 1. 국어
		 * 2. 영어
		 * 3. 수학
		 * 과목 선택 : 
		 * 
		 * 학생 선택 : 3 번호를 선택
		 * 성적 입력 : 100
		 * 
		 * --성적조회--
		 * 1. 과목별조회
		 * 2. 학생별조회
		 * 선택 : 1
		 * --과목별조회--
		 * 1. 국어
		 * 2. 영어
		 * 3. 수학
		 * 과목 선택 : 1
		 * 1번 : 0점
		 * 2번 : 0점
		 * 3번 : 100점
		 * ...
		 * 30번 : 0점
		 * 
		 * --성적조회--
		 * 1. 과목별조회
		 * 2. 학생별조회
		 * 선택 : 2
		 * 선택 : 2
		 * 학생 선택 : 3
		 * 국어 : 100점
		 * 영어 : 0점
		 * 수학 : 0점
		 */
		
		//스캔
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		//학생 배열
		int stu[] = new int[31];
		//성적 배열
		int korScore[] = new int[stu.length];
		int engScore[] = new int[stu.length];
		int mathScore[] = new int[stu.length];
		
		//메뉴 선택 정수
		//과목 선택
		int scoreMenu;
		//조회메뉴
		int scoreMenu2;
		
		
		//문자열 배열
		//String score[] = "1.국어, 2. 영어, 3. 수학";
		do {
			//메뉴 출력
			//--메뉴--
			System.out.println("--메뉴--");
			//1. 성적수정
			System.out.println("1. 성적수정");
			//2. 성적조회
			System.out.println("2. 성적조회");
			//3. 프로그램 종료
			System.out.println("3. 프로그램 종료");
			//메뉴 선택 :
			System.out.print("메뉴 선택 : ");
			//메뉴 선택한다.
			menu = scan.nextInt();
			
			//성적 수정 선택했다면
			switch(menu) {
			case 1:
				//서브메뉴 출력
				System.out.println("성적수정기능입니다.");
				System.out.println("1. 국어");
				System.out.println("2. 영어");
				System.out.println("3. 수학");
				System.out.println("과목 선택 : ");
				//메뉴 선택한다.
				scoreMenu = scan.nextInt();
				//1. 국어 선택후 학생선택  / 1번이다 그럼 국어 1번지에 성적 입력 후 저장
				//if문으로 하니까 계속 1번으로 돌아감
				//국어 선택해서 1-30 다 입력하는게 아니라 선택한 학생 성적만 수정하는거라서
				//switch문으로 해야하는거 같다 for문도 필요 x
				/*
				if(scoreMenu == 1) {
					System.out.println("학생 선택 : ");
					for(int i = 1; i<korScore.length ; i++) {
						//학생 선택
						//이게 for문안에 있어서 자꾸 반복된다
						stu[i] = scan.nextInt();
						//성적 입력
						System.out.print(i + "번 학생" + "국어 성적 입력 : ");
						korScore[i] = scan.nextInt();
						System.out.print(i + "번 학생" + "국어 성적 : " + korScore[i]);
					}
				}
				*/	
				switch(scoreMenu) {
				case 1:
					System.out.print("학생 선택 : ");
					
					break;
				case 2:
					break;
				default :
					
				}
				
				
					break;
				
			case 2:
				System.out.println("성적조회기능입니다.");
				System.out.println("1. 과목별조회");
				System.out.println("2. 학생별조회");
				System.out.println("선택 : ");
				//메뉴 선택한다.
				scoreMenu = scan.nextInt();
				if(scoreMenu == 1) {
					System.out.println("1. 국어");
					System.out.println("2. 영어");
					System.out.println("3. 수학");
					System.out.println("과목 선택 : ");
					scoreMenu2 = scan.nextInt();
					if(scoreMenu2 == 1) {
						for(int i = 1; i<korScore.length ; i++) {
							//국어성적 출력
							System.out.println(i + "번 학생" + "국어 성적 : " + korScore[i]);
						}
					}else if(scoreMenu2 == 2) {
						for(int i = 1; i<engScore.length ; i++) {
							//영어성적 출력
							System.out.println(i + "번 학생" + "영어 성적 : " + engScore[i]);
						}
					}
					
				}
				
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력된 메뉴입니다.");
				
			}
		} while (menu !=3);
		
		scan.close();
	
		
		
		 
		
	
	}

}
