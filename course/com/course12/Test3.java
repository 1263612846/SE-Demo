package com.course12;

import java.util.Set;
import java.util.TreeSet;

public class Test3 {

	public static void main(String[] args) {
		Student s1 = new Student(1, "����", 19);
		Student s2 = new Student(2, "����", 20);
		Student s3 = new Student(3, "����", 18);
		Student s4 = new Student(4, "����", 15);
		Student s5 = new Student(5, "����", 17);

		Set<Student> s = new TreeSet<Student>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);

		for (Student ss : s)
			System.out.println(ss);
	}

}
