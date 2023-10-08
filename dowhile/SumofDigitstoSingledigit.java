package com.kn.dowhile;

import java.util.Scanner;

public class SumofDigitstoSingledigit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");

		int num=scan.nextInt();
		findsingledigit(num);
		
		scan.close();
	}

	static void findsingledigit(int num) {
     while(num>=10) {
    	 int sum=0;
		while(num>0){
			int r =num%10;
			sum=sum+r;
			num/=10;
		}		
		num=sum;
     }System.out.println(num);
	}
}
