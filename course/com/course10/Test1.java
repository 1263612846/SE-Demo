package com.course10;

public class Test1 {

	public static void main(String[] args) {
		int i = 0;
		StringBuffer sb = new StringBuffer("a");
		String s = "c";

		Test1 t = new Test1();
		t.test1(i);
		System.out.println(i);
		t.test2(sb);
		System.out.println(sb.toString());
		t.test3(s);
		System.out.println(s);
	}

	public void test1(int i) {
		i = 10;
	}

	public void test2(StringBuffer sb) {
		sb.append("b");
	}

	public void test3(String s) {
		s += "d";
	}

}
