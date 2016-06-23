package com.course02_04;

public class Course03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1
		float a = 1.12f;
		double b = 2.34;

		double c = a + b;
		double d = a - b;
		double e = a * b;
		double f = a / b;

		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

		int g = (int) (c + 0.5);
		int h = (int) (d + 0.5);
		int I = (int) (e + 0.5);
		int J = (int) (f + 0.5);

		System.out.println(g);
		System.out.println(h);
		System.out.println(I);
		System.out.println(J);

		// 2
		int i = 17;
		if (i % 2 == 0) {
			System.out.println("I是个偶数");
		} else {
			System.out.println("I不是偶数");
		}

		// 3
		switch (i) {
		case 1:
			System.out.println("I是1");
			break;
		case 2:
			System.out.println("I是2");
			break;
		case 17:
			System.out.println("I是17");
			break;
		default:
			System.out.println("不是以上");
		}

		// 4.1
		int j = 0;
		for (j = 0; j < 10; j++) {

		}
		System.out.println(j);
		// 4.2
		do {
			j++;
		} while (j < 10);
		System.out.println(j);
		// 4.3
		j = 0;
		while (j < 10) {
			j++;
		}
		System.out.println(j);

		// 5.1
		String str1 = "Welcome to ";
		String str2 = "China!";
		StringBuffer str = new StringBuffer();
		str.append(str1);
		str.append(str2);
		System.out.println(str.toString());
		// 5.2
		System.out.println(str.toString().substring(2));
		// 5.3
		System.out.println(str.toString().replace("E", "I").replace("e", "I"));

		// 6.1
		String Str = "this is a test of java";
		String[] arr1 = Str.split("s");
		System.out.println(arr1.length - 1);
		// 6.2
		int y = 0;
		y = Str.indexOf("test");
		System.out.println(Str.substring(y, y + 4));
		// 6.3
		String[] arr2 = Str.split(" ");
		StringBuffer Str2 = new StringBuffer();
		for (int z = 0; z < arr2.length; z++) {
			Str2.append(String.valueOf(arr2[z].charAt(0)).toUpperCase() + (arr2[z]).substring(1) + " ");
		}
		System.out.println(Str2.substring(0, Str2.length() - 1).toString());
		// 6.4
		System.out.println(new StringBuffer(Str).reverse().toString());
		// 6.5
		for (int x = 0; x < 6; x++) {
			System.out.println(arr2[x]);
		}

	}

}
