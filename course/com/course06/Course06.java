package com.course06;

import java.util.Scanner;

public class Course06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 1
		Student stu1 = new Student();
		stu1.print(1, "����", "��", "��", 90);

		Student stu2 = new Student();
		stu2.print(2, "����", "��", "�ƿ�", 80);

		Student stu3 = new Student();
		stu3.print(3, "����", "Ů", "Ƕ��ʽ", 75);

		Student stu4 = new Student();
		stu4.setNum(4);
		stu4.setName("����");
		stu4.setSex("Ů");
		stu4.setDepartment("�Ź�");
		stu4.setScore(85);
		stu4.println();

		Student stu5 = new Student();
		stu5.setNum(5);
		stu5.setName("����");
		stu5.setSex("��");
		stu5.setDepartment("Ӣ��");
		stu5.setScore(95);
		stu5.println();

		new Student(6, "aaa", "��", "����", 100);
		new Student(7, "bbb", "Ů", "��������", 70);

		// 2
		System.out.println("������������");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("���������䣺");
		int age = sc.nextInt();
		Tour t = new Tour();
		t.setName(name);
		t.setAge(age);
		t.count();
	}

}
