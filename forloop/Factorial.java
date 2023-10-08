//Factorial
package com.kn.forloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=scan.nextInt();
	isfactorial(num);

	}

	static void isfactorial(int num) {
	    int factorial=1;
	    for(int i=num;i<=5;i++) {
	    	factorial*=i;
	    	System.out.println("THe factorial "+num+"  is"+factorial);
	    }
	}

}
