//cube root of a number
package com.kn.dowhile;

import java.util.Scanner;

public class CubeRoot {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Number");
    int num=scan.nextInt();
    findcuberoot(num);
    scan.close();
	}

	static void findcuberoot(int num) {
	double cube=Math.cbrt(num);
		System.out.println(cube);
	}

}
