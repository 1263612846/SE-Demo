package com.course13;

import java.util.ArrayList;
import java.util.List;

public class Reader implements Runnable {
	List<Student> l = new ArrayList<Student>();

	public Reader(List<Student> l) {
		this.l = l;
	}

	@Override
	public void run() {
		for(Student ll : l)
			System.out.println(ll);
	}

}
