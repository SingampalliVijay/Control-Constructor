package com.kn.forloop;

import java.util.Scanner;

public class Isprime {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
     int num=scan.nextInt();
     boolean isprime=prime(num);
     if (isprime==true) {
    	 System.out.println("is a prime");
     }else {
    	 System.out.println(" not prime");
     }
	}
	static boolean prime(int num) {
	    boolean isprime=true;
	   for (int i=2;i<num;i++) {
		   if(num%i==0) {
			   return false;
		   }else {
			   return true;
		   }
	   }
	return isprime;
		
	}

}
