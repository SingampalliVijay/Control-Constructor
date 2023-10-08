package com.kn.dowhile;

import java.util.Scanner;

public class ProductofOddNum {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
     int num=scan.nextInt();
     findoddnumbers(num);
	}

	static void findoddnumbers(int num) {
		int product=1;
	for (int i=1;i<num;i++) {
		if(i%2!=0) {
			product*=i;
		}
	}System.out.println(product);
		
	}

}
