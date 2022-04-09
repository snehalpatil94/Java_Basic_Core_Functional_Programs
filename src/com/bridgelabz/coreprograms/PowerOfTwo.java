package com.bridgelabz.coreprograms;

import java.util.Scanner;

import Utility.Util;

/**
 * This program takes a command-line argument N and prints a table of the powers
 * of 2 that are less than or equal to 2^N.
 * 
 * @author Snehal Patil
 *
 */
public class PowerOfTwo {
	public static void main(String[] args) {
		System.out.println("Enter the power : ");
		Scanner sc = new Scanner(System.in);
		int pwr = sc.nextInt();
		Util.powerOfTwo(pwr);
	}
}
