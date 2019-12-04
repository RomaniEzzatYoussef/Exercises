package chapter05;
/**
 *
 * 29/11/2017   7:24:01 AM
 *  
 * @author roman
 *
 *
 * PrimeNumber
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		final int NUMBER_OF_PRIMES = 50;
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		
		System.out.println("The first 50 prime numbers are \n");
		
		int count = 0;
		int number = 2;
		
		while (count < NUMBER_OF_PRIMES)
		{
			boolean isPrime = true;
			
			for (int divisor = 2; divisor <= number / 2; divisor++)
			{
				if (number % divisor == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if (isPrime)
			{
				count++;
				
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
					System.out.println(number);
				else 
					System.out.printf("%4d%2s", number , " ");
			}
			
			number++;
				
		}
	}

}
