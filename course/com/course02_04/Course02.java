package com.course02_04;

public class Course02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = " SFY,JAVA,1986 ";
		String str2 = " SFY,java,1984 ";

		// 1 长度
		System.out.println("第1题：计算长度");
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println("");

		// 2 位置
		System.out.println("第2题：计算位置");
		System.out.println(str1.indexOf("JAVA"));
		System.out.println(str2.indexOf("java"));
		System.out.println("");

		// 3 相等
		System.out.println("第3题：判断相等");
		System.out.println(str1.equals(str2));
		System.out.println("");

		// 4 替换
		System.out.println("第4题：替换字符");
		System.out.println(str1.replace("SFY", "Oracle"));
		System.out.println(str2.replace("SFY", "Oracle"));
		System.out.println("");

		// 5 大小写
		System.out.println("第5题：转换大小写");
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toUpperCase());
		System.out.println("");

		// 6 截取
		System.out.println("第6题：截取字符串");
		System.out.println(str1.substring(5, 9));
		System.out.println(str2.substring(5, 9));
		System.out.println("");

		// 7 去空格
		System.out.println("第7题：去空格");
		System.out.println(str1.trim());
		System.out.println(str2.trim());
		System.out.println("");

	}

}
