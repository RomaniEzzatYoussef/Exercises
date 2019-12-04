package chapter04;

import java.util.Scanner;

/**
 *
 * 16/11/2017   6:55:24 PM
 *  
 * @author roman
 *
 *
 * Test_07
 *
 */
public class Test_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String message = "\"Welcome to Java\"";
		System.out.println("The length of " + message + " is " + message.length());
		
		System.out.println(message.charAt(message.length() - 2));
		
		message += " and java is fun";
		System.out.println(message);
		
		System.out.println("\t Good Night \t\n" + "\t Good Night \n".trim());
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter three words separated by spaces: ");
		String s1 = input.next();
		String s2 = input.next();
		String s3 = input.next();
		
		System.out.println("s1 is " + s1);
		System.out.println("s2 is " + s2);
		System.out.println("s3 is " + s3);
		
		System.out.print("Enter a character: ");
		String s = input.next();
		char ch = s.charAt(0);
		System.out.println("The character entered is " + ch);
		
		input.close();
	}

}
