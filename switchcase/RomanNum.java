//As part of a game, you're creating a feature that takes a Roman numeral as input and returns the corresponding decimal number. The Roman numerals from 1 to 5 are I, II, III, IV, V.
package com.kn.switchcase;

import java.util.Scanner;

public class RomanNum {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    System.out.println("Enter a number=");
    String num=scan.nextLine();
    romannumber(num);
	}

	 static void romannumber(String num) {
	 switch(num) {
			case("I"): System.out.println("1");
			break;
			case("II"): System.out.println("2");
			break;
			case("III"): System.out.println("3");
			break;
			case("IV"): System.out.println("4");
			break;
			case("V"): System.out.println("5");
		default:
	}
	 }
}
