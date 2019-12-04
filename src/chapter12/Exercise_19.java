package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise_19
{
    static String filepath = "E:\\work\\IntelliJ IDEA Projects\\Exercises\\RomaniFiles\\chapter_12\\Exercise_19.txt";

    public static void main(String[] args)
    {
        File fileName = new File(filepath);
        if (!fileName.exists())
        {
            System.out.print("File does not exist.");
            System.exit(0);
        }

        try (Scanner input  = new Scanner(fileName))
        {
            int wordCounter = 0;

            while (input.hasNext())
            {
                String word = input.next();

                if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z' || word.charAt(0) >= 'a' && word.charAt(0) <= 'z')
                    wordCounter++;
            }

            System.out.print("There are " + wordCounter + " words.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
