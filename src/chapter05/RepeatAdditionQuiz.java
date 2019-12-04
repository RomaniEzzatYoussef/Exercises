package chapter05;

import java.util.Scanner;

/**
 *
 * 19/11/2017   8:10:10 AM
 *  
 * @author roman
 *
 *
 * RepeatAdditionQuiz
 *
 */
public class RepeatAdditionQuiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int num1 = (int) (Math.random() * 100);
		int num2 = (int) (Math.random() * 100);
		
		Scanner input = new Scanner(System.in);
		System.out.print(num1 + " + " + num2 + "? ");
		int answer = input.nextInt();
		
		while (num1 + num2 != answer)
		{
			System.out.println("Wrong answer. Try again!");
			System.out.print(num1 + " + " + num2 + "? ");
			answer = input.nextInt();
		}
		
		System.out.println("You got it!");
		
		
		input.close();
	}

}
