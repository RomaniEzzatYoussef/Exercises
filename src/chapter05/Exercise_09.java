package chapter05;

import java.util.Scanner;

/**
 * Find the two highest scores
 * Write a program that prompts the user to enter the number of students and each student’s name and score, 
 * and finally displays the student with the highest score and the student with the second-highest score.
 *
 * 29/11/2017   10:57:54 AM
 *  
 * @author roman
 *
 *
 * Exercise_09
 *
 */
public class Exercise_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numStudents = input.nextInt();
		
		input.nextLine(); 
		
		System.out.print("Enter the student's name and score: ");
		String studentNameScore = input.nextLine(); 
		int studentScore = Integer.parseInt(studentNameScore.substring(studentNameScore.indexOf(' ') + 1, studentNameScore.length()));
		
		String topStudent2 = null;
		
		for (int i = 1; i < numStudents; i++)
		{
			System.out.print("Enter the student's name and score: ");
			String tempNameScore = input.nextLine(); 
			int tempScore = Integer.parseInt(tempNameScore.substring(tempNameScore.indexOf(' ') + 1, tempNameScore.length()));
			
			if (studentScore < tempScore)
			{
				topStudent2 = studentNameScore;
				studentNameScore = tempNameScore;
			}
		}
		
		System.out.print("The top student is " + studentNameScore.substring(0, studentNameScore.indexOf(' '))
							+ "\nThe 2nd top student is " + topStudent2.substring(0, topStudent2.indexOf(' ')));
		input.close();
	}

}
