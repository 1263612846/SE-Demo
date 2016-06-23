package com.course09;

public abstract class Human implements Study, Work {
	private double hight;
	private double wight;

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	public double getWight() {
		return wight;
	}

	public void setWight(double wight) {
		this.wight = wight;
	}

	public void eat() {
		System.out.println("³Ô·¹");
	}

	public void walk() {
		System.out.println("×ßÂ·");
	}

}
