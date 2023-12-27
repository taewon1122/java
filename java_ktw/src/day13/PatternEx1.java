package day13;

import java.util.regex.Pattern;

public class PatternEx1 {
	/* 문자열이 영문 5~8자리인 경우를 확인하는 정규표현식을 작성하세요.
		^[a-zA-Z]{5,8}$
		
		아이디는 영문 숫자로 구성되어있고, 8~13자인 경우를
		확인하는 정규표현식을 작성하세요.
		^[a-zA-Z\d]{8,13}$
		^\w{8,13}$
		
		url인지 아닌지 판별하기 위해 문자열의 시작이 https 또는 http가 맞는지 확인하는
		정규표현식을 작성하세요
		^[http,https]+
		^https?://[a-zA-Z0-9\.]+$

	 *
	 */
	
	public static void main(String[] args) {
		//Pattern 클래스를 이용하여 문자열이 정규표현식에 맞는지 확인 예제
		String str = "abcd";
		String regex = "^[a-zA-Z]{3}$"; //영문자이고 3자
		if(Pattern.matches(regex, str)) {
			System.out.println("영문자이고 3자입니다.");
		}else {
			System.out.println("영문자가 아니거나 3자가 아닙니다.");
		}
	}
		

}
