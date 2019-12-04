package chapter05;
/**
 * Compute e
 * You can approximate e using the following series
 * 
 * 30/11/2017   7:19:39 AM
 *  
 * @author roman
 *
 *
 * Exercise_26
 *
 */
public class Exercise_26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double e = 1;
		double factorial = 1;
		
		for (int i = 10000; i >= 1; i--)
		{
			for (int j = i; j >= 1; j--)
				factorial *= j;
			
			e += 1 / factorial;
			factorial = 1;
		}
		
		System.out.print("e: " + e);
	}

}
