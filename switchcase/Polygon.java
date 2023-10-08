//You're designing a game that involves guessing the name of a polygon based on the number of sides. The program should take an integer representing the number of sides of a polygon (3 for triangle, 4 for quadrilateral, 5 for pentagon, 6 for hexagon, 7 for heptagon, 8 for octagon) and print the polygon name.
package com.kn.switchcase;

import java.util.Scanner;

public class Polygon {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number of sides=");
    int side=scan.nextInt();
    numberofsides(side);
	}

	static void numberofsides(int side) {
		switch(side) {
		case(3): System.out.println("Triangle");
		break;
		case(4): System.out.println("Quadrilateral");
		break;
		case(5): System.out.println("Pentagon");
		break;
		case(6): System.out.println("Hexagon");
		break;
		case(7): System.out.println("Heptagon");
		break;
		case(8): System.out.println("Octogon");
		default:
	}
	}
}
