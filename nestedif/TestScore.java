//You are creating a program for a learning management system that checks the performance of a student in three tests. The program should accept scores of three tests. If all the scores are above 50, it should print "Passed All". If not, and if the average score is above 50, it should print "Average Score Passed". 
package com.kn.nestedif;

import java.util.Scanner;
public class TestScore {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your score");
		int test1=scan.nextInt();
		int test2=scan.nextInt();
		int test3=scan.nextInt();
		testscores(test1,test2,test3);
scan.close();
	}

	static void testscores(int test1, int test2, int test3) {
	if(test1>50) {
		if(test2>50) { 
			if(test3 >50) {
		}
	}
		System.out.println("Passed All");}
		else if((test1+test2+test3)/3>50) {
			System.out.println("Average Score Passed");
		}	
	}
}
