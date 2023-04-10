package week3.day1inheritance;

public class Calculator {
	
	public int add(int a, int b) {
		return a+b;
		}
	public void add() {
		int a=50,b,c=51;
		System.out.println(b=a+c);
	}
	public void mul() {
		int a = 10;
		double b = 9;
		System.out.println(a*b);
	}
	public double mul(double a, double b) {
	return a*b;
	}

	public static void main(String[] args) {
		Calculator ca = new Calculator();
           ca.add();
           System.out.println(ca.add(40, 41));
           ca.mul();
           System.out.println(ca.mul(10, 5));
	}

}
