package chapter05;

import java.util.Random;

/**
 * Simulation: heads or tails
 * Write a program that simulates flipping a coin one 
 * million times and displays the number of heads and tails.
 * 
 * 30/11/2017   8:37:45 AM
 *  
 * @author roman
 *
 *
 * Exercise_40
 *
 */
public class Exercise_40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Random randBool = new Random();
		int headCounter = 0;
		int tailCounter = 0;
		
		for (int i = 0; i < 1000000; i++)
		{
			if (randBool.nextBoolean() == true)
				headCounter++;
			else
				tailCounter++;
		}
		
		System.out.print("Head flipped: " + headCounter 
				+ "\nTail flipped: " + tailCounter);
	}

}
