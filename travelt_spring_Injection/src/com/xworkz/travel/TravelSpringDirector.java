package com.xworkz.travel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.travel.transport.Transport;
import com.xworkz.travel.traveller.Traveller;
import com.xworkz.travel.travels.Travels;

public class TravelSpringDirector {

	public static void main(String[] args) {

		ApplicationContext spring = new ClassPathXmlApplicationContext("resource/spring1.xml");

		Travels travel = spring.getBean(Travels.class);

		Traveller travveller = spring.getBean(Traveller.class);
		travveller.explore();
		Transport transport = spring.getBean(Transport.class);
	}

}
