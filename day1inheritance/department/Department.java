package org.department;

import org.college.College;

public class Department extends College {
	
	public void deptname()
	{
		System.out.println("Automobile");
	}

	public static void main(String[] args) {
		Department dept = new Department();
             dept.collegename();
             dept.collegecode();
             dept.collegerank();
             dept.deptname();
	}

}
