/*As a software developer, you're tasked with creating a simple validation system for a data entry application. 
 * The application is meant to process only positive integers. In order to guide user input, the system should print a guiding message "Positive number - processing..." 
 * if the entered number is greater than zero.*/
package com.kn.simpleif;

import java.util.Scanner;
public class PositiveInteger {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number =");
	int number =scan.nextInt();
	boolean ispositive=ispositivenumber(number);
    if(ispositive==true) {
		System.out.println("Positive number - processing...");
	}
    scan.close();
	}
	
	 static boolean ispositivenumber(int number) {
		if (number>=0) 
		{
		return true;	
		}
		return false;
	}
}


//Output:
/*
 * Enter a number =
   27
   Positive number - processing...*/

/*
 * Enter a number =
-12*/
