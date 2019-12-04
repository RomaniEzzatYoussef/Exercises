package chapter12.textInputOutput;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * 08/05/2019 6:30:54 PM
 * 
 * @author Romani Ezzat
 *
 *
 *         ReadFileFromURL
 *
 */
public class ReadFileFromURL {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		System.out.print("Enter a URL: ");
		String urlString = new Scanner(System.in).next();
		URL url = new URL(urlString);
		try {
			int count = 0;
			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				String line = input.nextLine();
				count += line.length();

			}

			System.out.println("The file size is " + count + " characters");

			input.close();
		} catch (MalformedURLException e) {
			System.out.println("Invalid URL.");
		} catch (IOException e) {
			System.out.println("I/O Errors: no such file");
		}

		File f2 = new File("E:\\work\\rommnai.txt");
		String s1 = "";
		try (Scanner input = new Scanner(url.openStream()); PrintWriter output = new PrintWriter(f2);) {
			while (input.hasNext()) {
				s1 += input.nextLine();

			}

			output.println(s1);
		}

	}

}
