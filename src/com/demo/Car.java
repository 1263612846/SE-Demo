package com.demo;

public class Car {
	double l;
	double h;
	double speed;

	public void start() {
		System.out.println("汽车启动");
		System.out.println("汽车长为：" + l + " 汽车高为：" + h + " 速度为：" + speed);
	}

	public void stop() {
		System.out.println("汽车停止");
	}

	public double upSpeed() {
		speed = speed + 5.0;
		return speed;
	}

	public void cut() {
		System.out.println("刹车中......");
	}

	public double downSpeed() {
		speed = speed - 5.0;
		return speed;
	}

	public void printColor(String color) {
		System.out.println("汽车颜色为：" + color);
	}

	public Car(double l, double h, double speed) {
		this.l = l;
		this.h = h;
		this.speed = speed;
		this.start();
	}

}