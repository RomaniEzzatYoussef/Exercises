package chapter04;

import java.util.Scanner;

/**
 *
 * 15/11/2017   8:01:48 PM
 *  
 * @author roman
 *
 *
 * Test_04
 *
 */
public class Test_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("He said \"Java is fun\"");
		
		char ch = (char) 0XAB0041;
		System.out.println(ch);
		
		char ch1 = (char) 65.25;
		System.out.println(ch1);
		
		int ch2 = (int) 'A';
		System.out.println(ch2);
		
		byte b = 'b';
		int a = 'a';
		System.out.println("a = " + a + " b = " + b);
		
		byte c = (byte)'\uFFF4';
		System.out.println(c);
		
		int i = '2' + '3';
		System.out.println("i is " + i);
		
		int j = 2 + 'a';
		System.out.println("j is " + j);
		System.out.println(j + " is the unicode for " + (char) j);
		
		System.out.println("Chapter " + (int) '4');
		
		System.out.println("isDigit('a') is " + Character.isDigit('a'));
		System.out.println("isLetter('a') is " + Character.isLetter('a'));
		System.out.println("isLowerCase('a') is " + Character.isLowerCase('a'));
		System.out.println("isUpperCase('a') is " + Character.isUpperCase('a'));
		System.out.println("toLowerCase('T') is " + Character.toLowerCase('T'));
		System.out.println("toUpperCase('q') is " + Character.toUpperCase('q'));
		
		
		int z = (int)'A';
		System.out.println(z + " is the unicode for " + (char) z);
		
		char M = 'M';
		int l = 77;
		
		System.out.println("ASCII unicode for 'M' is " + (int)M);
		System.out.println(M + " is Character is " + (char)l);
		
		char ou = '\u007A';
		System.out.println(ou); 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String C = input.nextLine();
		char CH = C.charAt(0);
		
		if (CH >= 'A' && CH <= 'Z')
			System.out.println(ch + " is an uppercase letter");
		
		else if (CH >= 'a' && CH <= 'z')
			System.out.println(ch + " is an lowercase letter");
		
		else if (CH >= '0' && CH <= '9')
			System.out.println(ch + " is a numeric character");
		
		input.close();
	}

}
