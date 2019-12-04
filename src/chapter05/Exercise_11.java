package chapter05;
/**
 * Find numbers divisible by 5 or 6, but not both
 * Write a program that displays all the numbers from 100 to 200, ten per line, that are divisible by 5 or 6, but not both. 
 * Numbers are separated by exactly one space.
 * 
 * 29/11/2017   11:55:01 AM
 *  
 * @author roman
 *
 *
 * Exercise_11
 *
 */
public class Exercise_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int counter = 0;
		
		for (int i = 100; i <= 200; i++)
		{
			if (i % 5 == 0 ^ i % 6 == 0)
			{
				counter++;
				
				if (counter % 10 == 0)
					System.out.println(i + " ");
				else
					System.out.print(i + " ");
			}
		}
	}

}
