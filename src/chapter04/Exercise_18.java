package chapter04;

import java.util.Scanner;

/**
 * Student major and status
 * Write a program that prompts the user to enter two characters and displays the major and status represented in the characters. 
 * The first character indicates the major and the second is number character 1, 2, 3, 4, 
 * which indicates whether a student is a freshman, sophomore, junior, or senior.
 * Suppose the following characters are used to denote the majors: 
 * M: Mathematics 
 * C: Computer Science 
 * I: Information Technology
 *
 * 18/11/2017   10:49:00 PM
 *  
 * @author roman
 *
 *
 * Exercise_18
 *
 */
public class Exercise_18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("M: Mathematics \n"
				+ "C: Computer Science \n"
				+ "I: Information Technology \n"
				+ "Enter your major: ");
		char m = input.next().charAt(0);
		
		System.out.print("1 Freshman\n"
				+ "2 Sophomore\n"
				+ "3 Junior\n"
				+ "4 Senior\n"
				+ "Enter your status: ");
		int s = input.nextInt();
		
		String major, status;
		
		if (m == 'M')
			major = "Mathematics";
		else if (m == 'C')
			major = "Computer Science";
		else
			major = "Information Technology";
		
		if (s == 1)
			status = "Freshman";
		else if (s == 2)
			status = "Sophomore";
		else if (s == 3)
			status = "Junior";
		else
			status = "Senior";
		
		System.out.print("You are a " + status + " majoring in " + major);
		
		input.close();
	}

}
