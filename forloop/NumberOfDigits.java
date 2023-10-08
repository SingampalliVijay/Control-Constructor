package com.kn.forloop;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Number");
     int num=scan.nextInt();
     findnumberofdigits(num);
     scan.close();
	}

	static void findnumberofdigits(int num) {
	   int count=0;
	   while(num>0) {
		   num/=10;
		   ++count;    
	   } System.out.println("Digits are "+count);
	}
}
