package chapter05;

import java.util.Scanner;

/**
 *
 * 29/11/2017   8:35:10 AM
 *  
 * @author roman
 *
 *
 * MindTest
 *
 */
public class MindTest {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n1, n2, answer , operation;
		
		long startTime = System.currentTimeMillis();
		
		int correctCounter = 0;
		
		for (int i = 0; i < 10; i++)
		{
			n1 = (int) (Math.random() * 100 + 1);
			n2 = (int) (Math.random() * 100 + 1);
			
			operation = (int) (Math.random() * 3 + 1);
			
			if (operation == 1)
			{
				System.out.print(n1 + " + " + n2 + " = ");
				answer = input.nextInt();
				
				if ((n1 + n2) == answer)
					correctCounter++;
			}
			
			if (operation == 2)
			{
				if (n1 < n2)
				{
					int temp = n1;
					n1 = n2;
					n2 = temp;
				}
				
				System.out.print(n1 + " - " + n2 + " = ");
				answer = input.nextInt();
				
				if ((n1 - n2) == answer)
					correctCounter++;
			}
			
			if (operation == 3)
			{
				System.out.print(n1 + " * " + n2 + " = ");
				answer = input.nextInt();
				
				if ((n1 * n2) == answer)
					correctCounter++;
			}
			
			if (operation == 4)
			{
				if (n1 < n2)
				{
					int temp = n1;
					n1 = n2;
					n2 = temp;
				}
				
				System.out.print(n1 + " / " + n2 + " = ");
				answer = input.nextInt();
				
				if ((n1 / n2) == answer)
					correctCounter++;
			}
		}
		
		System.out.print("Correct answers: " + correctCounter + "/10"
				+ "\nTime took: " + (System.currentTimeMillis() - startTime) / 1000 + " seconds");
		
		input.close();
	}

}
