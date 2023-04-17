package week3.day3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String space = "";
		String[] sp = text.split(" ");
		Set <String> str = new LinkedHashSet <String>();
		for (String i : sp) {
			str.add(i);
			
		}
		List <String> list = new ArrayList<String>(str);
		for (String j : list) {
			space=space+" "+j;
		}
          System.out.println(space);
	}

}
