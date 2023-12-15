package day06;

import java.util.Scanner;

public class AlphabetCountEx1 {

	public static void main(String[] args) {
		
		/*단어를 입력받아 단어 각 알파벳이 몇번 나왔는지 출력하는 코드
		 * 입력 : apple
		 * a : 1
		 * e : 1
		 * l : 1
		 * p : 2
		
		
		//스캐너
		
		//입력(user) 배열 만들기
		String str = "Hello";
	
		System.out.println("단어 입력 : ");
		//반복문으로 문자열의 길이만큼 반복
		for(int i = 0 ;i < str.length() ;i++ ) {
			//단어 입력 => 문자열 입력
			str = scan.next();
			//입력배열에 저장된 알파벳 갯수 출력배열에 저장		
		}
	
		//출력(반복문)
		for(int i = 0 ;i < str.length() ;i++ ) {
			//출력배열에 저장된 알파벳
			System.out.println(str.charAt(i) + " ; " + str.length());
			//출력
		}
		 */
		//단어를 입력 => 문자열을 입력
		Scanner scan = new Scanner(System.in);
		//scan.next(); -> 공백을 제거한 단어만 나옴
		System.out.println(" 단어 입력 : ");
		String str = scan.next();
		int arr[] = new int[26];

		//반복문으로 문자열의 길이만큼 반복
		for(int i = 0; i < str.length(); i++) {
			//문자열의 각 문자를 가져옴
			char ch = str.charAt(i);
			//가져온 문자의 배열 번지에 숫자를 증가
			//가져온 문자가 a이면 0번지에 있는 숫자를 \0증가, b이면 1번지에 있는 숫자를 즏가
			arr[ch-'a']++;
		}
		//반복문으로 배열의 크기만큼(26개) 반복
		for(int i = 0 ;i < arr.length; i++) {
			if(arr[i] != 0) {
				//정수 + 문자 = 정수 -> 형변환 해줘야함
				char ch = (char)('a' + i);
				System.out.println(ch + " : " + arr[i]);
			}
		}
		System.out.println("==============================");
		char ch = 'a';
		for(int count : arr) {
			if(count != 0) {
				System.out.println(ch + " : " + count);				
			}
			ch++;
		}
		scan.close();
	
		
		
		
		
	}

}
