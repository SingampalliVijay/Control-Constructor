//You are developing a weekday management software for a company. The program should take a weekday number (1 for Monday, 2 for Tuesday, and so on till 7 for Sunday) and print the corresponding day.
package com.kn.switchcase;

import java.util.Scanner;

public class Weekday {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a num");
	int num=scan.nextInt();
	weekdays(num);
scan.close();
	}

	static void weekdays(int num) {
		switch(num) {
		case(1): System.out.println("Monday");
		break;
		case(2): System.out.println("Tuesday");
		break;
		case(3): System.out.println("Wednesday");
		break;
		case(4): System.out.println("Thursday");
		break;
		case(5): System.out.println("Friday");
		break;
		case(6): System.out.println("Saturday");
		break;
		case(7): System.out.println("Sunday");
		default:
	}
	}

}
