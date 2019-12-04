package chapter04;
/**
 *
 * 15/03/2019   3:36:10 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Test_11
 *
 */
public class Test_11 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int i = '2' + '3'; // (int)'2' is 50 and (int)'3' is 51
		System.out.println("i is " + i); // i is 101
		int j = 2 + 'a'; // (int)'a' is 97
		System.out.println("j is " + j); // j is 99
		System.out.println(j + " is the Unicode for character "
		+ (char)j); // 99 is the Unicode for character c
		System.out.println("Chapter " + '2');
		
		int i1 = 'd';
		char c1 = (char)i1;
		System.out.println(i1 + "  is the Unicode for character  "+c1);
	}

}
