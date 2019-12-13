package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShowChars
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter your chars: ");
            processFiles(input.next());
        }


    }

    public static void processFiles(String chars)
    {
        String path = "E:\\work\\IntelliJ IDEA Projects\\Exercises\\RomaniFiles\\chars\\";
        File[] files = new File[chars.length()];

        for (int i = 0; i < chars.length(); i++)
        {
            files[i] = new File(path + chars.charAt(i) + ".txt");
        }

        printCharFile(files);
    }

    public static void printCharFile(File[] files)
    {
        String[][] chars = new String[files.length][13];

        for (int r = 0; r < files.length; r++)
        {
            try (Scanner reader = new Scanner(files[r]))
            {
                int c = 0;
                while(reader.hasNext() & c < 13)
                {
                    String line = reader.nextLine();
                    chars[r][c] = line;
                    c++;
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        StringBuilder myChars = new StringBuilder();
        for (int c = 0; c < 13; c++)
        {
            for (int r = 0; r < chars.length; r++)
            {
                myChars.append(chars[r][c].replace("." , " ") + "    ");
            }
            myChars.append("\n");
        }

        System.out.print(myChars);
    }
}
