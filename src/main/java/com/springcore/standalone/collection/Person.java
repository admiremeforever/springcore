package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
private List friends;
private Map<String,Integer> feestructure;

private Properties properties;


public Properties getProperties() {
	return properties;
}

public void setProperties(Properties properties) {
	this.properties = properties;
}

public Map<String, Integer> getFeestructure() {
	return feestructure;
}

public void setFeestructure(Map<String, Integer> feestructure) {
	this.feestructure = feestructure;
}

public List getFriends() {
	return friends;
}

public void setFriends(List friends) {
	this.friends = friends;
}

@Override
public String toString() {
	return "Person [friends=" + friends + ", feestructure=" + feestructure + "]";
}

}
