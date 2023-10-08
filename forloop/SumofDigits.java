package com.kn.forloop;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number =");
    int num=scan.nextInt();
    issumofdigit(num);
	}

	static void issumofdigit(int num) {
	  int sum=0; int digit;
	  while(num>0) {
		  digit =num%10;
		  sum=sum+digit;
		  num/=10;
//		  System.out.println(sum);
	  }System.out.println(sum);
		
	}

}
