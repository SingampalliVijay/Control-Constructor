package com.kn.forloop;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
     int num=scan.nextInt();
     isarmstrong(num);
     scan.close();
	}

	static void isarmstrong(int num) {
	  int sum=0; int digit; int temp=num;
	  while(num>0) {
		  digit=num%10;
		  sum=sum+(digit*digit*digit);
		  num/=10;
		  
	  }
//	  System.out.println(sum+" is Armstrong number");
//	if(temp==sum) {
//		System.out.println(sum+" is armstrong number");
//	}else {
//		System.out.println("Not a Armstrong Number");
//	}
	}
}
