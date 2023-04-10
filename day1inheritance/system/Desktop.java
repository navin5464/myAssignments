package org.system;

public class Desktop extends Computer{
   
	public void desktopsize()
	{
		System.out.println("42 inch display");
	}
	public static void main(String[] args) {
		Desktop dt = new Desktop();
		dt.computermodel();
		dt.desktopsize();
	}

}
