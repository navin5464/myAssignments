package week3.day3;

import java.util.HashSet;
import java.util.Set;

public class RemoveduplicatesSET {

	public static void main(String[] args) {
		int [] num = {3,5,7,2,5,7,9,2,1,54,8,4,6,4,8};
		
		Set<Integer> A = new HashSet<Integer>();
		
		for (Integer i : num) {
			boolean add = A.add(i);
			if (!add) {
				A.add(i);
			}
		}
		System.out.println(A);
		
	}

}
