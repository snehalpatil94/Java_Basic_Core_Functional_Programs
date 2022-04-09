package com.bridgelabz.coreprograms;

import java.util.Scanner;

import Utility.Util;

/**
 * Write a program WindChill.java that takes two double command-line arguments t
 * and v and prints the wind chill
 * 
 * @author : Snehal Patil
 *
 */
public class WindChill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temparature = Integer.parseInt(args[0]);
		double speed = Integer.parseInt(args[1]);

		if ((temparature > 0) && (speed > 0)) {
			if (temparature > 50) {
				System.err.println("The value of temperature in Fahrenheit cannot be larger that 50");
				System.exit(0);
				if (speed > 120 || speed < 3) {
					System.err.println("The value of Wind Speed in mph must be between 3 and 120");
					System.exit(0);
				}
			}
		} else
			System.out.println(" Enter positive values");

		double effectiveTemperature = Util.effectiveTemp(temparature, speed);

		System.out.print("Effective Temperature is : " + effectiveTemperature);
	}
}
