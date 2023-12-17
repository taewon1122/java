package day05_test;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int min = 1, max = 3;
	int arr[] = new int[3];
	int count = 0;
	
	while(count < 3) {
		int r = (int)(Math.random() * (max + min +1) + min);
		
		boolean duplicated = false;
		for(int i = 0; i < count ; i++) {
			if(arr[i] == r) {
				duplicated = true;
				break;
			}
		}
		if(!duplicated) {
			arr[count] = r;
			count++;
		}
	}
	for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	}

}
