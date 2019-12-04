package chapter10;

import java.math.BigInteger;

/**
 ** Mersenne prime
 * A prime number is called a Mersenne prime if it can be written in the form 2p - 1 for some positive integer p. 
 * Write a program that finds all Mersenne primes with p … 100 and displays the output as shown below. 
 * (Hint: You have to use BigInteger to store the number, because it is too big to be stored in long. Your program may take several hours to run.)
 * 
 * 21/04/2019   6:46:10 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_19
 *
 */
public class Exercise_19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		BigInteger bigNum = new BigInteger("3");
		
		int count = 1;
		System.out.printf("%s %8s\n", "p", "2^p - 1");
		
		while (count <= 10)
		{
			BigInteger mersennePrime = power(new BigInteger("2"), bigNum);
			if (isMersennePrime(mersennePrime))
			{
				System.out.printf("%s %8s \n", bigNum, mersennePrime);
				count++;
			}
			bigNum = bigNum.add(BigInteger.ONE);
		}
	}
	
	public static BigInteger power(BigInteger base, BigInteger exponent)
	{
		BigInteger result = BigInteger.ONE;
		
		while (exponent.signum() > 0) 
		{
			if (exponent.testBit(0)) result = result.multiply(base);
			    base = base.multiply(base);
			    exponent = exponent.shiftRight(1);
		}
		  
		return result.subtract(BigInteger.ONE);
	}
	
	public static boolean isMersennePrime(BigInteger bigNum)
	{
		BigInteger halfNum = bigNum.divide(new BigInteger("2"));
		
		for (BigInteger divisor = new BigInteger("2"); divisor.compareTo(halfNum) <= 0; divisor = divisor.add(BigInteger.ONE)) 
			if (bigNum.remainder(divisor).equals(BigInteger.ZERO)) 
				return false;

		return true;
	}

}
