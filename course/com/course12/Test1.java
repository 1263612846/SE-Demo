package com.course12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		Student s1 = new Student(1, "张三", 19);
		Student s2 = new Student(2, "李四", 20);
		Student s3 = new Student(3, "王五", 21);

		Map<String, Student> m1 = new HashMap<String, Student>();
		Map<String, Student> m2 = new HashMap<String, Student>();
		Map<String, Student> m3 = new HashMap<String, Student>();

		m1.put("id", s1);
		m2.put("id", s2);
		m3.put("id", s3);

		List<Map<String, Student>> l = new ArrayList<Map<String, Student>>();
		l.add(m1);
		l.add(m2);
		l.add(m3);

		for (Map<String, Student> k : l)
			System.out.println(k.get("id"));
		for (Map<String, Student> j : l)
			System.out.println(j.get("id").getNum() + j.get("id").getName() + j.get("id").getAge());
	}

}
