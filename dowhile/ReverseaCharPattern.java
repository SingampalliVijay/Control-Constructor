package com.kn.dowhile;

public class ReverseaCharPattern {

	public static void main(String[] args) {
/*	for(int i=1;i<=5;i++) {
		for(int j=5;j>=1;j--) {
			System.out.print((char)(64+j)+" ");
		}System.out.println("");
	}*/
		
   for (int i=5;i>=1;i--) {
	   for(int j=1;j<=5;j++) {
		   System.out.print((char)(64+i)+" ");
	   }System.out.println("");
   }
	}

}
