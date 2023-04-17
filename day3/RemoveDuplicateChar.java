package week3.day3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String name="PayPal India";
		String nm="";
		char[] cs = name.toCharArray();
		Set<Character> Char =new LinkedHashSet<Character>();
		Set<Character> dupCharSet =new LinkedHashSet<Character>();
		for (Character i : cs) {
			if (!Char.add(i)) {
				dupCharSet.add(i);
			}
		}
		for (Character j : dupCharSet) {
			nm=nm+j;
			
		}
		System.out.println(nm);
	}

}
