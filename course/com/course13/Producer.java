package com.course13;

import java.util.List;
import java.util.Vector;

public class Producer implements Runnable {
	List<Integer> l = new Vector<Integer>();

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			l.add(i);
		}
	}

	public Producer(List<Integer> l) {
		this.l = l;
	}

}
