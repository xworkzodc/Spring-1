package com.xworkz.travel.traveller;

import com.xworkz.travel.travels.Travels;

public class TravellerImpl implements Traveller {

	private Travels travels;
	private String name;
	private int age;
	private double contactNo;
	private boolean interesed;

	public TravellerImpl(Travels travels, String name, int age) {
		super();
		this.travels = travels;
		this.name = name;
		this.age = age;

		//travels.booking();
	//	System.out.println("the travels name is " + travels);
		System.out.println("the name of the traveller " + name);
		System.out.println("the age of the traveller " + age);
	}

	@Override
	public void explore() {
		System.out.println("he is going to explore ");
		
	}

	public void setContactNo(double contactNo) {
		this.contactNo = contactNo;
		System.out.println("the contact num of traveller " + contactNo);
	}

	public void setInteresed(boolean interesed) {
		this.interesed = interesed;
		System.out.println("the intersted to traveller " + interesed);
	}

}