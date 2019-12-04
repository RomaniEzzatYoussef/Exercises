package chapter10;

import java.math.BigDecimal;

/**
 ** Approximate e
 * Exercise 5.26 approximates e using the following series:
 * In order to get better precision, use BigDecimal with 25 digits of precision in the computation. 
 * Write a program that displays the e value for i = 100, 200, . . . , and 1000.
 * 
 * 21/04/2019   6:52:04 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_20
 *
 */
public class Exercise_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		BigDecimal e = BigDecimal.ONE;
	    BigDecimal item = BigDecimal.ONE; 

	    for (int i = 1; i <= 1000; i++) 
	    {
	    	item = item.divide(new BigDecimal(i + ""), 25, BigDecimal.ROUND_UP);
	    	e = e.add(item);
		  
	    	if (i % 100 == 0)
	    		System.out.println("The e is " + e + " for i = " + i);
	    }
	}

}
