package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentname()
	{
		System.out.println("Naveen");
	}
	public void studentdept()
	{
		System.out.println("Mechanical");
	}
	public void studentID()
	{
		System.out.println("102084676");
	}
	public static void main(String[] args) {
		Student std = new Student();
		std.collegename();
		std.collegecode();
		std.collegerank();
		std.deptname();
		std.studentname();
		std.studentdept();
		std.studentID();

	}

}
