package com.course11;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		Student s1 = new Student(1, "张三", 15);
		Student s2 = new Student(2, "李四", 16);
		Student s3 = new Student(3, "王五", 17);
		Student s4 = new Student(4, "赵六", 14);
		Student s5 = new Student(5, "孙七", 13);
		List<Student> l = new ArrayList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		for (Student s : l)
			System.out.println(s);
//		Iterator<Student> i = l.iterator();
//		while (i.hasNext())
//			System.out.println(i.next());
	}
}
