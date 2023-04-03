package week1.day2;

public class FibonacciAssig {

	public static void main(String[] args) {
		
		int range=8;
		int firstnumber=0;
		int secondnumber=1;
		int sum;
		
	for (int i = 1; i < range; i++) {
			
			System.out.println(firstnumber);
			sum=firstnumber+secondnumber;
			firstnumber=secondnumber;
			secondnumber=sum;
		}
		

	}

}
