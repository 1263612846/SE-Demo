package com.course06;

import java.util.Scanner;

public class Course06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 1
		Student stu1 = new Student();
		stu1.print(1, "张三", "男", "软工", 90);

		Student stu2 = new Student();
		stu2.print(2, "李四", "男", "计科", 80);

		Student stu3 = new Student();
		stu3.print(3, "王五", "女", "嵌入式", 75);

		Student stu4 = new Student();
		stu4.setNum(4);
		stu4.setName("赵六");
		stu4.setSex("女");
		stu4.setDepartment("信管");
		stu4.setScore(85);
		stu4.println();

		Student stu5 = new Student();
		stu5.setNum(5);
		stu5.setName("孙七");
		stu5.setSex("男");
		stu5.setDepartment("英语");
		stu5.setScore(95);
		stu5.println();

		new Student(6, "aaa", "男", "日语", 100);
		new Student(7, "bbb", "女", "数字艺术", 70);

		// 2
		System.out.println("请输入姓名：");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("请输入年龄：");
		int age = sc.nextInt();
		Tour t = new Tour();
		t.setName(name);
		t.setAge(age);
		t.count();
	}

}
