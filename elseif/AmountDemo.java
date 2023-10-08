/*You're developing a software tool for a financial institution. 
 * The software should be able to validate if the input balance amount is positive or negative. 
*Write a Java program that takes a balance amount as input.If the amount is less than 0, the program should print "Negative Balance". 
 * Otherwise, it should print "Positive Balance".*/
package com.kn.elseif;

import java.util.Scanner;
public class AmountDemo {
	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the amount");
     int amount=scan.nextInt();
      boolean balance=balanceamount(amount);
      if(balance==true) {
    	  System.out.println("Negative Balance");
      }else {
    	  System.out.println("Positive Balance");
      }
      scan.close();
	}

	static boolean balanceamount(int amount) {
		if(amount<0) {
			return true;
		}else {	
		}
		return false;
	}
}


//Output:
/*Enter the amount
500
Positive Balance*/

/*Enter the amount
-200
Negative Balance*/
