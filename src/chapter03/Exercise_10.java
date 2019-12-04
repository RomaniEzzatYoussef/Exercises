package chapter03;

import java.util.Scanner;

/**
 * Game: addition quiz
 * Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question. 
 * Revise the program to randomly generate an addition question with two integers less than 100.
 * 
 * 28/09/2017   5:14:29 PM
 *
 * @author Romani Ezzat
 *
 */
public class Exercise_10 
{
	public static void main(String[] args) 
	{
		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);
		
		Scanner input = new Scanner(System.in);
		System.out.print(number1 + " + " + number2 + " = ");
		int usersAnswer = input.nextInt();
		
		if ((number1 + number2) == usersAnswer)
		{
			System.out.print("Correct!");
		}
		else
		{
			System.out.print("It should be " + (number1 + number2));
		}
		
		input.close();
	}

}
