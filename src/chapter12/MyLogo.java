package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyLogo
{
    public static void main(String[] args)
	{
		File myFile = new File("E:\\work\\IntelliJ IDEA Projects\\Exercises\\RomaniFiles\\MyLogo");

		try (Scanner input = new Scanner(myFile))
		{
			StringBuilder fileContent = new StringBuilder();
			while(input.hasNext())
			{
				fileContent.append(input.nextLine() + "\n");
			}

			System.out.println(fileContent.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
