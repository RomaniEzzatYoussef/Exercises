package chapter05;
/**
 * Compute pi
 * You can approximate pi by using the following series:
 * 
 * 30/11/2017   7:16:42 AM
 *  
 * @author roman
 *
 *
 * Exercise_25
 *
 */
public class Exercise_25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double pi = 0;
		
		for (int i = 1; i <= 100000; i++)
			pi += ((Math.pow(-1, (i + 1)) / ((2 * i) - 1)));
			
		System.out.print("Pi: " + (4 * pi));
	}

}
