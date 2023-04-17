package week3.day2abstraction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Findintersection {

	public static void main(String[] args) {
		
		List <Integer> a1 = new ArrayList <Integer>();
		a1.add(3);
		a1.add(2);
		a1.add(11);
		a1.add(4);
		a1.add(6);
		a1.add(7);
		List <Integer> a2 = new ArrayList <Integer>();
		a2.add(1);
		a2.add(2);
		a2.add(8);
		a2.add(4);
		a2.add(9);
		a2.add(7);
		
		int size = a1.size();
		int size2 = a2.size();
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size2; j++) {
				if (a1.get(i)==a2.get(j)) {
					System.out.println(a2.get(j));
					
				}
				
			}
			
		}
	}

}
