/*Your task is to create a program for a voting registration system. 
 * According to the law, a person is eligible to vote if their age is 18 or above. 
 * Your Java program should accept a person's age as input. 
 * If the age is 18 or above, the program should print "Voter registration eligible".*/

import java.util.Scanner;

public class VotingDemo {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Vote to age is 18 or Above");
    System.out.println("Enter your Age:");
    int age=scan.nextInt();
    if (age>=18) {
    	System.out.println("Voter registration eligible");
    }
	}

}
