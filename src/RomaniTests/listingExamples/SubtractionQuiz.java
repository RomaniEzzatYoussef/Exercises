package RomaniTests.listingExamples;

import java.util.Scanner;

/**
 *
 * 12/03/2019   11:31:26 AM
 *  
 * @author Romani Ezzat
 *
 *
 * SubtractionQuiz
 *
 */
public class SubtractionQuiz 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);
		
		if (num1 < num2)
		{
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.print("What is " + num1 + " - " + num2 + "? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		input.close();
		
		if ( num1 - num2 == answer)
			System.out.println("You are correct!");
		else
		{
			System.out.println("Your answer is wrong.");
			System.out.println(num1 + " - " + num2 + " should be " + (num1 - num2));
		}
		
	}

}
