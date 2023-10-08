//WAJP to convert a decimal value into equivalent binary value
package com.kn.dowhile;

import java.util.Scanner;

public class BinaryEquivalent {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
     int num=scan.nextInt();
     findbinary(num);
     scan.close();
	}

	static void findbinary(int num) {
	int binary=0, pvalue=1;
		while(num>0) {
			int rem=num%2;
			binary+=pvalue*rem;
			pvalue*=10;
			num/=2;
		}System.out.println("Binary Equivalent of decimal number is"+binary);
	}

}
