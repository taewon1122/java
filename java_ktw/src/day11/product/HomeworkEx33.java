package day11.product;

public class HomeworkEx33 {

public static void main(String[] arg) {
	Member mem1 = new Member();
	mem1.print();
	
	System.out.println(mem1.equals("abc", "def"));
	
	Member mem2 = new Member("abc", "def", "abc@navermcom");
	mem2.print();
	System.out.println(mem2.equals("abc","def"));
	}
}

public class Member() {
	//필요한 멤버변수 및 메서드를 정리하고 구현하세요.
	//멤버변수 : 아이디, 비번, 이메일
	public String id, pw, email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//getter setter
	
	//equals : 아이디, 비번이 주어지면 내 정보와 같은지 다른지 알려주는 메서드
	public boolean equals(String id, String pw) {
		if(this.id == null) {
		//	아이디가 없으면	
			return false;
		}
		//비번이 없으면
		if(this.pw == null) {
			return false;			
		}
		//아이디와 비번이 일치하면
		if(this.id.equals(id) && this.equals(pw)) {
			return true;
		}
		return false;
	}
	//생성자 : 기본생성자, 아이디, 비번, 이메일이 필요한 생성자, 아이디, 비번이 필요한 생성자
	public void Member() {}
	
	public void print() {
		System.out.println("아이디 : " + id) ;
		System.out.println("이메일 : " + email) ;
		System.out.println("비번 : " + pw) ;
	}
	
	public Member(String id, String pw, String email) {
		this.id = id;
		this.pw = pw;
		this.email = email;
	}
}

