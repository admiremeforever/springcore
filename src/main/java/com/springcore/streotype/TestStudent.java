package com.springcore.streotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/streotype/streoconfig.xml");
		Student student = con.getBean("ob", Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
	}
}
