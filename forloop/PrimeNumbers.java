package com.kn.forloop;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
    int num=scan.nextInt();
    isprime(num);
	}

	static void isprime(int num) {
	 int count=0;
	 for(int i=1;i<=num;i++) {
		 if(num%i==0) {
			 count++;
		 }
	 }
		if(count==2) {
            System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" Is not a prime number");
		}
	}

}
