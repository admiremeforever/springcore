package com.springcore.streotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student {

	@Value("Manish Kumar")
	private String studetName;
	@Value("Banglore")
	private String city;
	
	@Value("#{temp}")
	private List<String> address;

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public String getStudetName() {
		return studetName;
	}

	public void setStudetName(String studetName) {
		this.studetName = studetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studetName=" + studetName + ", city=" + city + "]";
	}

}
