package com.kn.dowhile;

public class CharPattern {

	public static void main(String[] args) {
		System.out.println("Printing a Pattern");
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print((char)(i+64));
//			}System.out.println("");
//		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print((char) (j + 64)+" ");
			}
			System.out.println("");
		}
	}
}
