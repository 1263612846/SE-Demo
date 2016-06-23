package com.course11;

public class Student {
	private int num;
	private String name;
	private int age;

	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", age=" + age + "]";
	}

	public Student(int num, String name, int age) {
		this.num = num;
		this.name = name;
		this.age = age;
	}

}
