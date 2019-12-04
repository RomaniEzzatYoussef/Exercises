package chapter05;
/**
 * Find the largest n such that n^3 < 12,000
 * Use a while loop to find the largest integer n such that n3 is less than 12,000.
 * 
 * 29/11/2017   6:47:47 PM
 *  
 * @author roman
 *
 *
 * Exercise_13
 *
 */
public class Exercise_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int n = 1;
		while ((int) (Math.pow(n, 3)) < 12000)
			n++;
		
		System.out.println(n);
	}

}
