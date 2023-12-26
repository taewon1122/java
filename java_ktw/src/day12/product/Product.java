package day12.product;

import java.util.Scanner;

public abstract class Product {
	//공통 : 브랜드, 제품코드, 제품명
	String brand, code, name;
	
	public Product(String brand, String code, String name) {
		this.brand = brand;
		this.code = code;
		this.name = name;
	}
	
	public abstract void print();
	
}
