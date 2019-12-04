package chapter04;

import java.util.Scanner;

/**
 *
 * 18/11/2017   6:48:51 AM
 *  
 * @author roman
 *
 *
 * LotteryUsingStrings
 *
 */
public class LotteryUsingStrings 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		String guess = input.nextLine();
		
		int ld1 = lottery.charAt(0);
		int ld2 = lottery.charAt(1);
		
		int gd1 = guess.charAt(0);
		int gd2 = guess.charAt(1);
		
		System.out.println("The lottery number is " + lottery);
		
		if (guess.equals(lottery))
			System.out.println("Exact match: you win $10,000");
		else if (gd1 == ld2 && gd2 == ld1)
			System.out.println("Match all digits: you win $3,000");
		else if (gd1 == ld1 || gd1 == ld2 || gd2 == ld1 || gd2 == ld2)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");
		
		input.close();
	}

}
