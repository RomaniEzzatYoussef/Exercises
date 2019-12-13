package chapter10;

import java.math.BigInteger;

/**
 ** Divisible by 5 or 6
 * Find the first ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6.
 * 
 * 21/04/2019   6:56:29 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_21.txt
 *
 */
public class Exercise_21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		BigInteger bigNum = new BigInteger(Long.MAX_VALUE + "");
		bigNum = bigNum.add(BigInteger.ONE);
		
		int count = 1;
		    
		while (count <= 10) 
		{
			if (bigNum.remainder(new BigInteger("5")).equals(BigInteger.ZERO) || bigNum.remainder(new BigInteger("6")).equals(BigInteger.ZERO)) 
			{
				System.out.println(bigNum);
		        count++;
			}
			
			bigNum = bigNum.add(BigInteger.ONE);
		}
	}

}
