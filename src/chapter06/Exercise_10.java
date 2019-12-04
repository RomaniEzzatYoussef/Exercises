package chapter06;
/**
 * Use the isPrime Method
 * Listing 6.7, PrimeNumberMethod.java, provides the isPrime(int number) method for testing whether a number is prime. 
 * Use this method to find the number of prime numbers less than 10000.
 *
 * 02/12/2017   7:56:10 AM
 *  
 * @author roman
 *
 *
 * Exercise_10
 *
 */
public class Exercise_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		final int CHECK_FOR_PRIME = 10000;
		
		System.out.print("Number of primes under " + CHECK_FOR_PRIME + " is " + primeCounter(CHECK_FOR_PRIME));
	}
	
	/**
	 * Counts how many prime under a specified number
	 * 
	 * @param number
	 * @return
	 */
	public static int primeCounter(int number)
	{
		int counter = 0;
		
		while (number != 1)
		{
			if (isPrime(number))
				counter++;
			
			--number;
		}
		
		return counter;
	}
	
	/**
	 * Returns true if it is a prime number
	 * 
	 * @param number
	 * @return
	 */
	public static boolean isPrime(int number)
	{
		for (int i = 2; i <= (number / 2); i++)
			if ((number % i) == 0)
				return false;
		
		return true;
	}
}
