package com.bridgelabz.coreprograms;

import java.util.Scanner;

import Utility.Util;

/**
 * Java Program to Compute Quotient and Remainder
 * 
 * @author Snehal Patil
 *
 */
public class QuitentReminder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter dividend number: ");
		int dividend = sc.nextInt();
		System.out.print("Enter divisior number: ");
		int divisor = sc.nextInt();

		int quotient = Util.quotient(dividend, divisor);
		int remainder = Util.remainder(dividend, divisor);

		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
	}
}