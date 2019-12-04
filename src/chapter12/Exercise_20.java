package chapter12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_20
{
    public static void main(String[] args) throws Exception
    {
        String[] arg = {"E:\\work\\IntelliJ IDEA Projects\\Exercises\\RomaniFiles\\chapter_12\\Exercise_20"};
        if (arg.length != 1)
        {
            System.out.println("Usage: srcRootDirectory");
            System.exit(1);
        }

        File currentDir = new File(arg[0]);

        if (!currentDir.exists())
        {
            System.out.println("Current directory " + arg[0] + " does not exist");
            System.exit(2);
        }

        if (!currentDir.isDirectory())
        {
            System.out.println(arg[0] + " is not a directory");
            System.exit(3);
        }
        else
        {
            File[] files = currentDir.listFiles();
            for (int i = 0; i < files.length; i++)
                if (files[i].isDirectory() && files[i].getName().startsWith("chapter"))
                    removePackageStatementFromFilesInDirectory(files[i]);

        }
    }

    private static void removePackageStatementFromFilesInDirectory(File directory) throws Exception
    {
        File[] files = directory.listFiles();

        for (int i = 0; i < files.length; i++)
            if (files[i].isFile() && files[i].getName().endsWith(".txt"))
                removePackageStatment(files[i]);
    }

    private static void removePackageStatment(File file) throws Exception
    {
        StringBuilder sb = new StringBuilder();

        try (Scanner input = new Scanner(file))
        {
            String firstLine = input.nextLine();

            if (!firstLine.startsWith("package"))
                sb.append(firstLine + "\n");

            while (input.hasNext())
                sb.append(input.nextLine() + "\n");
        }

        try (PrintWriter output = new PrintWriter(file);)
        {
            output.printf("%s", sb.toString());
        }
    }
}
