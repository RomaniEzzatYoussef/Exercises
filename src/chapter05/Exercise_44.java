package chapter05;

import java.util.Scanner;

/**
 * Computer architecture: bit-level operations
 * A short value is stored in 16 bits. 
 * Write a program that prompts the user to enter a short integer and displays the 16 bits for the integer.
 * 
 * 30/11/2017   8:52:39 AM
 *  
 * @author roman
 *
 *
 * Exercise_44
 *
 */
public class Exercise_44 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println(5 >> 15);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		
		int number = input.nextInt();

        System.out.print("The bits are ");

        for (int i = 15; i >= 0; i--) 
        {
            System.out.print((number >> i) & 1);
        }
        
		input.close();
	}

}
