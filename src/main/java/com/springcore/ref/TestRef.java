package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;

public class TestRef {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/ref/refconfig.xml");

		A a = (A) context.getBean("aref");
		System.out.println(a);
		System.out.println(a.getOb().getY());


	}

}
