package org.student;

public class Axisbank extends Bankinfo {
 
	public void deposit()
	{
		System.out.println("deposit amount in Axis bank is 10lakhs");
	}
	public static void main(String[] args) {
		Axisbank Ab = new Axisbank();
		Ab.deposit();
		Ab.saving();
		Ab.fixed();

	}

}
