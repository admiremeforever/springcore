package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub(init method)
		System.out.println("taking pepsi inside init ");

	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("drank all destroy the bottle now");

	}

}
