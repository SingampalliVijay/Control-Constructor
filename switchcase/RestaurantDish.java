//You're developing a restaurant app which helps the customers to know the special dish of the day. The application should take a day of the week as input (1 for Monday, 2 for Tuesday, etc.) and outputs the special dish of that day. Consider the following dishes: Monday - Pasta, Tuesday - Tacos, Wednesday - Sushi, Thursday - Steak, Friday - Pizza, Saturday - Lobster, Sunday - Brunch.
package com.kn.switchcase;

import java.util.Scanner;

public class RestaurantDish {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    System.out.println("Enter a day=");
    int day=scan.nextInt();
    specialdishes(day);
    scan.close();
	}

	static void specialdishes(int day) {
		switch(day) {
		case(1): System.out.println("Pasta");
		break;
		case(2): System.out.println("Tacos");
		break;
		case(3): System.out.println("Sushi");
		break;
		case(4): System.out.println("Steak");
		break;
		case(5): System.out.println("Pizza");
		break;
		case(6): System.out.println("Lobster");
		break;
		case(7): System.out.println("Brunch");
		default:
	}
		
	}

}
