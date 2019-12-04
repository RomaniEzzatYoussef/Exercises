package chapter04;

import java.util.Scanner;

/**
 * Vowel or consonant?
 * Write a program that prompts the user to enter a letter 
 * and check whether the letter is a vowel or consonant.
 *
 * 18/11/2017   1:30:50 PM
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
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char voc = input.next().charAt(0);
		
		if (voc == 'a' || voc == 'e' || voc == 'i' || voc == 'o' || voc == 'u')
			System.out.print(voc + " is a vowel");
		else
			System.out.print(voc + " is a consonant");
	
		input.close();
	}

}
