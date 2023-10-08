//You are creating a game where players choose their characters based on characteristics associated with Zodiac signs. The program should take a Zodiac sign as input and print the characteristic associated with that Zodiac sign. Consider the following characteristics: Aries - Adventurous, Taurus - Dependable, Gemini - Expressive, Cancer - Intuitive, Leo - Passionate, Virgo - Analytical, Libra - Diplomatic, Scorpio - Determined, Sagittarius - Philosophical, Capricorn - Organized, Aquarius - Original, Pisces - Compassionate.
package com.kn.switchcase;

import java.util.Scanner;

public class ZodiacSign {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Your Characteristic=");
    String zodiacsign=scan.nextLine();
    charactersign(zodiacsign);
    scan.close();
	}

	static void charactersign(String zodiacsign) {
		switch(zodiacsign) {
		case("Aries"): System.out.println("Adventurous");
		break;
		case("Taurus"): System.out.println("Dependable");
		break;
		case("Gemini"): System.out.println("Expressive");
		break;
		case("Cancer"): System.out.println("Intuitive");
		break;
		case("Leo"): System.out.println("Passionate");
		break;
		case("Virgo"): System.out.println("Analytical");
		break;
		case("Libra"): System.out.println("Diplomatic");
		break;
		case("Scorpio"):System.out.println("Determined");
		break;
		case("Sagittarius"): System.out.println("Philosophical");
		break;
		case("Capricorn"): System.out.println("Organized");
		break;
		case("Aquarius"): System.out.println("Original");
		break;
		case("Pisces"): System.out.println("Compassionate");
		default:
	}
		
	}

}
