package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.security.Signer;
import java.util.Scanner;

import javax.sound.midi.SoundbankResource;
import javax.swing.JFileChooser;

/**
 *
 * 21/05/2019 7:56:01 PM
 * 
 * @author Romani Ezzat
 *
 *
 *         Exercise_12
 *
 */
public class Exercise_12 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		File sourceFile = getCurrentFile();

		System.out.println("The File Before Editing: ");
		printFile(sourceFile);

		System.out.println("The File After Editing: ");
		convertNextlineBraceStyle(sourceFile);
		printFile(sourceFile);

	}
	
	public static File getCurrentFile()
	{
		JFileChooser fileChooser = new JFileChooser();
		
		if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION)
		{
			return fileChooser.getSelectedFile();
		}
		
		return getCurrentFile();
	}

	public static void printFile(File sourceFile) throws FileNotFoundException 
	{
		

		Scanner input = new Scanner(sourceFile);

		String s = "";
		while (input.hasNext()) 
		{
			s += "\n" + input.nextLine();
		}

		System.out.println(s);
	}

	public static void convertNextlineBraceStyle(File sourceFile) throws FileNotFoundException 
	{
		if (!sourceFile.exists()) 
		{
			System.out.print("Text file not found!");
			System.exit(1);
		}

		StringBuilder buffer = new StringBuilder();
		Scanner input = new Scanner(sourceFile);

		while (input.hasNext()) 
		{
			String s = input.nextLine();
			String s1 = s.trim();

			if (s1.contains("{"))
			{
				if (s1.length() > 1)
				{
					buffer.append("\n" + s.replace('{', ' '));
					buffer.append("\n{\n");
				}
			} else
				buffer.append("\n" + s);
		}

		input.close();

		PrintWriter output = new PrintWriter(sourceFile);
		output.print(buffer.toString());
		output.close();
	}
	
	public static void convertEndlineBraceStyle(File sourceFile) throws FileNotFoundException 
	{
		if (!sourceFile.exists()) 
		{
			System.out.print("Text file not found!");
			System.exit(1);
		}

		StringBuilder buffer = new StringBuilder();
		Scanner input = new Scanner(sourceFile);

		while (input.hasNext()) {
			String s = input.nextLine();
			String s1 = s.trim();

			if (s1.charAt(0) == '{') {
				buffer.append(" {");
				if (s1.length() > 1)
					buffer.append("\n" + s.replace('{', ' '));
			} else
				buffer.append("\n" + s);
		}

		input.close();

		PrintWriter output = new PrintWriter(sourceFile);
		output.print(buffer.toString());
		output.close();
	}

}
