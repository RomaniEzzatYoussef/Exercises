package chapter05;

import java.util.Scanner;

/**
 *
 * 19/11/2017   8:29:43 AM
 *  
 * @author roman
 *
 *
 * GuessNumber
 *
 */
public class GuessNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int number = (int) (Math.random() * 100);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your guess: ");
		int guess = input.nextInt();
		
		while(guess != number)
		{
			if (guess > number)
				System.out.println("Your guess is too high");
			else
				System.out.println("Your guess is too low");
			
			System.out.print("\nEnter your guess: ");
			guess = input.nextInt();
		}
		
		System.out.println("Yes, the number is " + number);
		
		input.close();
	}

}
