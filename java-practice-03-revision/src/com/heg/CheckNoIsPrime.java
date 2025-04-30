package com.heg;

public class CheckNoIsPrime {

	public static void main(String[] args) {
		System.out.println(isPrime(19));

	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrimeV1(int n) {
		if (n < 2)
			return false; // Handle n=0,1
		if (n == 2)
			return true; // 2 is the only prime number
		if (n % 2 == 0)
			return false; // Eliminate even number >2

		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
