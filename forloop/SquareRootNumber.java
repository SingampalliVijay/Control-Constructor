package com.kn.forloop;

import java.util.Scanner;

public class SquareRootNumber {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
    int num =scan.nextInt();
    findsqrtofnumber(num);
	}

	static void findsqrtofnumber(int num) {
	  double squareroot=Math.sqrt(num);
	  System.out.println(squareroot);
	}
}
