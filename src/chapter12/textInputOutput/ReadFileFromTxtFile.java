package chapter12.textInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * 13/05/2019   7:34:41 AM
 *  
 * @author Romani Ezzat
 *
 *
 * ReadFileFromTxtFile
 *
 */
public class ReadFileFromTxtFile 
{

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException 
	{
		System.out.print("Enter file location: ");
		String location = (new Scanner(System.in)).next();
		File f1 = new File(location);
		
		location += "\n\n";
		try{
			Scanner input = new Scanner(f1);
			
			while (input.hasNext())
			{
				location += input.nextLine() + "\n";
			}
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(location);
		
		File f2 = new File("E:\\work\\feuser.txt");
		
		PrintWriter output = new PrintWriter(f2);
		output.print(location);
		System.out.println("File " + f2.getName() + " is printed");
		output.close();
	}

}
