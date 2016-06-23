package com.course09;

public class Fan implements Socket {

	@Override
	public void supply() {
		System.out.println("电风扇工作！");
	}

}
