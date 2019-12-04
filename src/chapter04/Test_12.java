package chapter04;

import java.util.Scanner;

/**
 *
 * 15/03/2019   11:11:13 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Test_12
 *
 */
public class Test_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String s1 = "I am here...";
		String s2 = " Not Fine";
		
		String s = "Welcome to Java";
		String s3 = s1 + s2;
		//String s3 = s1 - s2;
		//s1 == s2;
		//s1 >= s2;
		s1.compareTo(s2);
		int i = s1.length();
		char c = s1.charAt(0);
		char c1 = s1.charAt(s1.length()-1);
		
		System.out.println(s3 + "    " + s1.compareTo(s2) +" " +c + "\n\n------------------");
		
		System.out.println("1" + 1);
		System.out.println('1' + 1);
		System.out.println("1" + 1 + 1);
		System.out.println("1" + (1 + 1));
		System.out.println('1' + 1 + 1);
		
		
		System.out.println(1 + "Welcome " + 1 + 1);
		System.out.println(1 + "Welcome " + (1 + 1));
		System.out.println(1 + "Welcome " + ('\u0001' + 1));
		System.out.println(1 + "Welcome " + ('a' + 1));
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three words separated by spaces: ");
		String ss1 = input.next();
		String ss2 = input.next();
		String ss3 = input.next();
		System.out.println("s1 is " + ss1);
		System.out.println("s2 is " + ss2);
		System.out.println("s3 is " + ss3);
		
		input.close();
		
		char x = 'a';
		char y = 'c';
		System.out.println(++x);
		System.out.println(y++);
		System.out.println(x - y);
		
		System.out.println('a' < 'b');
		System.out.println('a' <= 'A');
		System.out.println('a' > 'b');
		System.out.println('a' >= 'A');
		System.out.println('a' == 'a');
		System.out.println('a' != 'b');
	}

}
