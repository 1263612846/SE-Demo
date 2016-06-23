package com.course13;

import java.util.List;
import java.util.Vector;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> l = new Vector<Integer>();
		
		Producer p = new Producer(l);
		Consumer c = new Consumer(l);
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		
		t1.start();
		t2.start();
	}

}
