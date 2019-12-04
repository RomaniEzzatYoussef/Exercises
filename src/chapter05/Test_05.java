package chapter05;
/**
 *
 * 20/11/2017   1:32:23 PM
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
		{
			for (int i = 1; i < 5; i++)
			{
				int j = 0;
				
				while (j < i)
				{
					System.out.print(j + " ");
					j++;
				}
				
				System.out.println();
				
			}
		}
		
		System.out.println();
		
		
		{
			int i = 0;
			while (i < 5)
			{
				for (int j = i; j > 1; j--)
					System.out.print(j + " ");
				
				System.out.println("***");
				i++;
			}
		}
		
		System.out.println();
		
		{
			int i = 5;
			while (i >= 1)
			{
				int num = 1;
				for (int j = 1; j <= i; j++)
				{
					System.out.print(num + "XXX ");
					num *= 2;
				}
				
				System.out.println();
				
				i--;
			}
		}
		
		System.out.println();
		
		{
			int i = 1;
			do
			{
				int num = 1;
				for (int j = 1; j <= i; j++)
				{
					System.out.print(num + "G ");
					num += 2;
				}
				
				System.out.println();
				i++;
			} while (i <= 5); 
		}
	}

}
