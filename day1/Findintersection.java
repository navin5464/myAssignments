package week2.day1;

public class Findintersection {

	public static void main(String[] args) {
		int data1[]= {3,2,11,4,6,7};
		int data2[]= {1,2,8,4,9,7,4};
		System.out.println("INTERSECTION VALUES BETWEEN 2 is");
		
		for (int i = 0; i < data1.length; i++) {
			for (int j = 0; j < data2.length; j++) {
				if (data1[i]==data2[j]) {
					System.out.println(data1[j]);
				}
			}
		}
	}

}
