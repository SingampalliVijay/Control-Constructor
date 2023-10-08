//As part of a calendar application, you are creating a feature that displays the number of days in a month. The program should take a month number (1 for January, 2 for February, and so on till
package com.kn.switchcase;

import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
    int num =scan.nextInt();
    calendermonth(num);
	}

	 static void calendermonth(int num) {
		 switch(num) {
			case(1): System.out.println("January");
			break;
			case(2): System.out.println("Febraurary");
			break;
			case(3): System.out.println("March");
			break;
			case(4): System.out.println("April");
			break;
			case(5): System.out.println("May");
			break;
			case(6): System.out.println("June");
			break;
			case(7): System.out.println("July");
			break;
			case(8): System.out.println("August");
			break;
			case(9): System.out.println("September");
			break;
			case(10): System.out.println("October");
			break;
			case(11): System.out.println("November");
			break;
			case(12): System.out.println("December");
			default:
		}
		
	}

}
