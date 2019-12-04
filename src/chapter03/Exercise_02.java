package chapter03;

import java.util.Scanner;

/**
 * Game: add three numbers
 * The program in Listing 3.1, AdditionQuiz.java, generates two integers 
 * and prompts the user to enter the sum of these two integers.
 * Revise the program to generate three single-digit integers 
 * and prompt the user to enter the sum of these three integers.
 */

public class Exercise_02 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		int number3 = (int) (Math.random() * 10);
		
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + " ? ");
		int result = input.nextInt();
		
		System.out.print(number1 + " + " + number2 + " + " + number3 + " = " + result + " is " + (number1 + number2 + number3 == result));
		
		
		
		
		input.close();
		
	}
}
