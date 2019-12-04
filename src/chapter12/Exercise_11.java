package chapter12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * 21/05/2019   7:42:24 AM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_11
 *
 */
public class Exercise_11 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		if (args.length != 1)
		{
			System.out.println("Argument not found.");
			return;
		}
		
		File myTextFile = new File(args[0]);
		if (myTextFile.exists())
			System.out.println("Text File exist!");
		else
			System.out.println("Text file does not exist!");
		
		String editString = "";
		
		try
		{
			Scanner textReader = new Scanner(myTextFile);
			
			while (textReader.hasNextLine())
				editString += textReader.nextLine();

			System.out.println("contents of R File: " + editString);
			
			textReader.close();
		}
		
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		editString = editString.replaceAll("Hello", "");
		
		
		try 
		{
			PrintWriter editer = new PrintWriter(myTextFile);
			editer.write(editString);
			System.out.println("Editor finish editing.");
			
			editer.close();
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
