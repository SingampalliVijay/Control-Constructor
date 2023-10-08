package com.kn.dowhile;

import java.util.Scanner;

public class SmallestNumberofDigit {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
     int num=scan.nextInt();
     findsmallestno(num);
     scan.close();
	}

   static void findsmallestno(int num) {
	 int digit, temp=100;
	do {
		digit=num%10;
		num/=10;
	}while(num>0);
	if(temp>digit) {
		temp=digit;
		System.out.println("The "+temp+" is smallest digit of given number");
	}
	}
}

