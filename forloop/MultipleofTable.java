package com.kn.forloop;

import java.util.Scanner;

public class MultipleofTable {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number=");
     int num=scan.nextInt();
     ismultiple(num);
	}

	static void ismultiple(int num) {
	   for (int i=1;i<=12;i++) {
		   int product=(num*i);
		   System.out.println(num +" * "+i+" ="+product);
	   }
		
	}

}
