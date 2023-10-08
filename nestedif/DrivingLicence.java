/*As a part of a traffic management system, you are creating a program that determines a person's eligibility for a driving license based on their age and eyesight score (out of 10). 
 * The program should take age and eyesight score as inputs. 
 * A person is eligible for a driving license if they are at least 18 years old and their eyesight score is 6 or above. 
 * If both conditions are met, the program should print "Driving License Eligible".*/
package com.kn.nestedif;

import java.util.Scanner;

public class DrivingLicence {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your age");
    int age=scan.nextInt();
    int eyesight=scan.nextInt();
    eligibleforlicense(age,eyesight);
	}

	private static void eligibleforlicense(int age, int eyesight) {
		if(age>=18) {
			   if (eyesight>=6) {
				 System.out.println("Driving License Eligible");  
			   }
			}	
	}
}
//Output:
/*Enter your age
20
7
Driving License Eligible
Enter your age
20
5
*/
