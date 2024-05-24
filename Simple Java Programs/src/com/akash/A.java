package com.akash;

import java.util.Scanner;

//Java Program to Check Whether a Given Number is Even or Odd
public class A {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		n = sc.nextInt();
		if(n%2 == 0) {
			System.out.println("The given number " + n + " is Even");
		}else {
			System.out.println("The given number " + n + " is Odd");
		}
	}
}
