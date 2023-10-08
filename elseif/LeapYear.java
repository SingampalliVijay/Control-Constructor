/*You are creating a program for a calendar application. The application should be able to identify leap years. 
 * Your Java program should take a year as input and if the year is a leap year, the program should print "Leap Year". 
 * Otherwise, it should print "Non-Leap Year".*/
package com.kn.elseif;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a year");
	int year=scan.nextInt();
	boolean leapyear=inputyear(year);
	if (leapyear==true) {
		System.out.println("Leap Year");
	}else {
		System.out.println("Non-Leap Year");
	}
scan.close();
	}

	 static boolean inputyear(int year) {
		if(year%4==0) {
			if(year%100==0) {
			  if(year%400==0) {
				  return true;
			  }
			}	
		}else {
		}
		return false;
	
}
}
//Output:
/*Enter a year
2021
Non-Leap Year*/

/*Enter a year
2000
Leap Year*/
