package com.xworkz.vendor.service;

import java.util.Iterator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int n = 100, t1 = 0, t2 = 1;
		System.out.print("Upto " + n + ": ");
		//while loop to calculate fibonacci series upto n numbers
		while (t1<= n)
		{
		System.out.print(t1 + " + ");
		int sum = t1 + t2;
		t1 = t2;
		t2 = sum;
		}
		}
	
}
	// Java implementation of recursive Binary Search
	// Returns index of x if it is present in arr[l..
	// r], else return -1
//	int binarySearch(int arr[], int l, int r, int x)
//	{
//	if (r >= l) {
//	int mid = l + (r - l) / 2;		//2
//	// If the element is present at the
//	// middle itself
//	if (arr[mid] == x)
//	return mid;
//	// If element is smaller than mid, then
//	// it can only be present in left subarray
//	if (arr[mid] >x)
//	return binarySearch(arr, l, mid - 1, x);
//	// Else the element can only be present
//	// in right subarray
//	return binarySearch(arr, mid + 1, r, x);
//	}
//	// We reach here when element is not present
//	// in array
//	return -1;
//	}
//	public static void main(String args[])
//	{
//	Calculator ob = new Calculator();
//	int arr[] = { 2, 3, 4, 10, 40 };
//	int n = arr.length;
//	int x = 40;
//	int result = ob.binarySearch(arr, 0, n - 1, x);
//	if (result == -1)
//	System.out.println("Element not present");
//	else
//	System.out.println("Element found at index " + result);
//	}
//	}
	
	
	//	public static void main(String[] args) {
////		int arr[] = { 1, 2, 3, 0 };
//		
//		//int arr[] = {3,4,2,0,1 };
//		if (isMirrorInverse(arr))
//		System.out.println("Yes");
//		else
//		System.out.println("No");
//	}
//		
//			// Function that returns true if
//			// the array is mirror-inverse
//			static boolean isMirrorInverse(int arr[])
//			{
//			for (int i = 0; i<arr.length; i++) {
//			// If condition fails for any element
//			if (arr[arr[i]] != i)				index0--value1	ind1-val 2
//			return false;						index1--value2	ind2=val 3
//			}									index2--val3	ind3=val 0
											//	index3--val 0	ind0=val 1
//			// Given array is mirror-inverse
//			return true;
//			}		
//	}
		
		
		
		
		
		
		
		
		
//		int[] arr= new int[ar];
//		System.out.println("add the num");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=s.nextInt();
//		}
//		System.out.println("added the array");
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		Calculator.num(arr);
//		
//	}
//	static void num(int arr[]) {
//		int temp=0;	int j,i;							// 1,5,6,1,7,9,6
//		for (i = 0; i < arr.length; i++) { //5 			//15679
//			for ( j = 0; j < i; j++)  //2,5,
//				if(arr[i]==arr[j]) 
//					break;
//				if(i==j) 
//					System.out.print(arr[i]+" ");
//		
//	}
//}
//}
//System.out.println("sorted array");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}














//	static void num(int arr[]) {
//		int temp=0;								// 5,2,11,10,9
//		for (int i = 0; i < arr.length; i++) { //5 
//			for (int j = i+1; j < arr.length; j++) {//2,5,
//				if(arr[i]>arr[j]) {
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		System.out.println("sorted array");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//	}



//	public static void main(String[] args) {
//		Scanner reader = new Scanner(System.in);
//		System.out.print("Enter two numbers: ");
//		// nextDouble() reads the next double from the keyboard
//		double first = reader.nextDouble();
//		double second = reader.nextDouble();
//		System.out.print("Enter an operator (+, -, *, /): ");
//		char operator = reader.next().charAt(0);
//		double result;
//		//switch case for each of the operations
//		switch(operator)
//		{
//		case '+':
//		result = first + second;
//		break;
//		case '-':
//		result = first - second;
//		break;
//		case '*':
//		result = first * second;
//		break;
//		case '/':
//		result = first / second;
//		break;
//		// operator doesn't match any case constant (+, -, *, /)
//		 
//		 
//		default:
//		System.out.printf("Error! operator is not correct");
//		return;
//		}
//		//printing the result of the operations
//		System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
//		}


