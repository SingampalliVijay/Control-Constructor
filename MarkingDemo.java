/*As an IT specialist at a university, you have been tasked to create a program that helps in marking student's grades. 
 * The program should take a student's score as an input. 
 * If the score is 60 or above, the program should print "Passed". In all other cases, it should print "Failed".*/

import java.util.Scanner;
public class MarkingDemo {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Marking student's grades");
	System.out.println("Enter your marks");
	int marks=scan.nextInt();
	if (marks>=60)
	{
		System.out.println("Passed");
	}
	else
		System.out.println("Failed");
	}
}
