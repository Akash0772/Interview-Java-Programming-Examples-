package com.akash;

import java.util.Scanner;

//Java Program to Find the Sum of Even and Odd Numbers
public class B {
	public static void main(String[] args) {
		int n, sumEven = 0, sumOdd = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements in array");
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			if(a[i] % 2 == 0) {
				sumEven = sumEven + a[i];
			}else {
				sumOdd = sumOdd + a[i];
			}
		}
		System.out.println("Sum of Even Numbers: " + sumEven);
		System.out.println("Sum of Even Numbers: " + sumOdd);
	}
}
