package chapter01;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *
 * 05/03/2019   12:40:06 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_00
 *
 */
public class Test 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a message to show:");
		String message = input.next();
		System.out.print(message);
		
		System.out.println(1 / 0);
		
		//JOptionPane.showMessageDialog(null, message);
		
		System.out.print("3.5 * 4 / 2 – 2.5 is ");
		System.out.print(3.5 * 4 / 2 - 2.5);

	}

}
