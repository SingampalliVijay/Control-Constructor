package com.kn.forloop;

import java.util.Scanner;

public class ProductofNum {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
    int num=scan.nextInt();
    findproductofnum(num);
	}

	static void findproductofnum(int num) {
	int digit=0;int sum=1;
	while(num>0) {
		digit=num%10;
		sum*=digit;
		num/=10;
	}System.out.println(sum);	
	}

}
