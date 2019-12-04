package chapter05;
/**
 *
 * 28/11/2017   4:26:40 PM
 *  
 * @author roman
 *
 *
 * Test_07
 *
 */
public class Test_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		{
			int sum = 0;
			int i = 0;
			
			while ( i < 4)
			{
				i++;
				if (i % 3 == 0)
					continue;
				sum += i;
			}
			
			System.out.println("Sum is " + sum);
		}
		
		{
			int sum = 0;
			int i = 0;
			
			while ( i < 4)
			{
				if (i % 3 == 0)
				{
					i++;
					continue;
				}
					
				sum += i;
				i++;
			}
			
			System.out.println("Sum is " + sum);
		}
		
		{
			for (int i = 0; i < 4; i++)
			{
				for (int j = 0; j < 4; j++)
				{
					if (i * j > 2)
						break;
					System.out.print(i * j + " ");
				}
				
				System.out.println(i);
			}
		}
		
		{
			for (int i = 0; i < 4; i++)
			{
				for (int j = 0; j < 4; j++)
				{
					if (i * j > 2)
						continue;
					System.out.print(i * j + " ");
				}
				
				System.out.println(i);
			}
		}
		
		{
			int sum = 0;
			
			for (int i = 0; i < 4; i++)
			{
				if (i % 3 == 0)
					continue;
				sum += i;
			}
			
			System.out.println("Sum is " + sum);
		}
		
		{
			int balance = 10;
			while (true)
			{
				if (balance < 9)
					break;
				balance -= 9;
			}
			
			System.out.println("Balance is " + balance);
		}
		
		{
			int balance = -100;
			while (balance < 10)
			{
				if (balance > 20)
					continue;
				balance += 9;
				//System.out.println("Balance is " + balance);
			}
			
			System.out.println("Balance is " + balance);
		}
	}

}
