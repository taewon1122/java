package day17;

import lombok.AllArgsConstructor;
import lombok.Data;

public class SynchronizedEx2 {
	
	public static void main(String[] args) {
		//홍길동의 통장을 홍길동과 고길동이 쓴다
		BankBook bb = new BankBook(0, "홍길동");
		Customer c1 = new Customer(bb, "홍길동");
		Customer c2 = new Customer(bb, "고길동");
		
		c1.start();
		c2.start();
	}
}

@AllArgsConstructor
class Customer2 extends Thread{
	private BankBook bankBook;
	private String name;
	
	@Override
	public void run() {
		System.out.println("입금 중 : " + name);
		bankBook.deposit(10000);
	}
}

@Data
@AllArgsConstructor
class BankBook2 {
	private int balance;
	private String name;
	
	//synchronized 내가 사용하는 동안 남이 못쓰게 한다.
	public synchronized void deposit(int money) {
		//홍길동이 0원에서 10000원
		//고길동이 10000원에서 20000원
		this.balance += money;
		
		try {
			//2초 동안 현재쓰레드를 일시중지
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("이름 : " + this.name);
		System.out.println("잔액 : " + this.balance);
	}
}