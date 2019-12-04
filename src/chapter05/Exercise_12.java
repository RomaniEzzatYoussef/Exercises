package chapter05;
/**
 * Find the smallest n such that n^2 > 12,000
 * Use a while loop to find the smallest integer n such that n2 is greater than 12,000.
 * 
 * 29/11/2017   12:00:02 PM
 *  
 * @author roman
 *
 *
 * Exercise_12
 *
 */
public class Exercise_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		{
			int n = 1;
			while ((int) Math.pow(n, 2) < 12000)
			{
				if (n % 10 == 0)
					System.out.println(n);
				else
					System.out.print(n + " ");
				++n;
			}
			
			System.out.println("n is " + n);
		}
		
		{
			int n = 1;
			for (n = 1; (int) Math.pow(n, 2) < 12000; n++)
				System.out.println(n);
			
			System.out.println("n is " + n);
		}
	}

}
