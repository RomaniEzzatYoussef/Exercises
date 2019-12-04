package chapter05;

import java.util.Scanner;

/**
 *
 * 19/11/2017   9:14:01 AM
 *  
 * @author roman
 *
 *
 * SubtractionQuizLoop
 *
 */
public class SubtractionQuizLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int correctCount = 0;
		int count = 0;
		
		long startTime = System.currentTimeMillis();
		String output = "";
		
		Scanner input = new Scanner(System.in);
		
		while (count < 5)
		{
			int num1 = (int) (Math.random() * 100);
			int num2 = (int) (Math.random() * 100);
			
			if (num1 < num2)
			{
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			System.out.print(num1 + " - " + num2 + "? ");
			int answer = input.nextInt();
			
			if (num1 - num2 == answer)
			{
				System.out.println("You are correct!\n");
				correctCount++;
			}
			else
				System.out.println("Wrong answer!." + " The answer should be " + (num1 - num2) + "\n");
			
			count++;
			
			output += "\n" + num1 + " - " + num2 + " = " + answer + " is " + ((num1 - num2 == answer) ? "Correct" : "Wrong");
		}
		
		long endTime = System.currentTimeMillis();
		
		long testTime = endTime - startTime;
		
		System.out.println("\nCorrect Count is " + correctCount + " Test time is " + testTime / 1000 + " Seconds\n" + output);
		
		input.close();
	}

}
