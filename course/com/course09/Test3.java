package com.course09;

public class Test3 extends Human {

	public static void main(String[] args) {
		Human p = new Test3();
		p.setHight(175);
		p.setWight(75);
		System.out.println("���Ϊ��" + p.getHight() + "cm");
		System.out.println("����Ϊ��" + p.getWight() + "kg");
		p.eat();
		p.walk();
		p.study();
		p.work();
	}

	@Override
	public void study() {
		System.out.println("ѧϰ��");
	}

	@Override
	public void work() {
		System.out.println("������");
	}

}
