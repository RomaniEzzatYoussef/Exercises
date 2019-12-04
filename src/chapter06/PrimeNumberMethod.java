package chapter06;
/**
 *
 * 01/12/2017   8:31:07 AM
 *  
 * @author roman
 *
 *
 * PrimeNumberMethod
 *
 */
public class PrimeNumberMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("The first 50 prime numbers are \n");
		printPrimeNumbers(50);
	}
	
	public static void printPrimeNumbers(int numsOfPrimes)
	{
		int number = 2;
		int count = 0;
		while (count < numsOfPrimes)
		{
			if (isPrime(number))
			{
				count++;
				
				if (count % 10 == 0)
					System.out.printf("%-5d\n" , number);
				else
					System.out.printf("%-5d" , number);
			}
			
			
			number++;
				
		}
	}
	
	public static boolean isPrime(int number)
	{
		for (int divisor = 2; divisor <= number / 2; divisor++)
			if (number % divisor == 0)
				return false;
		return true;
	}

}
