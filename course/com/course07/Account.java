package com.course07;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private Date dateCreated;

	public Date getDateCreated() {
		return dateCreated;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	// �޲ι��췽��
	public Account() {
		this.dateCreated = new Date(); // �洢��������
	}

	// �вι��췽��
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date(); // �洢��������
	}

	// ������
	public double getMonthlyInterestRate() {
		return Account.annualInterestRate / 12;
	}

	// ��ȡ
	public void withDraw(int getB) {
		balance -= getB;
	}

	// �洢
	public void deposit(int setB) {
		balance += setB;
	}

}
