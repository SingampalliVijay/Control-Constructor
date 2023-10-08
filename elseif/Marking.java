/*As an IT specialist at a university, you have been tasked to create a program that helps in marking student's grades. 
 * The program should take a student's score as an input. 
 * If the score is 60 or above, the program should print "Passed". 
 * In all other cases, it should print "Failed".
 */
package com.kn.elseif;

import java.util.Scanner;
public class Marking {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your marks=");
	int marks=scan.nextInt();
	boolean marking=markingsystem(marks);
	if(marking==true) {
		System.out.println("Passed");
	}else
	{
		System.out.println("Failed");
	}
scan.close();
	}

	static boolean markingsystem(int marks) {
		if(marks>=60) {
		  return true;
		}else {
		}
		return false;
	}
}

//Output:
/*Enter your marks=
75
Passed*/

/*Enter your marks=
55
Failed*/

