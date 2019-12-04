package chapter05;
/**
 * Summation
 * Write a program to compute the following summation.
 * 
 * 30/11/2017   8:13:22 AM
 *  
 * @author roman
 *
 *
 * Exercise_35
 *
 */
public class Exercise_35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double summation = 0;
		
		for (int i = 1; i <= 624; i++)
			summation += (1 / ((Math.sqrt(i)) + (Math.sqrt(i + 1))));
		
		System.out.print(summation);
	}

}
