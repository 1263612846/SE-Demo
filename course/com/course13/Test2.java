package com.course13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		List<Student> l = new ArrayList<Student>();
		Writer w = new Writer(l);
		Reader r = new Reader(l);
		w.run();
		r.run();

		List<Map<String, Object>> t = new ArrayList<Map<String, Object>>();

		for (Student s : l) {
			Map<String, Object> m = new HashMap<String, Object>();
			m.put("num", s.getNum());
			m.put("name", s.getName());
			m.put("age", s.getAge());
			t.add(m);
		}

		for (Map<String, Object> mm : t) {
			for (Map.Entry<String, Object> e : mm.entrySet())
				System.out.println(e.getKey() + e.getValue().toString());
		}

	}

}
