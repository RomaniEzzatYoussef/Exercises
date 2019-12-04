package chapter10;

import java.math.BigInteger;

/**
 ** Large prime numbers
 * Write a program that finds five prime numbers larger than Long.MAX_VALUE.
 *
 * 21/04/2019   6:40:29 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_18
 *
 */
public class Exercise_18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		BigInteger bigNum = new BigInteger(Long.MAX_VALUE + "");
		bigNum.add(BigInteger.ONE);

		int count = 1;
		while (count <= 5) 
		{
			if (isPrime(bigNum)) 
			{
				System.out.println(bigNum);
				count++;
			}

			bigNum = bigNum.add(BigInteger.ONE);
		}
	}

	public static boolean isPrime(BigInteger num) 
	{
		BigInteger halfNum = num.divide(new BigInteger("2"));

		for (BigInteger divisor = new BigInteger("2"); divisor.compareTo(halfNum) <= 0; divisor = divisor.add(BigInteger.ONE)) 
			if (num.remainder(divisor).equals(BigInteger.ZERO)) 
				return false;

		return true;
	}
}
