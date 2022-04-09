package com.bridgelabz.coreprograms;

import Utility.Util;

/**
 * Program to ensure entered no is a 4 digit number.Determine if it is a Leap
 * Year.Print the year is a Leap Year or not.
 * 
 * @author Snehal Patil
 * 
 */
public class LeapYear {
	public static void main(String[] args) {
		int year = Util.input();

		if (Util.leapYear(year)) {
			System.out.println(" Leap Year");
		} else
			System.out.println("Not a leap Year");
	}
}
