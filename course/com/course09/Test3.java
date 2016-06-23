package com.course09;

public class Test3 extends Human {

	public static void main(String[] args) {
		Human p = new Test3();
		p.setHight(175);
		p.setWight(75);
		System.out.println("身高为：" + p.getHight() + "cm");
		System.out.println("体重为：" + p.getWight() + "kg");
		p.eat();
		p.walk();
		p.study();
		p.work();
	}

	@Override
	public void study() {
		System.out.println("学习！");
	}

	@Override
	public void work() {
		System.out.println("工作！");
	}

}
