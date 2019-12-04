package chapter10;

import java.util.Scanner;

import utilities.StackOfIntegers;

public class Exercise_05 
{
	public static void main(String[] args) throws Exception 
	{
		StackOfIntegers primeFactors = new StackOfIntegers(8);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		int factor = 2;
		
		while (number != 1)
		{
			if ((number % factor) == 0)
			{
				primeFactors.push(factor);
				number /= factor;
			}
			else
				factor++;
		}
		
		while (primeFactors.getSize() != 0)
			System.out.print(primeFactors.pop() + " ");
		
		input.close();
	}
}
