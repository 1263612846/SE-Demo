package com.course12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("1", "计算机科学与技术系");
		m.put("2", "软件工程系");
		m.put("3", "数字艺术系");

		// 共四种方式 三种能全部遍历 一种只能遍历value

		for (String s : m.keySet())
			System.out.println(s + m.get(s));

		Iterator<Map.Entry<String, String>> it = m.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> en = it.next();
			System.out.println(en.getKey() + en.getValue());
		}

		for (Map.Entry<String, String> e : m.entrySet())
			System.out.println(e.getKey() + e.getValue());

		for (String ss : m.values())
			System.out.println(ss);
	}

}
