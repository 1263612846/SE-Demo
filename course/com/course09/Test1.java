package com.course09;

public class Test1 {

	public static void main(String[] args) {
		Staff s1 = new Manager();
		Staff s2 = new Salesman();
		Staff s3 = new Employee();
		staff(s1);
		staff(s2);
		staff(s3);
	}
	
	public static void staff(Staff s) {
		s.saraly();
	}

}
