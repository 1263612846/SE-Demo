package com.demo;

public class Car {
	double l;
	double h;
	double speed;

	public void start() {
		System.out.println("��������");
		System.out.println("������Ϊ��" + l + " ������Ϊ��" + h + " �ٶ�Ϊ��" + speed);
	}

	public void stop() {
		System.out.println("����ֹͣ");
	}

	public double upSpeed() {
		speed = speed + 5.0;
		return speed;
	}

	public void cut() {
		System.out.println("ɲ����......");
	}

	public double downSpeed() {
		speed = speed - 5.0;
		return speed;
	}

	public void printColor(String color) {
		System.out.println("������ɫΪ��" + color);
	}

	public Car(double l, double h, double speed) {
		this.l = l;
		this.h = h;
		this.speed = speed;
		this.start();
	}

}