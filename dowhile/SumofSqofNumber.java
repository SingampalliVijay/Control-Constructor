package com.kn.dowhile;

import java.util.Scanner;

public class SumofSqofNumber {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	double sum=0;
	for(int i=1;i<=num;i++) {
		sum=sum+Math.pow(i,2);
		
	}System.out.println(sum);
scan.close();
	}

}
