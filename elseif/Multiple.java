/*Imagine you're creating a simple number categorization program. 
 * The program should take a number as input. 
 * If the number is a multiple of 5, the program should print "Multiple of 5". 
 * In all other cases, it should print "Not a multiple of 5".
 */
package com.kn.elseif;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a multiple number=");
		int num=scan.nextInt();
		boolean number=mutiplenum(num);
		if(number==true) {
			System.out.println("Multiple of 5");
		}else {
			System.out.println("Not a multiple of 5");
		}
scan.close();
	}

	private static boolean mutiplenum(int num) {
		if (num%5==0) {
			return true;
		}else {
			
		}
		return false;
	}
}

//Output:
/*Enter a multiple number=
25
Multiple of 5*/

/*Enter a multiple number=
23
Not a multiple of 5*/


