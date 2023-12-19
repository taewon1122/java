package day08;

public class StudentMain2 {

	public static void main(String[] args) {
		//5명의 학생을 저장하기 위한 배열을 생성하세요.
		//new연산자로 5개 배열을 만들고 연결시켜준다. 근데 그 배열에는 null. 값이없는 배열 5개. 올예정인데 없기때문에 예외발생
		Student [] stds = new Student[5];
		
		//학생 5명의 학생 정보를 출력하는 코드를 작성하세요.
		//근데 값이 없는데 출력을 하라고하니 예외. 발생.  
		//for문안에서 생성해주면 stds의 [i]인덱스에 Student의 주소값이 저장되어서 값을 출력할 수 있음 
		for(int i = 0; i < stds.length ; i++) {
			stds[i] = new Student(); // stds[0] == new student ...
			stds[i].printInfo();
		}
		
	}

}
