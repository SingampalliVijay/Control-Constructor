/*You're designing a software that teaches young kids about different types of characters. 
 * The program should take a character as input. 
 * If it's a lowercase vowel, it should print "Lowercase Vowel". 
 * If it's an uppercase vowel, it should print "Uppercase Vowel". 
 * If it's a lowercase consonant, it should print "Lowercase Consonant". 
 * If it's an uppercase consonant, it should print "Uppercase Consonant". 
 * If it's a digit, it should print "Digit". 
 * For all other characters, it should print "Special Character".*/
package com.kn.elseifladder;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character or digit:");
        char i=scan.next().charAt(0);
        ischaracterordigit(i);
      scan.close();  
	}

	static void ischaracterordigit(char i) { 
		int unicode=i;
		if(unicode>=97 && unicode<=122)
		{
			if (i=='e' || i=='a'|| i=='i' || i=='o' || i=='u') {
			System.out.println("Lowercase Vowel");
		}else  {
		System.out.println("Lowercase Consonant");
	           }
		}else if(unicode>=65 && unicode<=90){
			if(i=='E' || i=='A'|| i=='I' || i=='O' || i=='U') {
				System.out.println("Uppercase Vowel");
			}else {
				System.out.println("Uppercase Consonant");
			}
		}else if(unicode>=47 && unicode<=57) {
			System.out.println(i+"is the number");
		}else {
			System.out.println("Special Character");
		}
    }
}
