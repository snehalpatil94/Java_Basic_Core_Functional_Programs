package com.bridgelabz.coreprograms;

import java.util.Scanner;

import Utility.Util;

/**
 * Program to Prints the Nth Harmonic number.
 * 
 * @author Snehal Patil
 *
 */
public class HarmonicNo {
	public static void main(String[] args) {
		System.out.print("Enter Nth Harmonic no : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Util.harmonicNo(num);
	}
}
