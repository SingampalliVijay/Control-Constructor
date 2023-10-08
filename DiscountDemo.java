/* You're helping design the software for a retail store's automatic checkout system. 
 * There's a discount policy in place for purchases exceeding $200. 
 * Your Java program should take as input the total purchase amount. 
 * If the total amount is more than $200, the program should print "Discount of 20% applicable".*/

import java.util.Scanner;

public class DiscountDemo {

	public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.println("There's a discount policy in place for purchases");
    System.out.println("\t --Enter your Purchases amount:");
    int amount=scan.nextInt();
    if (amount>200) {
    	System.out.println("Discount of 20% applicable");
    }

	}

}
