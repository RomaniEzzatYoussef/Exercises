package chapter07;

import java.util.Random;
import java.util.Scanner;

/**
 * Sort students
 * Write a program that prompts the user to enter the number of students, the students’ names, and their scores, 
 * and prints student names in decreasing order of their scores.
 * 
 * 05/12/2017   7:43:20 PM
 *  
 * @author roman
 *
 *
 * Exercise_17
 *
 */
public class Exercise_17 
{
	static Scanner input = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.print("Enter the number of students: ");
		int size = input.nextInt();
		String[] studentName = new String[size];
		double[] studentScore = new double[size];
		
		studentStudentScore(studentName, studentScore);
		displayStudentNameGrade(studentName, studentScore);
		
		sortStudentByGrade(studentName, studentScore);
		displayStudentNameGrade(studentName, studentScore);
		
		input.close();
	}
	
	/**
	 * Display student's name and their score
	 * 
	 * @param studentName
	 * @param studentScore
	 */
	public static void displayStudentNameGrade(String[] studentName, double[] studentScore)
	{
		System.out.printf("\n%-15s%s\n", "Name", "Score");
		
		for (int i = 0; i < studentName.length; i++)
			System.out.printf("%-15s%s\n", studentName[i], studentScore[i]);
	}
	
	/**
	 * Sort student names and score in decreasing order of their score
	 * 
	 * @param studentName
	 * @param studentScore
	 */
	public static void sortStudentByGrade(String[] studentName, double[] studentScore)
	{
		for (int i = 0; i < studentName.length - 1; i++)
			for (int j = i + 1; j < studentName.length; j++)
				if (studentScore[i] < studentScore[j])
					swap(studentName, i, studentScore, j);
	}
	
	/**
	 * Swap student's name and score
	 * 
	 * @param studentScore
	 * @param i
	 * @param studentScore
	 * @param j
	 */
	public static void swap(String[] studentName, int i, double[] studentScore, int j)
	{
		String tempName = studentName[i];
		studentName[i] = studentName[j];
		studentName[j] = tempName;
		
		double tempScore = studentScore[i];
		studentScore[i] = studentScore[j];
		studentScore[j] = tempScore;
	}
	
	/**
	 * Prompts the user to enter the student's name and their score
	 * 
	 * @param studentName
	 * @param studentScore
	 */
	public static void studentStudentScore(String[] studentName, double[] studentScore)
	{
		Random r = new Random();
		for (int i = 0; i < studentName.length; i++)
		{
			//System.out.print("Enter student " + (i + 1) + "'s name: ");
			
			char[] c = new char[7];
			String name = "";
			for (int e = 0; e < 7; e++)
			{
				c[e] = (char) (r.nextInt(26) + 'a');
			}
			
			for (int e = 0; e < 7; e++)
			{
				name += c[e];
			}
			
			studentName[i] = name;
			//System.out.print("Enter " + studentName[i] + "'s score: ");
			studentScore[i] = r.nextInt(101);
		}
	}
}
