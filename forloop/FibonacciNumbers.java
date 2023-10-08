package com.kn.forloop;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int range=scan.nextInt();
	fibonaccinumber(range);

	}

	static void fibonaccinumber(int range) {
	int firstnum=0; int secondnum=1;
	int nextnum=0;
	for(int i=0;i<=range;i++) {
		nextnum=firstnum+secondnum;
		firstnum=secondnum;
		secondnum=nextnum;
	}	System.out.println("Fabonacci number ="+nextnum);
		
	}

}
