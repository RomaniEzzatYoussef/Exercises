package chapter05;
/**
 * Find numbers divisible by 5 and 6
 * Write a program that displays all the numbers from 100 to 1,000, ten per line, that are divisible by 5 and 6. 
 * Numbers are separated by exactly one space.
 * 
 * 29/11/2017   11:48:56 AM
 *  
 * @author roman
 *
 *
 * Exercise_10
 *
 */
public class Exercise_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int counter = 0;
		
		for (int i = 100; i <= 1000; i++)
		{
			if (i % 5 == 0 && i % 6 == 0)
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
