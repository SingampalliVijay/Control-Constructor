//You're creating a software for a university that determines whether a student is eligible for an honors degree. The program should take the student's GPA and the number of courses completed as input. A student is eligible for an honors degree if they have a GPA of more than 3.5 and have completed more than 120 credits. If the student has the required GPA, it should then check the number of courses completed. If both conditions are met, it should print "Eligible for Honors Degree".
package com.kn.nestedif;

import java.util.Scanner;

public class StudentGpa {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your GPA & Credits=");
         double GPA=scan.nextDouble();
         int credits=scan.nextInt();
         eligiblefordegree(GPA,credits);
         scan.close();
	}

	static void eligiblefordegree(double GPA, int credits) {
		if(GPA>3.5) {
			if(credits>120) {
				System.out.println("Eligible for Honors Degree");
			}
		}
		
	}



}
