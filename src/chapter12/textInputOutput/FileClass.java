package chapter12.textInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;
import javafx.scene.image.Image;

/**
 *
 * 08/05/2019 6:37:44 AM
 * 
 * @author Romani Ezzat
 *
 *
 *         FileClass
 *
 */
public class FileClass {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws Exception {
		File f1 = new File("E:\\work\\scores2.txt");
		if (!f1.exists()) {
			System.out.println("Sourse File " + f1.getAbsolutePath() + " does not exist");
			System.exit(1);
		}

		File f2 = new File("E:\\work\\scores3.txt");
		if (f2.exists()) {
			System.out.println("Target File " + f1.getAbsolutePath() + " already exists");
			System.exit(2);
		}

		try (Scanner input = new Scanner(f1); PrintWriter output = new PrintWriter(f2);) {
			while (input.hasNext()) {
				String s1 = input.nextLine();
				String s2 = s1.replaceAll(s1, s1);
				output.println(s2);
			}
		}
	}
	
	public static void replaceText(String[] args) throws Exception
	{
		if (args.length != 4) {
			System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
			System.exit(1);
		}

		File f1 = new File(args[0]);
		if (!f1.exists()) {
			System.out.println("Sourse File " + args[0] + " does not exist");
			System.exit(2);
		}

		f1 = new File(args[1]);
		if (f1.exists()) {
			System.out.println("Target File " + args[1] + " already exists");
			System.exit(3);
		}

		try (Scanner input = new Scanner(f1); PrintWriter output = new PrintWriter(f1);) {
			while (input.hasNext()) {
				String s1 = input.nextLine();
				String s2 = s1.replaceAll(args[2], args[3]);
				output.println(s2);
			}
		}
	}

	public static void scannFile() throws Exception {
		File f = new File("E:\\work\\scores.txt");
		Scanner input = new Scanner(f);

		while (input.hasNext()) {
			String firstName = input.nextLine();
			// String mi = input.next();
			// String lastName = input.next();
			// int score = input.nextInt();
			// System.out.println(firstName + " " + mi + " " + lastName + " " +
			// score);
			System.out.println(firstName);
		}
		input.close();
	}

	public static void writeFileWithTryNotClose() throws Exception {
		File f = new File("E:\\work\\scoresWithTryNotClose.txt");

		if (f.exists()) {
			System.out.println("file already exists");
			System.exit(1);
		}

		try (PrintWriter output = new PrintWriter(f);) {
			String message = "";

			for (int i = 1; i < 100; i++) {
				for (int e = 1; e < 11; e++)
					message += message.format("%-5d", i * e);
				message += "\n";
			}

			output.print("John T Smith ");
			output.println(90);
			output.print("Eric K Jones ");
			output.println(85);
			output.print(message);

		}
	}

	public static void writeFile() throws FileNotFoundException {
		File f = new File("E:\\work\\scores.txt");

		if (f.exists()) {
			System.out.println("file already exists");
			System.exit(1);
		}

		PrintWriter output = new PrintWriter(f);
		String message = "";

		for (int i = 1; i < 100; i++) {
			for (int e = 1; e < 11; e++)
				message += message.format("%-5d", i * e);
			message += "\n";
		}

		output.print("John T Smith ");
		output.println(90);
		output.print("Eric K Jones ");
		output.println(85);
		output.print(message);

		output.close();
	}

	public static void imageFile() {
		File f1 = new File("E:\\Pictures\\Kristo.png");

		System.out.println("Does it exist? " + f1.exists() + "\nThe file has " + f1.length() + " bytes"
				+ "\nCan it be raed? " + f1.canRead() + "\nCan it be written? " + f1.canWrite()
				+ "\nIs it a directory? " + f1.isDirectory() + "\nIs it a file? " + f1.isFile() + "\nIs it absolute? "
				+ f1.isAbsolute() + "\nIs it hidden? " + f1.isHidden() + "\nAsolute path is " + f1.getAbsolutePath()
				+ "\nlast modified on " + new Date(f1.lastModified()));
		f1.renameTo(new File("E:\\Pictures\\Kris.png"));
	}

}
