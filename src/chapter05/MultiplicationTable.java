package chapter05;
/**
 *
 * 20/11/2017   10:57:41 AM
 *  
 * @author roman
 *
 *
 * MultiplicationTable
 *
 */
public class MultiplicationTable 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("\t   Multiplication Table\n");
		
		System.out.println("--------------------------------------------");
		
		System.out.print("0 | ");
		for (int i = 1; i < 100; i++)
			System.out.printf("%7d" , i);
		
		System.out.print("   |");
		
		System.out.println("\n--------------------------------------------");
		
		for (int i = 1; i < 100; i++)
		{
			System.out.print(i + " | ");
			
			for (int j = 1; j < 100; j++)
				System.out.printf("%7d" , (i * j));
			
			System.out.print("   |\n");
		}
		
		System.out.println("-------------------------------------------- ");
	}

}
