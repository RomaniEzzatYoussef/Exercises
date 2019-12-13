package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ConvertFileToDots
{
    public static void main(String[] args)
    {
        File myFile = new File("E:\\work\\IntelliJ IDEA Projects\\Exercises\\RomaniFiles\\logo");

        StringBuilder fileContent = new StringBuilder();
        try (Scanner input = new Scanner(myFile);)
        {

            while(input.hasNext())
            {
                fileContent.append(input.nextLine() +"\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (PrintWriter output = new PrintWriter(myFile))
        {
            output.print(fileContent.toString().replaceAll(" " , "."));
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
