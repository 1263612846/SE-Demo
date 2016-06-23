package com.course07;

public class Course07 {

	public static void main(String[] args) {
		// 1
		Teacher.courseXs = 1.5;

		Teacher t1 = new Teacher();
		System.out.println(t1.courseCompute(80));

		Teacher t2 = new Teacher();
		System.out.println(t2.courseCompute(90));

		Teacher t3 = new Teacher();
		System.out.println(t3.courseCompute(70));

		System.out.println();

		// 2
		Account a = new Account(1122, 20000);
		Account.setAnnualInterestRate(4.5 / 100);
		a.withDraw(2500);
		a.deposit(3000);
		System.out.println("账户余额为：" + a.getBalance());
		System.out.println("月利息为：" + a.getMonthlyInterestRate() * a.getBalance());
		System.out.println("开户日期为：" + a.getDateCreated());
	}

}
