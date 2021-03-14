package com.jn.first;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

	public static void main(String[] args) {
		List<Integer> firstTenPrimes = new ArrayList<>();
		int countPrime = 0;

		while (firstTenPrimes.size() <= 9) {
			if (validPrime(countPrime)) {
				firstTenPrimes.add(countPrime);
			}
			countPrime++;
		}
		System.out.println("Primeros 10 numeros primos: " + firstTenPrimes);
	}

	public static boolean validPrime(int number) {
		int countValidPrime = 2;
		boolean prime = true;
		if (number % 2 == 0 && number != 2)
			return false;
		while ((prime) && (countValidPrime != number)) {
			if (number % countValidPrime == 0)
				prime = false;
			countValidPrime++;
		}
		return prime;
	}

}
