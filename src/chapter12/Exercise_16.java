package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import sun.font.CreatedFontTracker;

/**
 * Replace text
 * Listing 12.16, ReplaceText.java, gives a program that replaces text in a source file and saves the change into a new file. 
 * Revise the program to save the change into the original file. 
 * For example, invoking java Exercise12_16 file oldString newString replaces oldString in the source file with newString.
 * 
 * 09/09/2019   3:25:01 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_16
 *
 */
public class Exercise_16 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter File Name, oldString, newString:");
		String[] argss = new String[3];
		argss[0] = input.next();
		argss[1] = input.next();
		argss[2] = input.next();
		
		input.close();
		if (argss.length != 3)
		{
			System.out.println("Missing arguements: file oldString newString");
			System.exit(0);
		}
		
		File sourceFile = new File("RomaniFiles\\" + argss[0]);
		if(!sourceFile.exists())
		{
			System.out.println("File not Found");
			createNewFile(sourceFile);
			System.out.println("But we Create Once for You..");
		}
		
		StringBuilder sb = new StringBuilder();
		
		try (Scanner readFile = new Scanner(sourceFile);)
		{
			while (readFile.hasNext())
			{
				String s1 = readFile.nextLine();
				String s2 = s1.replaceAll(argss[1], argss[2]);
				sb.append(s2);
			}
			
			readFile.close();
		}
		
		try (PrintWriter writer = new PrintWriter(sourceFile))
		{
			writer.printf("%s", sb.toString());
			System.out.println("We replaces "+ argss[1] + " in the " + argss[0] +" with " + argss[2]+ ".");
			sourceFile.toPath();
		}
		
		
	}
	
	public static void createNewFile(File file)
	{
		try {
			file.createNewFile();
			
			PrintWriter writer = new PrintWriter(file);
			writer.println("hello and welcome to our program ");
			writer.println("and we can help you to understand programming very well  ");
			writer.println("you can apply with us to the perfect program ");
			writer.println("do you convert with thank you for believing us..best wishes for you all....");
			
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
