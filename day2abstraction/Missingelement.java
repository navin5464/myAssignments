package week3.day2abstraction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Missingelement {

	public static void main(String[] args) {

		List <Integer> a1 = new ArrayList <Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(7);
		a1.add(6);
		a1.add(8);
		
		int size = a1.size();
        Collections.sort(a1);
        
        for (int i = 0; i < size; i++) {
        	int j = i+1;
        	if (a1.get(i)!=j) {
				System.out.println("Missing element ;" +j);
				break;
			}
			
		}
       
	}

}
