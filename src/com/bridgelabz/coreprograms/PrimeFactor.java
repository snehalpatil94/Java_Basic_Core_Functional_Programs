package com.bridgelabz.coreprograms;

import java.util.Scanner;

import Utility.Util;

/**
 * Program to Computes the prime factorisation of N using brute force
 * 
 * @author Snehal Patil
 * 
 */
public class PrimeFactor {
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Util.primeFactor(num);
	}
}