package com.xworkz.vendor.service;

import java.util.Scanner;

	 class Utility
	 {
	 static boolean numberOrNot(String input)
	 {
	 try
	 {
	 Integer.parseInt(input);
	 }
	 catch(NumberFormatException ex)
	 {
	 return true;
	 }
	 return true;
	 }
	 } 

	public class CheckMobileNumber {
	static boolean temp=false;
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		if(Utility.numberOrNot(input)&&(input.length()==10))
		{
		System.out.println("Thank you");
		//return;
		}
		else {
			System.out.println("try again");
			input=sc.next();
			System.out.println("try again");
			input=sc.next();
			System.out.println("try again");
			input=sc.next();
			}
			System.out.println("Max reached Sorry");
		}
	}

