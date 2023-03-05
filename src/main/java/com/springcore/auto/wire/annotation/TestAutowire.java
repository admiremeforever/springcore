package com.springcore.auto.wire.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/auto/wire/annotation/autowire_autoconfig.xml");
		Emp e1 = context.getBean("e1", Emp.class);
		System.out.println(e1);
	}
}
