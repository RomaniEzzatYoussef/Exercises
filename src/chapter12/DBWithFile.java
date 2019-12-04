package chapter12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;


/**
 *
 * 22/05/2019 8:50:08 PM
 * 
 * @author Romani Ezzat
 *
 *
 *         Exercise_14
 *
 */
public class DBWithFile {

	static File file = new File("E:\\work\\oxygen\\Exercises\\RomaniFiles\\books.txt");

	public static void main(String[] args) throws FileNotFoundException 
	{
		writeFile();
		System.out.println("The File is created successfuly");

		copyFile("E:\\work\\oxygen\\Exercises\\RomaniFiles\\books.txt",
				"E:\\work\\oxygen\\Exercises\\RomaniFiles\\booksCopy.txt");
		System.out.println("The File is copied successfuly");

	}

	public static void writeFile() 
	{
		SQLiteJDBCDriverConnection db = new SQLiteJDBCDriverConnection();
		ArrayList<String> bookList = db.getBookList();

		try {
			PrintWriter output = new PrintWriter(file);

			for (int i = 0; i < bookList.size(); i++) 
			{
				if (i % 10 == 0)
					output.printf("\n%-2s%-1s", bookList.get(i).toString(), " ");
				else
					output.printf("%-2s%-1s", bookList.get(i).toString(), " ");
			}

			output.close();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void copyFile(String soursePath, String destinationPath) 
	{
		InputStream inputStream = null;
		OutputStream output = null;
		byte[] buffer = new byte[8192];
		int length = 0;

		try {
			inputStream = new FileInputStream(soursePath);
			output = new FileOutputStream(destinationPath);

			while (true) {

				if (!((length = inputStream.read(buffer, 0, 8192)) > 0))
					break;

				output.write(buffer, 0, length);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
