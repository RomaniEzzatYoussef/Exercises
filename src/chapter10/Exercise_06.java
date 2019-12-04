package chapter10;

import utilities.StackOfIntegers;

/**
 * Displaying the prime numbers
 * Write a program that displays all the prime numbers less than 120 in decreasing order. 
 * Use the StackOfIntegers class to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in reverse order.
 */

public class Exercise_06
{
	public static void main(String[] args) 
	{
		StackOfIntegers primeNumStack = new StackOfIntegers();
		
		for (int i = 2; i <= 120; i++)
			if (isPrime(i))
				primeNumStack.push(i);
		
		while (primeNumStack.getSize() != 0)
			System.out.print(primeNumStack.pop() + " ");
	}
	
	
	
	public static boolean isPrime(int number)
	{
		for (int i = 2; i <= Math.sqrt(number); i++)
			if ((number % i) == 0)
				return false;
		
		return true;
	}
}
