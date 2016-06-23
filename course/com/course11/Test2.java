package com.course11;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			l.add(i);
		}
		for (int j : l)
			System.out.println(j);
	}

}
