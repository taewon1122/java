package day13;

public class StringEx1 {

	public static void main(String[] args) {
		String str = "abcde";
		
		System.out.println("1.-----------------");
		//0번지에 있는 문자를 반환
		System.out.println(str.charAt(0));
		//두 문자열이 같은지를 반환
		System.out.println(str.equals("abc"));
		System.out.println(str.equals("abcde"));
		
		System.out.println();
		System.out.println("2.-----------------");
		//있으면 시작번지를 반환, 없으면 -1을 반환함
		System.out.println(str.indexOf("cdf"));
		//있으면 있다, 없으면 없다를 반환
		System.out.println(str.contains("cdf"));
		
		System.out.println();
		System.out.println("3.-----------------");
		//문자열의 길이를 반환
		System.out.println(str.length());
		
		System.out.println();
		System.out.println("4.-----------------");
		//문자열을 바꿔서 새 문자열을 반환(cd 자리에 aa로 수정)
		String str2 = str.replace("cd","aa");
		//기존 문자열은 안 바뀜
		System.out.println(str);
		System.out.println(str2);
		
		System.out.println();
		System.out.println("5.-----------------");
		//부분 문자열을 반환(1번지부터 끝까지)
		//1번지부터 3번지 앞까지(2번지까지)
		String str3 = str.substring(1, 3);
		//기존 문자열은 안 바뀜
		System.out.println(str);
		System.out.println(str3);
		
		System.out.println();
		System.out.println("6.-----------------");
		//대문자로
		String str4 = str.toUpperCase();
		System.out.println(str);
		System.out.println(str4);
		//소문자로
		String str5 = str.toLowerCase();
		System.out.println(str4);
		System.out.println(str5);
		
		
		System.out.println();
		System.out.println("7.-----------------");
		String str6 = "\n\nabc\tedf\t\t";
		System.out.println(str6);
		String str7 = str6.trim();
		System.out.println(str7);
		
		System.out.println();
		System.out.println("8.-----------------");
		//문자열에서 문자열들을 추출해서 배열로 만들어 줌
		String fruits = "사과,배,오렌지";
		String []fruitArray = fruits.split(",");
		System.out.println(fruits);
		for(String tmp : fruitArray) {
			System.out.println(tmp);
		}
	}

}
