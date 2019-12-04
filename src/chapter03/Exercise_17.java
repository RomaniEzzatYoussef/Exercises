package chapter03;

import java.util.Scanner;

/**
 * Game: scissor, rock, paper
 * Write a program that plays the popular scissor-rock-paper game. 
 * (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) 
 * The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. 
 * The program prompts the user to enter a number 0, 1, or 2 
 * and displays a message indicating whether the user or the computer wins, loses, or draws.
 * 
 * 10/10/2017   3:34:06 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_17
 *
 */
public class Exercise_17 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2): ");
		int userChoice = input.nextInt();
		
		int computerChoice = (int) (Math.random() * 3);
		
		
		String userBuffer = "";
		String computerBuffer = "";
		
		if (userChoice == 0)
			userBuffer ="scissor";
		
		if (userChoice == 1)
			userBuffer ="rock";
		
		if (userChoice == 2)
			userBuffer ="paper";
		
		if (computerChoice == 0)
			computerBuffer ="scissor";
		
		if (computerChoice == 1)
			computerBuffer ="rock";
		
		if (computerChoice == 2)
			computerBuffer ="paper";
		
		
		System.out.println("The computer is " + computerBuffer  + " . You choose " + userBuffer + ".");
		System.out.println("");
		
		if (userChoice == 0)
		{
			if (computerChoice == 0)
				System.out.print("It's a draw!");
			else if (computerChoice == 1)
				System.out.print("You win!");
			else
				System.out.print("You lose!");
		}
		else if (userChoice == 1)
		{
			if (computerChoice == 0)
				System.out.print("You lose!");
			else if (computerChoice == 1)
				System.out.print("It's a draw!");
			else
				System.out.print("You win!");
		}
		else
		{
			if (computerChoice == 0)
				System.out.print("You win!");
			else if (computerChoice == 1)
				System.out.print("You lose!");
			else
				System.out.print("It's a draw!");
		}
			
		
		input.close();
	}
	

}
