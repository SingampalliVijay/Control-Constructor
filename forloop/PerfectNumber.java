package com.kn.forloop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
    int num=scan.nextInt();
    isperfectnumber(num);
	}

	static void isperfectnumber(int num) {
	   int sum=0,i=1;
	   while(i<num) {
		   if(num%i==0) {
			   sum+=i;
		   }i++;
	   }
		   if(sum==num){
			   System.out.println(sum+" is perfect number");
		   }else {
			   System.out.println("Not a perfect");
		   }
	}

}
