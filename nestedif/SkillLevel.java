//You're designing a program for a recruitment agency that determines whether a candidate is suitable for a job role. The program should take years of experience and the candidate's skill level as inputs. A candidate is suitable if they have more than 5 years of experience and a skill level above 7. If the candidate has the required experience, it should then check their skill level. If both conditions are met, it should print "Suitable Candidate".
package com.kn.nestedif;

import java.util.Scanner;

public class SkillLevel {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your experience & skill level=");
        int experience=scan.nextInt();
        int skilllevel=scan.nextInt();
        candidateexperience(experience,skilllevel);
	}

	static void candidateexperience(int experience, int skilllevel) {
		 if (experience>5) {
			 if(skilllevel>7) {
		 }
			 System.out.println("Suitable Candidate");
		 }
		
	}

} 
