package chapter10;

import java.math.BigInteger;

/**
 *
 * 16/04/2019   1:08:58 AM
 *  
 * @author Romani Ezzat
 *
 *
 * LargerFactorial
 *
 */
public class LargerFactorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("50! is \n" + factorial(50));
	}
	
	public static BigInteger factorial(long n) 
	{
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= n; i++)
			result = result.multiply(new BigInteger(i + "")); 
		
		return result;
	}

}
