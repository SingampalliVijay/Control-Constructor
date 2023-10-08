 /*Imagine you're designing the software for a new extreme roller coaster ride in an amusement park. 
* The roller coaster has an age restriction - only individuals 12 years or older are allowed on the ride. 
* * Your program should take as input the age of a visitor. If the age is 12 or above, the program should print "Ride access granted".*/
package com.kn.simpleif;

import java.util.Scanner;
public class RollerCoast {
		public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("The roller coaster has an age restriction");
		System.out.println("Enter your Age:");
		int age=scan.nextInt();
		boolean inputage=rollercoast(age);
		if (inputage==true) {
			System.out.println("Ride access granted");
		}
		scan.close();
		}

		static boolean rollercoast(int age) {
			if (age>=12) {
				return true;
			}
			return false;
		}
	}

//Output:
/*The roller coaster has an age restriction
Enter your Age:
15
Ride access granted*/

/*The roller coaster has an age restriction
Enter your Age:
9
*/
