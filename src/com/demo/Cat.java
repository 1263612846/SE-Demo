package com.demo;

public class Cat {
	private int light;
	private int hight;
	private int wight;

	@Override
	public String toString() {
		return "Cat [light=" + light + ", hight=" + hight + ", wight=" + wight + "]";
	}

	public int getWight() {
		return wight;
	}

	public int getLight() {
		return light;
	}

	public int getHight() {
		return hight;
	}

	public Cat() {
		System.out.println("è�ĳ�Ϊ��" + this.getHight());
		System.out.println("è�ĸ�Ϊ��" + this.getLight());
		System.out.println("è����Ϊ��" + this.getWight());
		System.out
				.println("è�ĳ�Ϊ��" + this.getHight() + " " + "è�ĸ�Ϊ��" + this.getLight() + " " + "è����Ϊ��" + this.getWight());
	}

	public Cat(int light) {
		this.light = light;
		System.out.println("è�ĳ�Ϊ��" + this.getHight());
		System.out.println("è�ĸ�Ϊ��" + this.getLight());
		System.out.println("è����Ϊ��" + this.getWight());
		System.out
				.println("è�ĳ�Ϊ��" + this.getHight() + " " + "è�ĸ�Ϊ��" + this.getLight() + " " + "è����Ϊ��" + this.getWight());
	}

	public Cat(int light, int wight, int hight) {
		this.light = light;
		this.wight = wight;
		this.hight = hight;
		System.out.println("è�ĳ�Ϊ��" + this.getHight());
		System.out.println("è�ĸ�Ϊ��" + this.getLight());
		System.out.println("è����Ϊ��" + this.getWight());
		System.out
				.println("è�ĳ�Ϊ��" + this.getHight() + " " + "è�ĸ�Ϊ��" + this.getLight() + " " + "è����Ϊ��" + this.getWight());
	}

}