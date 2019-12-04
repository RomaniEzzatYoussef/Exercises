package chapter05;
/**
 * Sum a series
 * Write a program to sum the following series
 * 
 * 30/11/2017   7:14:11 AM
 *  
 * @author roman
 *
 *
 * Exercise_24
 *
 */
public class Exercise_24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int numerator = 1;
		double series = 0;
		
		for (int i = 3; i <= 99; i += 2)
		{
			series += (double) numerator / i; 
			numerator = i;
		}
		
		System.out.print(series);
	}

}
