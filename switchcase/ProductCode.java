//You are developing a software for a vending machine. The program should take a product code as input and output the product name. The product codes are 1 for "Coke", 2 for "Pepsi", 3 for "Water", 4 for "Juice", 5 for "Tea".
package com.kn.switchcase;

import java.util.Scanner;

public class ProductCode {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
    int num=scan.nextInt();
    productcode(num);
	}

	static void productcode(int num) {
		switch(num) {
		case(1): System.out.println("Coke");
		break;
		case(2): System.out.println("Pepsi");
		break;
		case(3): System.out.println("Water");
		break;
		case(4): System.out.println("Juice");
		break;
		case(5): System.out.println("Tea");
		default:
	}
	}
}
