package com.kn.forloop;

import java.util.Scanner;

public class ProductOfEvenNo {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a range");
     int num=scan.nextInt();
     findproductofevenno(num);
     scan.close();
	}

	static void findproductofevenno(int num) {
		int i=1,sum=1;
	  while(i<=num) {
		  if(i%2==0) {
		  sum=sum*i;  
	  }i++;
	  }
	  System.out.println("Product of range is"+sum);
	}

}
