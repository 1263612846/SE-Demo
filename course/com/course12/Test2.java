package com.course12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("1", "�������ѧ�뼼��ϵ");
		m.put("2", "�������ϵ");
		m.put("3", "��������ϵ");

		// �����ַ�ʽ ������ȫ������ һ��ֻ�ܱ���value

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
