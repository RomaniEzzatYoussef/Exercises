package chapter10;
/**
 ** Implement the String class
 * The String class is provided in the Java library. 
 * Provide your own implementation for the following methods (name the new class MyString1):
 * public MyString1(char[] chars);
 * public char charAt(int index);
 * public int length();
 * public MyString1 substring(int begin, int end);
 * public MyString1 toLowerCase();
 * public boolean equals(MyString1 s);
 * public static MyString1 valueOf(int i);
 * 
 * 21/04/2019   6:58:15 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_22
 *
 */
public class Exercise_22 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.print(MyString1.valueOf(123).charAt(0));
	}

}
