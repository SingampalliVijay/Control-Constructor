/*You're working on a calendar application that provides users with interesting facts about years.
 * The program should first check if the input year is a leap year. 
 * If it is, the program should further check if it belongs to the 21st century. 
 * If both conditions are true, it should print "21st Century Leap Year". 
 * If only the first condition is true, it should print "Leap Year".*/
package com.kn.nestedif;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter a year");
    int year=scan.nextInt();
    belongstoleapyear(year);
	}

	static void belongstoleapyear(int year) {
	if (year%4==0) {
	   if(year>=2000 && year<=2100) {
			System.out.println("21st Century Leap Year");
		}else {
			System.out.println("Leap Year");
		}
	}
	}
}

//Output:
/*Enter a year
1996
Leap Year
Enter a year
2024
21st Century Leap Year
*/
