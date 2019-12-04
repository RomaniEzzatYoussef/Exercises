package RomaniTests.new_oop_tests;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		boolean continueInput = true;
		
		do
		{
			try
			{
				System.out.print("Enter an integer: ");
				int num = input.nextInt();
				
				System.out.println("The number entered is " + num);
				
				continueInput = false;
			}
			
			catch(InputMismatchException ex)
			{
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine();
			}
		
		} while (continueInput);
		
		
		
		
		input.close();
	}
}
