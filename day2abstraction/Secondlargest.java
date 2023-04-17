package week3.day2abstraction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Secondlargest {

	public static void main(String[] args) {
		List <Integer> a1 = new ArrayList <Integer>();
		a1.add(3);
		a1.add(2);
		a1.add(11);
		a1.add(4);
		a1.add(6);
		a1.add(7);
		
		int size = a1.size();
		Collections.sort(a1);	
		for (int i = 0; i < size; i++) {		
		}
		System.out.println("second largest number : "+a1.get(size-2));

	}

}
