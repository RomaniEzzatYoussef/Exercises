package chapter05;

import java.util.Random;
import java.util.Scanner;

/**
 * Game: scissor, rock, paper
 * Let the user continuously play until either the user or the computer wins more than two times than its opponent.
 * 
 * 30/11/2017   8:06:40 AM
 *  
 * @author roman
 *
 *
 * Exercise_34
 *
 */
public class Exercise_34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int userScore = 0;
		int compScore = 0;
		
		String userInput = "";
		Random randNumber = new Random();
		int randomPlay;
		
		System.out.println("Enter scissor, rock or paper!");
		
		while ((userScore - compScore) != 2 && (compScore - userScore) != 2)
		{
			System.out.print("You play: ");
			userInput = input.next();
			
			randomPlay = randNumber.nextInt(3);
			
			if (randomPlay == 0)
			{
				System.out.println("Comp plays: scissors" );
				
				if (userInput.equals("scissors"))			
					System.out.println("It's a draw! \n");				
				else if (userInput.equals("rock"))
				{
					System.out.println("You win! \n");
					++userScore;
				}
				else
				{
					System.out.println("You lose! \n");
					++compScore;
				}
			}
			else if (randomPlay == 1)
			{
				System.out.println("Comp plays: rock" );
				
				if (userInput.equals("scissors"))
				{
					System.out.println("You lose! \n");
					++compScore;
				}			
				else if (userInput.equals("rock"))
					System.out.println("It's a draw! \n");
				else
				{
					System.out.println("You win! \n");
					++userScore;
				}	
			}
			else
			{
				System.out.print("Comp plays: paper \n" );
				
				if (userInput.equals("scissors"))
				{
					System.out.println("You win! \n");
					++userScore;
				}						
				else if (userInput.equals("rock"))
				{
					System.out.println("You lose! \n");
					++compScore;
				}
				else
					System.out.println("It's a draw! \n");	
			}	
		}
		
		if ((userScore - compScore) == 2)
			System.out.print("Congratulations! You've beat the computer!");
		else
			System.out.print("You've lost the game!");
		
		input.close();
	}

}
