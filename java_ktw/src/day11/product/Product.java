package day11.product;

public class Product {
	String product;
	int price;
	int number;
	int count;
	
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * 제품이랑 재고 출력
	 */
	public void printList(){
		System.out.println(product + " " + number);
	}
	
	/**
	 * 판매시 갯수 빼주는 기능
	 * @param number
	 */
	public void sale(int number) {
		this.number -= number;
	}
	
	/**
	 * 이미 있는 제품에 갯수 더해주는 기능
	 * @param input
	 */
	public void inPlus(int input){
		this.number += input;
	}
	
	public Product(String product, int number){
		this.product = product;
		this.number = number;
	}
	
}
	
