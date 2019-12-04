package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * 22/05/2019   6:36:18 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_13
 *
 */
public class Exercise_13 
{

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException 
	{
		if (args.length != 1)
		{
			System.out.println("Missing Arguments.");
			System.exit(0);
		}
		
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists())
		{
			System.out.println("Source File does not exist.");
			System.exit(1);
		}
		
		Scanner input = new Scanner(sourceFile);
		int characters = 0, words = 0, lines = 0;
		
		while (input.hasNext())
		{
			String s = input.nextLine();
			lines++;
			
			String[] split = s.split(" ");
			
			for (int i = 0; i < split.length; i++)
				if (split[i].length() == 1)
					characters++;
				else
					words++;
		}
		
		System.out.print("Lines: " + lines +
				"\nWords: " + words +
				"\nCharacters: " + characters);
		
		input.close();
		
	}

}
