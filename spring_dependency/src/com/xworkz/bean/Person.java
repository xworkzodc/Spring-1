package com.xworkz.bean;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	private List<String> bookNames;
	private List<Integer> prices;
	

	public Person(List<Integer> prices) {
		super();
		this.prices = prices;
		System.out.println("invoked prices"+this.prices);
	}
	

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