package com.bridgelabz.coreprograms;

import java.util.Scanner;

import Utility.Util;

/**
 * Program to Find distinct triples
 * 
 * @author : Snehal Patil
 *
 */
public class TripletNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int arr_size = sc.nextInt();
		int sum = 0;

		System.out.println("Enter the element : ");
		int[] arr = new int[arr_size];
		// Reading elements of array from user
		for (int i = 0; i < arr_size; i++) {
			arr[i] = sc.nextInt();
		}
		Util.tripletNo(arr, arr_size, sum);
	}
}