package week2.day1;

import java.util.Arrays;

public class FindsecondLargest {

	public static void main(String[] args) {
		int data[]= {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println("second largest number is" +data[data.length-2]);
	}

}
