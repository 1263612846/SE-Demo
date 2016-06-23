package com.course12;

public class Student implements Comparable<Student> {
	private int num;
	private String name;
	private int age;

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Student(int num, String name, int age) {
		this.num = num;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.age > o.getAge()) {
			return 1;
		}
		if (this.age < o.getAge()) {
			return -1;
		}
		return 0;
	}

}
