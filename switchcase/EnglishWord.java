//You're developing a program to help beginners learn English. The program should take a number between 0 to 9 as input and print the corresponding English word for the number.
package com.kn.switchcase;

import java.util.Scanner;
public class EnglishWord {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
    int num=scan.nextInt();
    englishword(num);
	}

	static void englishword(int num) {
	switch(num) {
	case(1): System.out.println("One");
	break;
	case(2): System.out.println("Two");
	break;
	case(3): System.out.println("Three");
	break;
	case(4): System.out.println("Four");
	break;
	case(5): System.out.println("Five");
	break;
	case(6): System.out.println("Six");
	break;
	case(7): System.out.println("Seven");
	break;
	case(8): System.out.println("Eight");
	break;
	case(9): System.out.println("Nine");
	default:}
	}
	}

