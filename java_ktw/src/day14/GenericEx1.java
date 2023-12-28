package day14;

import lombok.Data;

public class GenericEx1 {

	public static void main(String[] args) {
		//<...>가 있다면 제네릭 클래스
		Array1<Integer> array = new Array1<Integer>(5);
		
		for(int i = 0; i<5; i++) {
			array.add(i, i+1);
		}
		for(int i = 0; i<5; i++) {
			System.out.print(array.get(i));
		}
		
		System.out.println();
		
		Array1<Character> array2 = new Array1<Character>(10);
		for(int i = 0; i<10; i++) {
			array2.add(i, (char)('a'+i));
		}for(int i = 0; i<10; i++) {
			System.out.print(array2.get(i) + " ");
		}
	}

}
//멤버변수 또는 파라미터 타입을 원하는 타입으로 변경
//제네릭 클래스 -> 형변환 하지 않아도 됨
//<T> T는 고정된 문자는 아님.

//배열 클래스 -> 하나의 클래스로 여러가지 타입으로 사용가능
class Array1<T>{
	private T []array;
	
	public Array1() {
		this(10);
	}
	
	public Array1(int size) {
		array = (T[])new Object[size];
	}
	
	//Index번지에 요소를 추가하는 메서드
	public boolean add(int index, T t) {
		if(array.length <= index) {
			return false;
		}
		array[index] = t;
		return true;
	}
	
	public T get(int index) {
		if(array.length <= index) {
			return null;
		}
		return array[index];
	}
}

