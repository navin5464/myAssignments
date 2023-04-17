package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicates2 {

	public static void main(String[] args) {
		String companyName = "google";
		char[] ch = companyName.toCharArray();
		Set<Character> che = new LinkedHashSet<Character>();
	for (Character c : ch) {
		che.add(c);
		
	}
		System.out.println(che);	
		}
	}


