/*You're helping design the software for a retail store's automatic checkout system. 
 * There's a discount policy in place for purchases exceeding $200. 
 * Your Java program should take as input the total purchase amount. 
 * If the total amount is more than $200, the program should print "Discount of 20% applicable".*/
package com.kn.simpleif;

import java.util.Scanner;

public class DiscountDemo {
	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the amount");
	int amount=scan.nextInt();
	boolean discountamount=discountpolicy(amount);
	if(discountamount==true) {
		System.out.println("Discount of 20% applicable");
	}
	scan.close();
	}

	static boolean discountpolicy(int amount) {
	if(amount>200) {
		return true;
	}
	return false;
	}
}

//Output:
/*Enter the amount
250
Discount of 20% applicable*/

/*Enter the amount
180*/