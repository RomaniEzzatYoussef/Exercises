package chapter07;

import java.util.Scanner;

/**
 * Culture: Chinese Zodiac
 * Simplify Listing 3.9 using an array of strings to store the animal names.
 * 
 * 07/12/2017   12:34:35 PM
 *  
 * @author roman
 *
 *
 * Exercise_33
 *
 */
public class Exercise_33 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String[] zodiacArray = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
		System.out.print("Enter a year: ");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Your zodiac sign is the " + zodiacArray[input.nextInt() % 12]);
		input.close();
	}

}
