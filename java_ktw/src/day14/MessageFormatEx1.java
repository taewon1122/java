package day14;

import java.text.MessageFormat;

public class MessageFormatEx1 {

	public static void main(String[] args) {
		int num1 = 1, num2 = 2;
		
		String str1 = "num1 = " + num1 + ", num2 = " + num2;
		System.out.println(str1);
		
		//MessageFormat 클래스를 이용해야함
		String pattern = "num1 = {0}, num2 = {1}";
		String str2 = MessageFormat.format(pattern, num1, num2);
		System.out.println(str2);
		
	}

}
