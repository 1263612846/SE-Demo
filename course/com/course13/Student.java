package com.course13;

public class Student implements Person, Comparable<Student> {
	private int num;
	private String name;
	private int age;

	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", age=" + age + "]";
	}

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
	public void sleep() {
		System.out.println("Ë¯¾õÀ²£¡");
	}

	public Student() {

	}

	public Student(int num, String name, int age) {
		this.num = num;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		if (this.getAge() > o.getAge()) {
			return 1;
		}
		if (this.getAge() < o.getAge()) {
			return -1;
		}
		return 0;
	}

}
