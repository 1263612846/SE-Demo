
package com.course13;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Writer implements Runnable {
	List<Student> l = new ArrayList<Student>();

	@Override
	public void run() {
		Student s1 = new Student(1, "张三", 19);
		Student s2 = new Student(2, "李四", 17);
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		s3.setNum(3);
		s3.setName("王五");
		s3.setAge(20);
		s4.setNum(4);
		s4.setName("赵六");
		s4.setAge(22);
		s5.setNum(5);
		s5.setName("孙七");
		s5.setAge(18);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		Collections.sort(l);
	}

	public Writer(List<Student> l) {
		this.l = l;
	}

}
