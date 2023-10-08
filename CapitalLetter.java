/*You're creating a typing software that helps users improve their typing skills. 
 * One part of the software focuses on capital letters. Your program should accept a character as input. 
 * If the character is a capital letter, the program should print "Capital letter detected".*/

import java.util.Scanner;

public class CapitalLetter {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Accepting only Capital Character");
    System.out.println("Enter a Character");
    char c =scan.next().charAt(0);
    if (c>='A' && c<='Z')
    {
    	System.out.println("Capital letter detected");
    }
    scan.close();
	}

}
