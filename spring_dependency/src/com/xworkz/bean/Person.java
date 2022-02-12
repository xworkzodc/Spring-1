package com.xworkz.bean;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	private List<String> bookNames = new ArrayList<String>();

	@Override
	public String toString() {
		return "Person [name=" + name + ", bookNames=" + bookNames + "]";
	}

	public List<String> getBookNames() {
	
		return bookNames;
	}

	public void setBookNames(List<String> bookNames) {
		this.bookNames = bookNames;
		System.out.println("invoked books "+this.bookNames);
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("invoked name "+this.name);
	}

	public String getName() {
		
		return name;
	}

}
