package org.college;

public class College {

	public void collegename()
	{
		System.out.println("crescent college of engg");
	}
	public void collegecode()
	{
		System.out.println("code is 123456");
	}
	public void collegerank()
	{
		System.out.println("rank is 2");
	}
	public static void main(String[] args) {
		College col = new College();
           col.collegename();
           col.collegecode();
           col.collegerank();
	}

}
