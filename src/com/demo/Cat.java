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
		System.out.println("猫的长为：" + this.getHight());
		System.out.println("猫的高为：" + this.getLight());
		System.out.println("猫的重为：" + this.getWight());
		System.out
				.println("猫的长为：" + this.getHight() + " " + "猫的高为：" + this.getLight() + " " + "猫的重为：" + this.getWight());
	}

	public Cat(int light) {
		this.light = light;
		System.out.println("猫的长为：" + this.getHight());
		System.out.println("猫的高为：" + this.getLight());
		System.out.println("猫的重为：" + this.getWight());
		System.out
				.println("猫的长为：" + this.getHight() + " " + "猫的高为：" + this.getLight() + " " + "猫的重为：" + this.getWight());
	}

	public Cat(int light, int wight, int hight) {
		this.light = light;
		this.wight = wight;
		this.hight = hight;
		System.out.println("猫的长为：" + this.getHight());
		System.out.println("猫的高为：" + this.getLight());
		System.out.println("猫的重为：" + this.getWight());
		System.out
				.println("猫的长为：" + this.getHight() + " " + "猫的高为：" + this.getLight() + " " + "猫的重为：" + this.getWight());
	}

}