package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandalone {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collection/standaloneconfig.xml");

		Person person = con.getBean("person2", Person.class);

		System.out.println(person);
    System.out.println("+++++++++++++++++++++++++++++++++++++++");
		System.out.println(person.getFriends().getClass().getName());
        System.out.println(person.getFeestructure().getClass().getName());
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println(person.getProperties());
	}

}
