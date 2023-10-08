package com.kn.forloop;

import java.util.Scanner;

public class SumofSeries {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter a number");
int num=scan.nextInt();
//double findsumofseries=
findsumofseries(num);
      
	}

	static void findsumofseries(int num) {
	   double sum=0.0,i=1;
	   while(i<=num) {
		   sum=sum+(1/i);
		   i++;
	   }
	System.out.println(sum);
	}

	
}
