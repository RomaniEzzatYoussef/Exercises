package chapter09;

import java.util.Random;

/**
 * Use the Random class
 * Write a program that creates a Random object with seed 1000 and displays the first 50 random integers between 0 
 * and 100 using the nextInt(100) method.
 */
public class Exercise_04 {
	
	public static void main(String[] args)
	{
		Random r = new Random(1000);
		
		for (int i = 1; i <= 50; i++)
		{
			System.out.printf("%2d ", r.nextInt(99) + 1);
			if (i % 10 == 0)
				System.out.println();
		}
	}

}
