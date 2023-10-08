/*Your task is to create a program for a voting registration system. 
 * According to the law, a person is eligible to vote if their age is 18 or above. 
 * Your Java program should accept a person's age as input. 
 * If the age is 18 or above, the program should print "Voter registration eligible".*/
package com.kn.simpleif;

import java.util.Scanner;
public class Eligibility {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age=");
		int age=scan.nextInt();
		boolean votingage=eligibility(age);
		if (votingage==true) {
			System.out.println("Voter registration eligible");
		}
		scan.close();
	}

	static boolean eligibility(int age) {
		if (age>=18) {
			return true;
		}
		return false;
	}
}

//Output:
/*Enter your age=
21
Voter registration eligible*/

/*Enter your age=
17*/