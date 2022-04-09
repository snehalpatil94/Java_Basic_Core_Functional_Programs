package com.bridgelabz.coreprograms;

import java.util.Scanner;

import Utility.Util;

/**
 * Java Program to Find the Largest Among Three Numbers
 * 
 * @author Snehal Patil
 *
 */
public class LargerNo {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		num2 = sc.nextInt();
		System.out.println("Enter third number : ");
		num3 = sc.nextInt();

		int No = Util.largestNo(num1, num2, num3);
		System.out.println("Largest number : " + No);
	}
}