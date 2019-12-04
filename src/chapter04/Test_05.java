package chapter04;
/**
 *
 * 16/11/2017   4:16:25 PM
 *  
 * @author roman
 *
 *
 * Test_05
 *
 */
public class Test_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//int c = '1';
		System.out.println((int)'b');
		
		int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
		System.out.println(j);
		
		char x = 'a';
		char y = 'c';
		System.out.println(++x);
		System.out.println(y++);
		
		System.out.println("x is " + x + "\ny is " + y);
		
		System.out.println(x - y);
		
		System.out.println('a' < 'b');
		System.out.println('a' <= 'A');
		System.out.println('a' > 'b');
		System.out.println('a' >= 'A');
		//System.out.println('a' == 'a');
		System.out.println('a' != 'b');
	}

}
