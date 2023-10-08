/*You are creating a program for a calendar application. The application should be able to identify leap years. 
 * Your Java program should take a year as input and if the year is a leap year, the program should print "Leap Year". 
 * Otherwise, it should print "Non-Leap Year".*/

import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Identify Leap Years");
	System.out.println("Enter year");
    int year=scan.nextInt();
    if (year%4==0) {
    	System.out.println("Leap Year");
    }
    else {
    	System.out.println("Non-Leap Year");
    }
	}
}
