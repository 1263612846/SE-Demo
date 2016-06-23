package com.course10;

public class Student implements Comparable<Student> {
	private int num;
	private String name;
	private int age;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public Student(int num, String name, int age) {
		this.num = num;
		this.name = name;
		this.age = age;
	}

}
