package week2.day1;

import java.util.Arrays;

public class MissingelementinArray {

	public static void main(String[] args) {
		int data [] = {1,2,3,4,7,6,8};
		Arrays.sort(data);
		System.out.println("The missing number is");
		
		for (int i = data[0]; i < data.length; i++) {
			
			if (data[i-1]!=i) {
				System.out.println(i);
				break;
			}
			
		}
	}
	

}
