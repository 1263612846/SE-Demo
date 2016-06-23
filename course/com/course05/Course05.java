package com.course05;

import java.util.Scanner;

public class Course05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

//		// 1
//		Teacher t1 = new Teacher();
//		t1.setCourseNum(50);
//		t1.setCourseXs(1.5);
//		System.out.println(t1.getCount());
//
//		Teacher t2 = new Teacher();
//		t2.setCourseNum(100);
//		t2.setCourseXs(0.5);
//		System.out.println(t2.getCount());
//
//		Teacher t3 = new Teacher();
//		t3.setCourseNum(80);
//		t3.setCourseXs(0.8);
//		System.out.println(t3.getCount());

		// 2
		StuInfo d = new StuInfo();
		d.num = 1;
		d.name = "张三";
		d.score = 80;
		System.out.println(d.count());

		StuInfo e = new StuInfo();
		e.num = 2;
		e.name = "李四";
		e.score = 90;
		System.out.println(e.count());

		StuInfo f = new StuInfo();
		f.num = 3;
		f.name = "王五";
		f.score = 100;
		System.out.println(f.count());

		// 3
		Position p = new Position();
		System.out.println("请输入第一个点的横坐标：");
		Scanner x1 = new Scanner(System.in);
		p.setX1(x1.nextDouble());
		System.out.println("请输入第一个点的纵坐标：");
		Scanner y1 = new Scanner(System.in);
		p.setY1(y1.nextDouble());
		System.out.println("请输入第二个点的横坐标：");
		Scanner x2 = new Scanner(System.in);
		p.setX2(x2.nextDouble());
		System.out.println("请输入第二个点的纵坐标：");
		Scanner y2 = new Scanner(System.in);
		p.setY2(y2.nextDouble());
		double g = p.getX();
		System.out.println("两点间的距离为：" + g);
	}

}
