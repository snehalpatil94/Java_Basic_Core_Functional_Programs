package com.bridgelabz.coreprograms;

import java.util.Scanner;

import Utility.Util;

/**
 * Java Program to Check Whether an Alphabet is Vowel or Consonant.
 * 
 * @author Snehal Patil
 *
 */
public class CheckAlphabet {
	public static void main(String[] args) {
		System.out.println("Enter the Alphabet : ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		Util.checkAlphabet(ch);
	}
}
