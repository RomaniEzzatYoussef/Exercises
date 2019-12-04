package chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * 07/05/2019   6:58:27 AM
 *  
 * @author Romani Ezzat
 *
 *
 * InputMismuchException
 *
 */
public class InputMismachException 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		
		do {
			try {
				System.out.print("Enter an integer: ");
				int num = input.nextInt();
				
				System.out.println("then number entered is: " + num);
				
				continueInput = false;
				
			} catch (InputMismatchException e) {
				System.out.println("Try again , (Incorrect input: an integer is required)");
				input.nextLine();
			}
		} while (continueInput);
		
		
		input.close();
	}

}
