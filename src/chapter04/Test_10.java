package chapter04;
/**
 *
 * 15/03/2019   2:45:35 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Test_10
 *
 */
public class Test_10 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		char ch2 = (char)65.25; // Decimal 65 is assigned to ch
		System.out.println(ch2); // ch is character A
		
		int i = (int)'A'; // The Unicode of character A is assigned to i
		System.out.println(i); // i is 65
		
		byte b = 'a';
		int c = 'a';
		System.out.println(b);
		System.out.println(c);
		byte db = (byte)'\uFFF4';
		
		
		char ch = 'a';
		System.out.println(++ch);
		System.out.println("He said \t\"Java \ris\\ \bfun\"\f\n\n");
		System.out.println("\\t is a tab character");
		
		int n1 = 0XAB0041; // The lower 16 bits hex code 0041 is
								 // assigned to ch
		char ch1 = (char) n1;
		System.out.println(ch1); // ch is character A
	}

}
