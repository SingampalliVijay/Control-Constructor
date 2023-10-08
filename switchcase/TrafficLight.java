//You're developing an interactive tool for a driving school. The tool takes a traffic light color (Red, Yellow, Green) as input and suggests the action a driver should take. The program should print "Stop" for "Red", "Ready" for "Yellow", and "Go" for "Green".
package com.kn.switchcase;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a color");
        String color =scan.nextLine();
        trafficsingal(color);
	}

	static void trafficsingal(String color) {
	switch(color) {
	case("red"):
		System.out.println("Stop");
	break;
	case("yellow"):
		System.out.println("Ready");
	break;
	case("green"):
		System.out.println("Go");
	default:
	}
		
	}

}
