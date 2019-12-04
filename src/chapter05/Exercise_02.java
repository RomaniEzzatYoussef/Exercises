package chapter05;

import java.util.Scanner;

/**
 * Repeat additions
 * Listing 5.4, SubtractionQuizLoop.java, generates five random subtraction questions. 
 * Revise the program to generate ten random addition questions for two integers between 1 and 15. 
 * Display the correct count and test time.
 * 
 * 29/11/2017   8:27:48 AM
 *  
 * @author roman
 *
 *
 * Exercise_02
 *
 */
public class Exercise_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n1, n2, answer;
		
		long startTime = System.currentTimeMillis();
		
		int correctCounter = 0;
		
		for (int i = 0; i < 10; i++)
		{
			n1 = (int) (Math.random() * 15 + 1);
			n2 = (int) (Math.random() * 15 + 1);
			
			System.out.print(n1 + " + " + n2 + " = ");
			answer = input.nextInt();
			
			if ((n1 + n2) == answer)
				correctCounter++;
		}
		
		System.out.print("Correct answers: " + correctCounter + "/10"
				+ "\nTime took: " + (System.currentTimeMillis() - startTime) / 1000 + " seconds");
		
		input.close();
	}

}
