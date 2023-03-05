package com.springcore.ci;

public class Certi {
	private String name;

	public Certi(String name) {
		super();
		this.setName(name);
	}

	@Override
	public String toString() {
		return this.getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
