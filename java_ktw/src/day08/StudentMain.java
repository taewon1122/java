package day08;

import java.util.Scanner;

import day08.access2.StudentSample;

public class StudentMain {

	public static void main(String[] args) {
		/*
		//학생 1명의 정보를 저장하는 인스턴스를 생성해보세요.
		Student std = new Student();
		//1학년 1반 1번 홍길동
		
		std.grade = 1;
		std.classNum = 1;
		std.num = 1;
		std.name = "홍길동";
		std.printInfo();
		//국어 : 90, 영어 : 100, 수학 : 80
		std.setKor(90);//std.kor = 90;
		std.setEng(100);//std.eng = 100;
		std.setMath(80);//std.math = 80;
		std.printScore();
		*/
		
		/*
		StudentSample s1 = new StudentSample();
		s1.setName("배영걸");
		s1.setAge(35);
		
		StudentSample s2 = new StudentSample();
		s2.setName("김수현");
		s2.setAge(32);
		
		StudentSample s3 = new StudentSample();
		s3.setName("김태원");
		s3.setAge(27);
		s3.setSex("남자");
		
		System.out.println("s1의 이름:"+s1.getName());
		System.out.println("s1의 나이:"+s1.getAge());
		System.out.println("s2의 이름:"+s2.getName());
		System.out.println("s2의 나이:"+s2.getAge());
		System.out.println("s3의 이름:"+s3.getName());
		System.out.println("s3의 나이:"+s3.getAge());
		System.out.println("s3의 성별:"+s3.getSex());
		
		*/
		
		/*
		StudentSample s1 = new StudentSample();
		System.out.println("s1의 이름:"+s1.getName());
		s1.setName("김태원");
		
		System.out.println("s1의 이름:"+s1.getName());
		*/
		/*
		StudentSample s2 = new StudentSample("배영걸", 35, "남자");
		System.out.println("s2의 이름:"+s2.getName()+s2.getAge()+s2.getSex());
		s2.setName("김태원");
		s2.setAge(27);
		s2.setSex("남ㅈ");
		System.out.println("s2의 이름:"+s2.getName()+s2.getAge()+s2.getSex());
		
		int num = 1;
		switch(num) {
			case 1:
				System.out.println("1번출력");
				break;
			case 2:
				System.out.println("2번출력");
				break;
			default:
				
		}
		*/
		/*
		for(int i=0; i<10; i++) {
			
			if(i%2 == 1) { // 홀수일때
				break;
			}
			System.out.println("짝수:"+i);
			
		}
		
		System.out.println("끝");
		*/
		
		for(int i=0; i<5; i++) {
			
			if(i%2 == 1 ) { //홀수이면
				continue;
			}
			
			System.out.print(i+"열:");
			
			for(int j=0; j<5; j++) {
				
				if(j == 3) {
					continue;
				}
				System.out.print(j + " ");
				
			}
			
			System.out.println("");
		}
		
		
	}

}
