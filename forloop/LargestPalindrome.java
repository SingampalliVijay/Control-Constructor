package com.kn.forloop;

import java.util.Scanner;

public class LargestPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int range = scan.nextInt();
		boolean ispalindrome = palindrome(range);
		findlargestpalindrome(range);
		scan.close();
	}
	static boolean palindrome(int num) {
		int sum = 0, digit; int temp = num;
		while (num > 0) {
			digit = num % 10;
			sum = (sum * 10) + digit;
			num /= 10;
		if( temp==sum) {
		return true;
		}}return false;
	}

	static void findlargestpalindrome(int num) {
		int i = num;
		while (i >= 1) {
			if (palindrome(i)) {
				System.out.println("largest palindrome in range of " + num + "=" + i);
				break;
			}
			i--;
		}
	}
}
