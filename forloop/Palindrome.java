package com.kn.forloop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=scan.nextInt();
	palindrome(num);

	}

	 static void palindrome(int num) {
	  int digit; int sum=0; int temp=num;
       while(num>0) {
    	   digit=num%10;
    	   sum=(sum*10)+digit;
    	   num=num/10;
//    	   System.out.println("Palindrome");
	   }//System.out.println(sum+" is Palindrome");
    if(temp==sum){
    	   System.out.println("Palindrome"+sum);
    }else {
  	   System.out.println("Not a Palindrome");
      }
       }
	}
