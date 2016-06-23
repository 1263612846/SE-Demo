package com.course08;

public class course08 {

	public static void main(String[] args) {
		// 1
		Dog d = new Dog();
		d.ill();

		Penguin p = new Penguin();
		p.ill();

		// 2
		Dog dog = (Dog) new Pet();
		dog.fp();

		Penguin penguin = (Penguin) new Pet();
		penguin.swim();

		if (dog instanceof Dog) {
			System.out.println("dog属于狗类");
		} else {
			System.out.println("dog不属于狗类");
		}

		if (penguin instanceof Penguin) {
			System.out.println("penguin属于企鹅类");
		} else {
			System.out.println("penguin不属于企鹅类");
		}

	}

}
