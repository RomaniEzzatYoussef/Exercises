package chapter10;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * 15/04/2019   7:54:42 AM
 *  
 * @author Romani Ezzat
 *
 *
 * TestObjects
 *
 */
public class StringTestObjects 
{
	public StringTestObjects() 
	{
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("The maximum integer is " + Integer.MAX_VALUE);
		System.out.println("The minimum positive float is " + Float.MIN_VALUE);
		System.out.println("The maximum double-precision floating-point number is " + Double.MAX_VALUE);
		
		System.out.println(new Double(12.4).compareTo(new Double(12.3))); //returns 1;
		System.out.println(new Double(12.3).compareTo(new Double(12.3))); //returns 0;
		System.out.println(new Double(12.3).compareTo(new Double(12.51))); //returns -1;
		
		Double doubleObject = Double.valueOf("12.4");
		Integer integerObject = Integer.valueOf("12");
		
		System.out.println(Double.valueOf("15.4"));
		
		int a = Integer.parseInt("1254");
		
		StringBuilder s = new StringBuilder(a);
		
		System.out.println(a);
		System.out.println(s + "//85");
		
		
		System.out.println(Integer.parseInt("11", 2)); //returns 3;
		System.out.println(Integer.parseInt("12", 8)); //returns 10;
		System.out.println(Integer.parseInt("13", 10)); //returns 13;
		System.out.println(Integer.parseInt("1A", 16)); //returns 26;
		System.out.println(String.format("%x", 45)); //returns 1A;
		
		System.out.println(Integer.parseInt("10"));
		System.out.println(Integer.parseInt("10", 10));
		System.out.println(Integer.parseInt("10", 16));
		System.out.println(Integer.parseInt("11"));
		System.out.println(Integer.parseInt("11", 10));
		System.out.println(Integer.parseInt("11", 16));
		
		
		BigInteger L = new BigInteger("9223372036854775807");
		BigInteger b = new BigInteger("2");
		BigInteger c = L.multiply(b); // 9223372036854775807 * 2
		System.out.println(c);
		
		
		BigDecimal a1 = new BigDecimal(1.0);
		BigDecimal b1 = new BigDecimal(3.0);
		BigDecimal c1 = a1.divide(b1, 20, BigDecimal.ROUND_UP);
		System.out.println(c1);
		
		
		BigInteger x = new BigInteger("3");
		BigInteger y = new BigInteger("7");
		BigInteger z = x.add(y);
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		System.out.println("z is " + z);
		
		
		System.out.println("Welcome".replace('e', 'A')); //returns a new string, WAlcomA.
		System.out.println("Welcome".replaceFirst("e", "AB"));// returns a new string, WABlcome.
		System.out.println("Welcome".replace("e", "AB")); //returns a new string, WABlcomAB.
		System.out.println("Welcome".replace("el", "AB")); //returns a new string, WABcome.
		
		String[] tokens = "Java#HTML#Perl".split("#");
		for (int i = 0; i < tokens.length; i++)
			System.out.print(tokens[i] + " ");
		
		System.out.println("\n" + "Java".matches("Java") + " " + "Java".equals("Java"));
		
		System.out.println("Java is fun".matches("Java.*") + " " + "Java is cool".matches("Java.*") + "Java is powerful".matches("Java.*"));
		
		System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}"));
		
		String ss = "a+b$#c".replaceAll("[$+#]", "NNN");
		System.out.println(ss);
		
		String[] tokensA = "Java,C?C#,C++".split("[.,:;?]");
		for (int i = 0; i < tokensA.length; i++)
			System.out.println(tokensA[i]);
		
		char[] chars = "Java".toCharArray();
		
		for (int i = 0; i < chars.length; i++)
			System.out.print(chars[i]+"");
		
		System.out.println();
		
		char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
		"CS3720".getChars(2, 6, dst, 4);
		
		for (int i = 0; i < dst.length; i++)
			System.out.print(dst[i]+"");
		
		String str = new String(new char[]{'J', 'a', 'v', 'a'});
		String[] sq = "c.c#?c++".split("[.?,]");
		System.out.println("\n"+str + sq[0] + sq[1] + sq[2]);
		
		String str1 = String.valueOf(new char[]{'J', 'a', 'v', 'a'});
		
		System.out.println(str1);
		
		long num = System.currentTimeMillis();
		System.out.println(String.valueOf(num) + " milli seconds");
		
		String sd = String.format("%7.2f%6d%-4s", 45.556, 14, "AB");
		System.out.println(sd);
		
	
	
		
	}

}
