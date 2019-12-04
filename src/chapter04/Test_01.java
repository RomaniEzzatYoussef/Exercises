package chapter04;
/**
 *
 * 31/10/2017   5:17:09 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Test_01
 *
 */
public class Test_01 
{

	/**
	 * Trigonometric Methods in the Math Class
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.printf("%8d%8s%8.1f\n", 1234, "Java", 5.63);
		System.out.printf("%-8d%-8s%-8.1f \n", 1234, "Java", 5.63);
		System.out.println();
		System.out.printf("amount is %-10.2f %-10.4e\n", 32.32, 32.32);
		System.out.printf("amount %% is %-10.2f %-10.4e\n", 32.327, 32.32);
		System.out.printf("%6b\n", (1 > 2));
		System.out.printf("%6s\n", "Java");
		System.out.printf("%-6b%s\n", (1 > 2), "Java");
		System.out.printf("%6b%-8s\n", (1 > 2), "Java");
		
		double n1 = Math.toDegrees(Math.PI / 2);
		double n2 = Math.toRadians(30);
		double n3 = Math.sin(0);
		double n4 = Math.sin(Math.toRadians(270));
		double n5 = Math.sin(Math.PI / 6);
		double n6 = Math.sin(Math.PI / 2);
		double n7 = Math.cos(0);
		double n8 = Math.cos(Math.PI / 6);
		double n9 = Math.cos(Math.PI / 2);
		double n10 = Math.asin(0.5);
		double n11 = Math.acos(0.5);
		double n12 = Math.atan(1.0);
		
		System.out.println(n1 + "\n" + n2 + "\n" + n3 + "\n" + n4 + "\n" + n5 + "\n" + n6 + "\n" + n7  + "\n" + n8  + "\n" + n9  + "\n" + n10  + "\n" + n11  + "\n" + n12); 
	}

}
