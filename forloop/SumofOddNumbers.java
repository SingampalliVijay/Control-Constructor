package com.kn.forloop;

import java.util.Scanner;

public class SumofOddNumbers {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Number");
    int num=scan.nextInt();
    findsumofodd(num);
	}

	static void findsumofodd(int num) {
    int digit=0;  int i=num;
	    while(i>0) {
		if((i%2)==1) {
			digit+=i;
			}
		 i--;
	  }System.out.println(digit);
	}
}