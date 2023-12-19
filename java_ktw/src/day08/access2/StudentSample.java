package day08.access2;

/**
 * 
 */
public class StudentSample {
	private String name;
	private int age;
	private String sex;
	
	public StudentSample() {
	}
	
	public StudentSample(String name) {
		this.name = name;
	}
	
	public StudentSample(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
}
