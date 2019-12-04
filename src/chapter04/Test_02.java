package chapter04;
/**
 *
 * 01/11/2017   9:39:07 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Test_02
 *
 */
public class Test_02 
{

	/**
	 * 
	 * Exponent Methods in the Math Class
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println(Math.sqrt(4));
		System.out.println(Math.sin(2 * Math.PI));
		System.out.println(Math.cos(2 * Math.PI));
		System.out.println(Math.pow(2 , 2));
		System.out.println(Math.log(Math.E) + " "+ Math.exp(1) + " "+ Math.max(2, Math.min(3, 4)));
		System.out.println(Math.rint(-2.5) + " "+ Math.ceil(-2.5) + Math.floor(-2.5) + " " + Math.round(-2.5f));
		System.out.println(Math.round(-2.5) + " " + Math.rint(2.5) + " " + Math.ceil(2.5) + ' ' + Math.floor(2.5));
		System.out.println(Math.round(2.5f) + " " + Math.round(2.5) + " " + Math.round(Math.abs(-2.5)) + "\n\n\n\n");
		
		
		
		
		
		double n1 = Math.exp(10); // returns 2.71828
		Math.log(Math.E); // returns 1.0
		Math.log10(10); // returns 1.0
		Math.pow(2, 3); // returns 8.0
		Math.pow(3, 2); // returns 9.0
		Math.pow(4.5, 2.5); // returns 22.91765
		Math.sqrt(4); // returns 2.0
		Math.sqrt(10.5); // returns 4.24
		
		System.out.println(n1);
		System.out.println("Hallo, gg It' s me I'm Here");
	}

}
