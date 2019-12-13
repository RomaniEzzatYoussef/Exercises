package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise_21
{
    public static void main(String[] args)
    {
        String filepath = "E:\\work\\IntelliJ IDEA Projects\\Exercises\\RomaniFiles\\chapter_12\\Exercise_21.txt";
        File file = new File(filepath);

        if (!file.exists())
        {
            System.out.println("Missing File.");
            System.exit(0);
        }

        if (isSorted(file))
        {
            System.out.print("File is sorted.");
        }

    }

    public static boolean isSorted(File file)
    {
        try (Scanner reader = new Scanner(file))
        {
            String string1, string2 = null;

            while (reader.hasNext())
            {
                if (string2 != null)
                {
                    string1 = string2;
                    string2 = reader.next();
                }
                else
                {
                    string1 = reader.next();
                    string2 = reader.next();
                }

                System.out.println("S1: " + string1 + " S2: " + string2);

                int minSize = Math.min(string1.length(), string2.length());

                if (string1.charAt(0) < string2.charAt(0))
                    continue;
                else if (string1.charAt(0) > string2.charAt(0))
                {
                    System.out.print(string1 + " " + string2);
                    return false;
                }
                else
                    for (int i = 1; i < minSize; i++)
                        if (string1.charAt(i) > string2.charAt(i))
                        {
                            System.out.print(string1 + " " + string2);
                            return false;
                        }
                if (string1.length() > string2.length())
                {
                    System.out.print(string1 + " " + string2);
                    return false;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return true;
    }
}


/*
 ___________________________________________________________________________________
|   ___                                                                             |
|  |   \___________                                                                 |
|  |     ______    |                                                                |
|  |    /      \   |                                                                |
|  |   (        )  |                                                          __    |
|  |    \______/   |                   _                            _        (__)   |
|  |    ____   ____/     _________    | \___________     ________  | \_____   __    |
|  |   |    \  \        /  _____  \   |  __     __  )   /  __    | |  ___  ) |  |   |
|  |   |     \  \      /  /     \  \  | |  \   /  | |  /  /  |   | | |   | | |  |   |
|  |   |      \  \    (  (       )  ) | |   | |   | | (  (   |   | | |   | | |  |   |
|  |   |_      \  \__  \  \_____/  /  | \   | |   / |  \  \_ |   | | |_  | | |  |   |
|  |_____|      |____|  \_________/   \_/   |_|   \_/   \___||___| \__/  |_| |__|   |
|                                                                                   |
|                                                                                   |
|   ____                                                                            |
|  |    \__________                                                                 |
|  |     __________|                                                                |
|  |    |                                                                           |
|  |    |                                             __                            |
|  |    |__________   ______    ______     ________  |  |__                         |
|  |     __________| |___   |  |___   |   /  __    | |   __)                        |
|  |    |               /  /      /  /   /  /  |   | |  |                           |
|  |    |              /  /      /  /   (  (   |   | |  |                           |
|  |    |__________   /  /___   /  /___  \  \_ |   | |  |____                       |
|  |_______________| |_______| |_______|  \___||___|  \______)                      |
|                                                                                   |
|___________________________________________________________________________________|


 */