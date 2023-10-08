package com.kn.forloop;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number=");
    int base=scan.nextInt();
    int exponent=scan.nextInt();
    ispower(base,exponent);
    scan.close();
	}

	static void ispower(int base, int exponent) {
	  int  power=1;
		for(int i=1;i<=exponent;i++) {
			power=power*base;
			
		}System.out.println("Power is"+power);
	}
}
