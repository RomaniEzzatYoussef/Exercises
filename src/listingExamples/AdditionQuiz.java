package listingExamples;

import java.util.Scanner;

/**
 *
 * 11/03/2019   1:06:55 PM
 *  
 * @author Romani Ezzat
 *
 *
 * AdditionQuiz
 *
 */
public class AdditionQuiz 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int num1 = (int) (System.currentTimeMillis() % 10);
		int num2 = (int) (System.currentTimeMillis() / 7 % 10);
		
		Scanner input = new Scanner(System.in);
		System.out.print("What is " + num1 + " + " + num2 + "? ");
		int answer = input.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + answer + " is " +(num1 + num2 == answer));
		input.close();
	}

}
