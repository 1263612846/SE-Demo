package com.course06;

public class Tour {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void count() {
		if (this.age <= 5) {
			System.out.println(this.name + "������Ϊ��" + this.age + "����Ʊ��ѡ�");
		} else if (this.age > 5 && this.age <= 15) {
			System.out.println(this.name + "������Ϊ��" + this.age + "����Ʊ�۸�Ϊ15Ԫ��");
		} else {
			System.out.println(this.name + "������Ϊ��" + this.age + "����Ʊ�۸�Ϊ30Ԫ��");
		}
	}

}
