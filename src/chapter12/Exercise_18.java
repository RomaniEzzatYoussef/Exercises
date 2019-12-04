package chapter12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_18
{
    public static void main(String[] args) throws Exception
    {
        String[] arg = {"E:\\work\\IntelliJ IDEA Projects\\Exercises\\RomaniFiles\\chapter_12\\Exercise_18"};
        if (arg.length != 1)
        {
            System.out.print("Enter source root directory.");
            System.exit(0);
        }

        File currentDir = new File(arg[0]);

        if (!currentDir.exists())
        {
            System.out.println("Current directory " + arg[0] + " does not exist.");
            System.exit(1);
        }

        if (!currentDir.isDirectory())
        {
            System.out.print(arg[0] + " is not a directory.");
            System.exit(2);
        }
        else
        {
            File[] files = currentDir.listFiles();

            for (int i = 0; i < files.length; i++)
                if (files[i].isDirectory() && files[i].getName().startsWith("chapter"))
                {
                    String packageStatment = "package " + files[i].getName() + ";\n";
                    insertIntoFilesInDirectory(files[i], packageStatment);
                }
        }
    }

    private static void insertIntoFilesInDirectory(File directory, String line) throws Exception
    {
        File[] files = directory.listFiles();

        for (int i = 0; i < files.length; i++)
            if (files[i].isFile() && files[i].getName().endsWith(".txt"))
            {
                insertPackageStatment(files[i], line);
            }
    }

    private static void insertPackageStatment(File file, String line) throws Exception
    {
        StringBuilder sb = new StringBuilder(line);

        try (Scanner input = new Scanner(file);)
        {
            while (input.hasNext())
                sb.append("\n" + input.nextLine());
        }
        try (PrintWriter output = new PrintWriter(file);)
        {
            output.printf("%s\n", sb.toString());
        }
    }
}
