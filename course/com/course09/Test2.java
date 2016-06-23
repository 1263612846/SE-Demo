package com.course09;

public class Test2 {
	public static void main(String[] args) {
		Socket s1 = new Refrigerator();
		Socket s2 = new TV();
		Socket s3 = new Fan();
		socket(s1);
		socket(s2);
		socket(s3);
	}

	public static void socket(Socket s) {
		s.supply();
	}

}
