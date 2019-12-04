package chapter03;

import java.util.Scanner;

/**
 * Game: heads or tails
 * Write a program that lets the user guess whether the flip of a coin results in heads or tails. 
 * The program randomly generates an integer 0 or 1, which represents head or tail. 
 * The program prompts the user to enter a guess and reports whether the guess is correct or incorrect.
 * 
 * 
 * 28/09/2017   11:18:27 PM
 *
 * @author Romani Ezzat
 *
 */
public class Exercise_14 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		m();
		d();
	}
	
	public static void d()
	{
		int coin = (int) (Math.random() * 10) % 2;
		
		int num = (int) (Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 0 or 1: ");
		int guess = input.nextInt();
		
		if (coin == guess)
		{
			System.out.println("Correct! Result: " + coin + " by " + num);
		}
		else
		{
			System.out.println("Incorrect! Result: " + coin + " by " + num);
		}
		
		input.close();
	}
	
	public static void m()
	{
		int num1 = (int) (Math.random() * 10);
		
		for (int i = 0; i < 15; i++)
		{
			 num1 = (int) (Math.random() * 10);
			 int num2 = num1 % 2; 
			 System.out.println(num1 + " " + num2);
		}
	}

}
