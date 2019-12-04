package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * 19/07/2019   7:32:50 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_14
 *
 */
public class Exercise_14 
{

	/**
	 * @param args
	 */
	
	static File file = new File("E:\\work\\oxygen\\Exercises\\RomaniFiles\\scores.txt");

	public static void main(String[] args) 
	{
//		writeFile();
		System.out.println("The File is created successfuly");
		
		boolean correctName = false;

		while (!correctName) 
		{
			try (Scanner textReader = new Scanner(file);) 
			{
				double total = 0;
				int scoreCounter = 0;

				while (textReader.hasNext())
				{
					String line = textReader.nextLine();
					line = line.replaceAll("[^0-9]", " ");
					String[] scoreList = line.trim().split(" ");

					for (int i = 0; i < scoreList.length; i++) 
					{
						total += Integer.parseInt(scoreList[i]);
						scoreCounter++;
					}
				}

				System.out.println("Total is " + total + "\nAverage is " + (total / scoreCounter));
				correctName = true;
			} 
			
			catch (Exception ex) 
			{
				System.out.print(ex.getMessage());
			}
		}


	}
	
	public static void writeFile()
	{
		PrintWriter output;
		try 
		{
			 output = new PrintWriter(file);
			 
			 for (int i = 0; i < 100; i++)
			 {
				 if (i % 10 == 0)
					 output.printf("\n%S%s" , (int)(Math.random() * 100) , " ");
				 else
					 output.printf("%S%s" , (int)(Math.random() * 100) , " ");
			 }
			 
			 
			 output.close();

		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	}

}
