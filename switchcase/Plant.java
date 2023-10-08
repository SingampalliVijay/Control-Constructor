//You're creating an application for a gardening shop that provides advice on the type of fertilizer to use based on the type of plant. The application should take a plant type as input (1 for Roses, 2 for Sunflowers, 3 for Orchids, 4 for Cacti, 5 for Ferns) and suggest the type of fertilizer to use. Consider the following fertilizers: Roses - Rose Food, Sunflowers - All Purpose Fertilizer, Orchids - Orchid Fertilizer, Cacti - Cactus Mix, Ferns - Organic Compost.
package com.kn.switchcase;

import java.util.Scanner;
public class Plant {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a num");
    int plants=scan.nextInt();
    fertilizerplants(plants);
	}

	static void fertilizerplants(int plants) {
		switch(plants) {
		case(1): System.out.println("Rose Food");
		break;
		case(2): System.out.println("All Purpose Fertiliser");
		break;
		case(3): System.out.println("Orchid Fertilizer");
		break;
		case(4): System.out.println("Cactus Mix");
		break;
		case(5): System.out.println("Organic Compost");
		default:
	}
		
	}

}
