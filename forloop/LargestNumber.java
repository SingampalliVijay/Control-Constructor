package com.kn.forloop;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Number");
     int num=scan.nextInt();
     findlargest(num);
	}

	static void findlargest(int num) {
		int digit, temp=-1;
	 while(num>0) {
		 digit=num%10;
		 num/=10;
		 if(digit>temp) {
			 temp=digit;
		 }
	 }	
	 System.out.println(temp+" is the largest");
	}
}
