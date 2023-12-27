package day11.product;

public class HomeworkEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student[] stds = new Student[5];
	
	stds[0] = new Student(1, 1, 1, "홍길동");
	stds[1] = new Student(1, 1, 2, "임꺽정");

	stds[0].insertSubject("국어", 100);
	stds[0].insertSubject("영어",50);
	stds[1].insertSubject("수학",90);
	stds[1].insertSubject("수학", 0);
	
	stds[0].print();
	stds[1].print();
	
	stds[0].insertSubject("국어", 100);
	stds[0].insertSubject("영어",50);
	
	}

}
