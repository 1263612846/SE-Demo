package com.course06;

public class Student {
	private int num;
	private String name;
	private String sex;
	private String department;
	private int score;

	public void setNum(int num) {
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void print(int num, String name, String sex, String department, int score) {
		System.out.println(num + " " + name + " " + sex + " " + department + " " + score);
	}

	public void println() {
		System.out.println(this.num + " " + this.name + " " + this.sex + " " + this.department + " " + this.score);
	}
	
	public Student(int num, String name, String sex, String department, int score){
		System.out.println(num + " " + name + " " + sex + " " + department + " " + score);
	}
	
	public Student(){
		
	}

}
