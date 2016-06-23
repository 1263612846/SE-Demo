package com.course10;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		Student s1 = new Student(1, "张三", 15);
		Student s2 = new Student(2, "李四", 16);
		Student s3 = new Student(3, "王五", 17);
		Student s4 = new Student(4, "赵六", 13);
		Student s5 = new Student(5, "孙八", 14);
		Student[] s = new Student[5];
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		s[3] = s4;
		s[4] = s5;
		Arrays.sort(s);

		for (Student o : s) {
			System.out.println(o.getAge() + " --> " + o.getName());
		}
	}

}
