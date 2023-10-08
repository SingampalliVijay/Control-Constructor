/*You're creating a typing software that helps users improve their typing skills. 
* One part of the software focuses on capital letters.Your program should accept a character as input.
 *  If the character is a capital letter, the program should print "Capital letter detected".*/
package com.kn.simpleif;

import java.util.Scanner;

public class Character {
Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character");
		char capital=scan.next().charAt(0);
		boolean character=capitalcharacter(capital);
		if(character==true) {
		System.out.println("Capital letter detected");}
		scan.close();
	}
	static boolean capitalcharacter(char capital) {
     if (capital=='A'&& capital=='Z') {
		return true;
	}
	return false;
	}
}


//Output:
/*Enter a character
k
Capital letter detected*/

/*Enter a character
h*/
