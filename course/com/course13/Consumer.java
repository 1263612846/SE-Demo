package com.course13;

import java.util.List;
import java.util.Vector;

public class Consumer implements Runnable {
	List<Integer> l = new Vector<Integer>();

	@Override
	public void run() {
		for (int i = 0; i < l.size(); i++)
			System.out.println(l.get(i));
	}

	public Consumer(List<Integer> l) {
		this.l = l;
	}

}
