/*As part of a school assignment, you are creating a program to categorize integers. 
 * The program should take an integer as input. If the integer is less than 0, it should print "Negative". 
 * If the integer is greater than 0, it should print "Positive". 
 * If the integer is exactly 0, it should print "Zero".*/
package com.kn.elseifladder;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your marks");
	int marks=scan.nextInt();
	String assignment=isinteger(marks);
	if(assignment=="a") {
		System.out.println("Negative");
	}else if(assignment=="b") {
		System.out.println("Positive");
	}else {
		System.out.println("Zero");
	}
	scan.close();
	}

	static String isinteger(int marks) {
		if (marks<0) {
			return "a";
	}else if (marks>0) {
		return "b";
	}else {
		
	}
    return "c";
}
}

/*/Output:
/Enter your marks
89
Positive
Enter your marks
-45
Negative
Enter your marks
0
Zero
*/
