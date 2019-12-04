package chapter04;
/**
 *
 * 16/03/2019   7:26:29 AM
 *  
 * @author Romani Ezzat
 *
 *
 * Test_13
 *
 */
public class Test_13 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.printf("amount is %f %e\n", 32.32, 32.32);
		System.out.printf("amount is %5.2f%% %5.4e\n", 32.327, 32.32);
		System.out.printf("%6b\n", (1 > 2));
		System.out.printf("%6s\n", "Java");
		System.out.printf("%-6b%s\n", (1 > 2), "Java");
		System.out.printf("%6b%-8s\n", (1 > 2), "Java");
		
		
		
		System.out.printf("%5d %%", 1, 2);
		
		
		int count = 5;
		double amount = 45.56;
		System.out.printf("%8d%8s%8.1f\n", 1234, "Java", 5.63);
		System.out.printf("%-8d%-8s%-8.1f \n", 1234, "Java", 5.63);
		System.out.printf("%-5d#%-5s#%-7.2f\n", 1234, "Java", 51.6653);
		System.out.printf("count is %d and amount is %3.2f", count, amount);
	}

}
