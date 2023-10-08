//You're designing an application for space enthusiasts that provides information about the solar system. The application should take a planet's name as input and outputs its order from the Sun. Consider the order: Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune.
package com.kn.switchcase;

import java.util.Scanner;

public class SolarSystem {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
  System.out.println("enter a planet");
  String planet=scan.nextLine();
  solarsystem(planet);
  scan.close();
	}

	static void solarsystem(String planet) {
	switch(planet) {
	case("Mercury"): System.out.println("1");
	break;
	case("Venus"): System.out.println("2");
	break;
	case("Earth"): System.out.println("3");
	break;
	case("Mars"): System.out.println("4");
	break;
	case("Jupiter"): System.out.println("5");
	break;
	case("Saturn"): System.out.println("6");
	break;
	case("Uranus"): System.out.println("7");
	break;
	case("Neptune"): System.out.println("8");
default:
	}
		
	}

}
