package com.course02_04;

public class Course02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = " SFY,JAVA,1986 ";
		String str2 = " SFY,java,1984 ";

		// 1 ����
		System.out.println("��1�⣺���㳤��");
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println("");

		// 2 λ��
		System.out.println("��2�⣺����λ��");
		System.out.println(str1.indexOf("JAVA"));
		System.out.println(str2.indexOf("java"));
		System.out.println("");

		// 3 ���
		System.out.println("��3�⣺�ж����");
		System.out.println(str1.equals(str2));
		System.out.println("");

		// 4 �滻
		System.out.println("��4�⣺�滻�ַ�");
		System.out.println(str1.replace("SFY", "Oracle"));
		System.out.println(str2.replace("SFY", "Oracle"));
		System.out.println("");

		// 5 ��Сд
		System.out.println("��5�⣺ת����Сд");
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toUpperCase());
		System.out.println("");

		// 6 ��ȡ
		System.out.println("��6�⣺��ȡ�ַ���");
		System.out.println(str1.substring(5, 9));
		System.out.println(str2.substring(5, 9));
		System.out.println("");

		// 7 ȥ�ո�
		System.out.println("��7�⣺ȥ�ո�");
		System.out.println(str1.trim());
		System.out.println(str2.trim());
		System.out.println("");

	}

}
