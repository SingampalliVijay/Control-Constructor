package com.kn.patterns;

public class XPattern {

	public static void main(String[] args) {
	/*int k=0;
	for(int i=1;i<=9;i++) {
		if(i<=5) {
			k++;
		}else {
				k--;
			}
	for(int j=1;j<=9;j++) {
		if(j<=k || j>=(10-k)) 
		{
			System.out.print("*");
		}else {
			System.out.print(" ");
		}
	}System.out.println("");
	}*/
		
	int k=0;
	for(int i=1;i<=5;i++) {
		if(i<=5) {
			k++;
		}
		for(int j=1;j<=5;j++) {
//			if(j==(6-i) || j==i) {
			if(j==(6-k)|| j==k) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}System.out.println("");
	}	
	}
}
