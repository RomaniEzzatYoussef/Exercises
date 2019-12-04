package chapter03;

import java.util.Scanner;

/**
 * Game: lottery
 * Revise Listing 3.8, Lottery.java, to generate a lottery of a three digit number. 
 * The program prompts the user to enter a three-digit number and determines whether the user wins according to the following rules:
 * 		1. If the user input matches the lottery number in the exact order, the award is $10,000.
 * 		2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
 * 		3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
 *
 * 
 * 03/10/2017   10:00:23 AM
 *
 * @author Romani Ezzat
 *
 */
public class Exercise_15 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int lotteryNumber = (int) (Math.random() * 1000);
		
		System.out.println(lotteryNumber);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Guess a three digit number: ");
		int lotteryGuess = input.nextInt();
		
		int ln1 = lotteryNumber / 100;
		int ln2 = (lotteryNumber % 100) / 10;
		int ln3 = lotteryNumber % 10;
		
		int gn1 = lotteryGuess / 100;
		int gn2 = (lotteryGuess / 10) - (ln1 * 10);
		int gn3 = lotteryGuess % 10;
		
		if (lotteryNumber == lotteryGuess)
			System.out.print("You've won $10,000!\n");
		
		else if (ln1 == gn1 || ln1 == gn2 || ln1 == gn3)
			System.out.print("You've won $3,000!\n");
		
		else if (ln1 == gn1 || ln1 == gn2 || ln1 == gn3 || ln2 == gn1 || ln2 == gn2 || ln2 == gn3 || ln3 == gn1 || ln3 == gn2 || ln3 == gn3)
			System.out.print("You've won $1,000!\n");
		
		else
			System.out.print("Doesn't Match!");
			
		
		input.close();
	}

}
