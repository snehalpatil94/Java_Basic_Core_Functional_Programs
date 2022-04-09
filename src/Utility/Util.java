package Utility;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Util {
	public static Scanner scanner = new Scanner(System.in);

	/*
	 * Input : Taking number from user 
	 * Logic : Using try - catch we are taking input until user put positive integer value 
	 * Output : Passing this value where positive integer number is required as input
	 */
	public static int getPositiveInt() {
		String str;
		int time = 0;
		boolean valid = false;
		while (!valid) {
			try {
				System.out.println("Please Enter no : ");
				str = Util.scanner.next();
				time = Integer.parseInt(str);
				if (time > 0)
					valid = true;
			} catch (NumberFormatException e) {
				System.out.println("Error, not a positive number. Please TRY AGAIN" + e);
			}
		}
		return time;
	}

	/*
	 * Leap Year input method : 
	 * input :Using Util.getPositiveInt() surely get positive integer.
	 * Logic :Using while and if loop made sure that entered no must be 4 digit number.
	 * Output :Returning positive 4 digit integer number.
	 * 
	 */
	public static int input() {
		int year = 0;
		boolean flag = false;

		while (!flag) {
			year = Util.getPositiveInt();
			if (Integer.toString(year).length() < 4 || year <= 0)
				System.out.println("Enter a 4-digit number...!");
			else
				flag = true;
		}
		return year;
	}

	/*
	 * Input : 4 digit positive integer made sure by input() method 
	 * Logic : Determine if it is a Leap Year.If Year is divisible by 4 and 100 or by 400.
	 * Output : return boolean true : for leap year And false : for not leap year
	 */
	public static boolean leapYear(int a) {
		int year = a;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Input : Taking positive integer from getPositiveInt() method. 
	 * Logic : After dividing no by 2 if reminder is 0 - even no & if reminder is 1 - odd no
	 * Print result accordingly.
	 */
	public static void checkEvenOdd() {
		int num = Util.getPositiveInt();
		if (num % 2 == 0) {
			System.out.println(num + " is Even Number");
		} else {
			System.out.println(num + " is Odd Number");
		}
	}

	/*
	 * Input : The number of times to Flip Coin.
	 * Logic : Use Random Function to get value between 0 and 1. If < 0.5 then tails
	 * or heads .Calculating Percentage of Head vs Tails 
	 * Output : Print the head and tail count and percentage of head and tail
	 */
	public static void flipCoin() {
		double num = getPositiveInt();

		int headCount = 0;
		int tailCount = 0;
		for (int x = 1; x <= num; x++) {
			double random = Math.random();
			if (random < 0.5) {
				headCount++;
			} else {
				tailCount++;
			}
		}
		System.out.println("Head count : " + headCount);
		System.out.println("Tail count : " + tailCount);

		double perHead = (headCount / num) * 100;
		System.out.println("Percentage of head count : " + perHead + " % ");

		double perTail = (tailCount / num) * 100;
		System.out.println("Percentage of tail count : " + perTail + " % ");
	}

	/*
	 * Input : Taking Nth number from user to find harmonic value 
	 * Logic : By arithmetic operation finding harmonic value 
	 * Output :Print harmonic series of Nth number and harmonic value
	 * 
	 */
	public static void harmonicNo(int num) {
		double sum = 0;
		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				System.out.print("1/" + i + " + ");
				double harmonicNo = Double.valueOf(i);
				sum = sum + (1 / harmonicNo);
			}
		} else {
			System.out.println("Invalid input");
		}
		System.out.println("");
		System.out.println("Harmonic value : " + sum);
	}

	/*
	 * Input : The Power Value from user.Only works if 0 <= N < 31 since 2^31
	 * overflows an integer . 
	 * Logic : Repeat until i equals N. 
	 * Output : Print power of 2 from 0 to user wanted power.
	 */
	public static void powerOfTwo(int power) {
		if ((power >= 0) && (power < 31)) {
			System.out.println("Power of 2");
			for (int i = 0; i <= power; i++) {
				int answer = (int) Math.pow(2, i);
				System.out.println("2^" + i + " = " + answer);
			}
		} else
			System.out.println("Enter the power in the range 0 - 31 ");
	}

	/*
	 * Input : three integer number from user 
	 * Logic : using ternary operator to find largest no among given 3 number 
	 * output : returning largest no stored in variable max
	 */
	public static int largestNo(int num1, int num2, int num3) {
		int max = 0;
		max = (num1 > num2) ? num1 : num2;
		max = (max > num3) ? max : num3;
		return max;
	}

	/*
	 * Input : Take Number to find the prime factors from user 
	 * Logic : Check number is grater than 0 . True : Checking factors from 2 
	 * because 1 neither prime or not composite no. using modulo operator check 
	 * is i representing no is prime factor. If condition true : reduce number 
	 * using division operator Printing prime factors of number false : Invalid input
	 * 
	 */
	public static void primeFactor(int num) {
		if (num > 0) {
			System.out.println("Prime factors of " + num + "are :");
			for (int i = 2; i <= num; i++) {
				while (num % i == 0) {
					System.out.println(i);
					num = num / i;
				}
			}
		} else {
			System.out.println("Input is invalid ");
		}
	}

	/*
	 * Input :Taking Dividend and Divisor from user 
	 * Logic : Using division operator finding quotient 
	 * Output : Return quotient
	 */
	public static int quotient(int dividend, int divisor) {
		int quotient = dividend / divisor;
		return quotient;
	}

	/*
	 * Input :Taking Dividend and Divisor from user 
	 * Logic : Using modulo operator finding reminder 
	 * Output : Return reminder
	 */
	public static int remainder(int dividend, int divisor) {
		int remainder = dividend % divisor;
		return remainder;
	}

	/*
	 * Input : Taking alphabet from user that want check 
	 * Logic : Checking if alphabet is Vowel using if and logical operator 
	 * Output : Printing the Vowel if Condition true otherwise consonant.
	 */
	public static void checkAlphabet(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println(ch + " is a Vowel ");
		} else {
			System.out.println(ch + " is Consonant");
		}
	}

	/*
	 * input : Taking Numbers from user 
	 * Logic : Using swapping method 
	 * Output : Print Swapped numbers
	 */
	public static void swapNo(int first, int second) {
		System.out.println("Before swapping numbers: ");
		System.out.println("No 1 :" + first + "  " + "No 2 :" + second);
		System.out.println();

		int temp = first;
		first = second;
		second = temp;

		System.out.println("After swapping: ");
		System.out.println("No 1 : " + first + "   " + "No 2 : " + second);
	}

	/*
	 * Input : Value of a, b, c from user 
	 * Logic : calculate the determinant (b2 -4ac) using math.pow function 
	 * Output : Return value of determinant
	 */
	public static void quadratic(int a, int b, int c) {
		double determinant = (double) Math.pow(b, b) - 4 * a * c;
		System.out.println("Determinant : " + determinant);

		// check if determinant is greater than 0 then two real and different roots
		double root_1, root_2;
		if (determinant > 0) {
			root_1 = (-b + Math.sqrt(determinant)) / (2 * a);
			root_2 = (-b - Math.sqrt(determinant)) / (2 * a);
			System.out.format("Root 1 =" + root_1 + "   " + "Root 2 =" + root_2);
		}

		// check if determinant is equal to 0
		else if (determinant == 0) {

			// determinant is equal to 0 .. two real and equal roots
			root_1 = root_2 = -b / (2 * a);
			System.out.println("Root 1 = " + root_1 + "   " + "Root 2 = " + root_2);
		} else // determinant < 0 ..roots are complex no
			System.out.println("Roots are complex no");
	}

	/*
	 * Input : Array Dimension from user 
	 * Logic : taking Array elements from user
	 * Output : Printing 2-D array elements using PrintWrter And OutputStreamWriter
	 */
	public static void twoDArray(int row, int column) {
		String[][] matrix = new String[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("Row [" + i + "]:  Column " + j + " :");
				matrix[i][j] = scanner.next();
			}
		}
		System.out.println();
		System.out.println("2D Array : ");

		try (PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out), true)) {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					pw.write("  " + matrix[i][j] + "  ");
				}
				pw.println();
			}
		}
		/*
		 * for (int i = 0; i < row; i++) { for (int j = 0; j < column; j++) {
		 * System.out.print(" " + matrix[i][j] + " "); } System.out.println(); }
		 * 
		 */
	}

	public static double effectiveTemp(int temparature, double speed) {
		double temparature1 = (temparature * 18) + 32;

		double milesPerHour = (speed / 1.609344);

		double EffectiveTemperature = 35.74 + (0.6215 * temparature)
				+ (0.4275 * temparature - 35.75) * Math.pow(milesPerHour, (int) 0.16);

		return EffectiveTemperature;
	}

	public static double distance(double x, double y) {
		double distance;
		return distance = Math.sqrt(Math.pow(x, x)) + (Math.pow(y, y));
	}

	/*
	 * Input : Array .Array size and sum you want to compare 
	 * Logic : Using for loop comparing pair of 3 element with sum 
	 * Output : Print matched pair
	 */
	public static void tripletNo(int arr[], int arr_size, int sum) {
		int tripletsCount = 0;
		for (int i = 0; i < arr_size - 2; i++) {
			for (int j = i + 1; j < arr_size - 1; j++) {
				for (int k = j + 1; k < arr_size; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println("[ " + arr[i] + "  " + arr[j] + "  " + arr[k] + " ]");
						tripletsCount++;
					}
				}
			}
		}
		System.out.println("The total number of triplets that add to 0 are: " + tripletsCount);
	}
}
