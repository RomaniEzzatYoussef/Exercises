package chapter10;

import java.math.BigInteger;

/**
 * * Divisible by 2 or 3
 * Find the first ten numbers with 50 decimal digits that are divisible by 2 or 3.
 * 
 * 21/04/2019   6:14:51 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_16
 *
 */
public class Exercise_16 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		BigInteger bignum = new BigInteger("1000000000000000000000000000000000000000000000000000");
		
		int count = 1;
		
		while (count <= 10)
		{
			if (bignum.remainder(new BigInteger("2")).equals(BigInteger.ZERO) || bignum.divide(new BigInteger("3")).equals(BigInteger.ZERO))
			{
				System.out.println(bignum);
				count++;
			}
			
			bignum = bignum.add(BigInteger.ONE);
		}
		
	}

}
