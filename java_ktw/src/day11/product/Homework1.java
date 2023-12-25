package day11.product;

public class Homework1 {
	String name;
	int studentnum;
	int classnum;
	
	String subject;
	int score;
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentnum() {
		return studentnum;
	}
	public void setStudentnum(int studentnum) {
		this.studentnum = studentnum;
	}
	public int getClassnum() {
		return classnum;
	}
	public void setClassnum(int classnum) {
		this.classnum = classnum;
	}
	
	public void updateInformation(String name1, int studentNum1, int classNum1) {
		name = name1;
		studentnum = studentNum1;
		classnum = classNum1;
		
		}
	
	public void printInfo() {
		System.out.println("이름 : " + name + ", 학번 : " + studentnum + ", 반 : " + classnum);
	}
	
	public Homework1(String name, int studentNum, int classNum){
		this.name = name;
		this.studentnum = studentNum;
		this.classnum = classNum;
	}
	
	public Homework1(String subject, int score){
		this.subject = subject;
		this.score = score;
	}
}