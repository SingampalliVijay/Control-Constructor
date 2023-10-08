//Write a program to calculate the sum of first n natural numbers.
package com.kn.forloop;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=scan.nextInt();
    naturalnumbers(num);
    
	}

	static void naturalnumbers(int num) {
		int sum=0;
	for (int i=num;i<=10;i++) {
		sum+=i;
		System.out.println("Sum of first n Natural Numbers="+sum);
	}
}
}