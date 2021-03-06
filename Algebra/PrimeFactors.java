package Mathematics;

import java.util.*;

class PrimeFactors {
	
	public static void main(String[] args) {

		System.out.println("Welcome to the prime factors calculator!");

		try {
			Scanner scan = new Scanner(System.in);

			// Prompt user for integer to find factors of and store the data
			System.out.println("Please input a number to factor...");
			int numToFactor = scan.nextInt();

			System.out.println("Prime factors of " + numToFactor + " are: ");

			/*
			 * Algorithm to check for prime factors (starting from 1 to the inputed number, if 'i'
			 * divides into the numToFactor without a remainder and isPrime returns true, 'i' is a prime factor of
			 * numToFactor)
			 */
			for (int i = 1; i <= numToFactor; i++) {
				if ((numToFactor % i == 0) && (isPrime(i))) {
					System.out.print(i + " ");
				}
			}

			scan.close();
			
		} catch (InputMismatchException ex) {
			System.err.println("Please provide only numbers (no text). Restart the program and try again!");
			main(new String[0]);
		}

	}

	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;

	}

}