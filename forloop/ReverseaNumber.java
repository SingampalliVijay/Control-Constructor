package com.kn.forloop;

import java.util.Scanner;

public class ReverseaNumber {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=scan.nextInt();
	isreverse(num);
scan.close();
	}

	static void isreverse(int num) {
	int sum=0; int digit;
	while(num>0) 
//	while(num!=0)
	{
	digit=num%10;               //3,2,1
		sum=(sum*10)+digit;     //3,32,321
//		num/=10;                //12,1,0
		num =num/10;
	}System.out.println(sum+" is Reverse of a given number");
	}
}
