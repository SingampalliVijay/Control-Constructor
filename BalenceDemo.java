/*You're developing a software tool for a financial institution. 
 * The software should be able to validate if the input balance amount is positive or negative. 
 * Write a Java program that takes a balance amount as input. If the amount is less than 0, the program should print "Negative Balance". 
 * Otherwise, it should print "Positive Balance".*/

import java.util.Scanner;

public class BalenceDemo {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Checking the balance amount");
	System.out.println("Enter amount:");
     int amount=scan.nextInt();
     if (amount<0) {
    	 System.out.println("Negative Balance");
     }
     else {
    	 System.out.println("Positive Balance");
     }
	}

}
