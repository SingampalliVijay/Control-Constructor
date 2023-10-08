/*You are creating a program for a luxury hotel. 
 * The hotel provides senior citizens a special discount on room bookings.The program should take age as input. 
 * If the age is 60 or above, the program should print "Senior Citizen Discount Applicable". 
 * Otherwise, it should print "Regular Charges Applicable".*/
package com.kn.elseif;

import java.util.Scanner;
public class DiscountDemo {
	public static void main(String[] args) {
		System.out.println("Enter your age:");
	Scanner scan=new Scanner(System.in);
	int age=scan.nextInt();
	boolean discount=seniorcitizen(age);
	if(discount==true) {
		System.out.println("Senior Citizen Discount Applicable");
	}else {
		System.out.println("Regular Charges Applicable");
	}
	scan.close();
	}

	static boolean seniorcitizen(int age) {
	if(age>=60) {
		return true;
	}else {
		return false;
	}
	}
}

//Output:
/*Enter your age:
65
Senior Citizen Discount Applicable*/

/*Enter your age:
45
Regular Charges Applicable*/
