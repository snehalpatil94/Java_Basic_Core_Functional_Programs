package com.bridgelabz.coreprograms;

import java.util.Scanner;

import Utility.Util;

/**
 * Write a program Quadratic.java to find the roots of the equation a*x*x + b*x
 * + c
 * 
 * @author : Snehal Patil
 *
 */
public class Quadratic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("A = ");
		int num1 = sc.nextInt();
		System.out.print("B = ");
		int num2 = sc.nextInt();
		System.out.print("C  = ");
		int num3 = sc.nextInt();

		Util.quadratic(num1, num2, num3);
	}
}