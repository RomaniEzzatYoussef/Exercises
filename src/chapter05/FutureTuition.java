package chapter05;
/**
 *
 * 28/11/2017   6:41:59 AM
 *  
 * @author roman
 *
 *
 * FutureTuition
 *
 */
public class FutureTuition 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int year = 0;
		double tuition = 10000;
		
		System.out.println("year: " + year + " tuition: " + tuition);
		
		while (tuition < 20000)
		{
			year++;
			tuition *= 1.07;
			
			System.out.println("year: " + year + " tuition: " + tuition);
		}
		
		System.out.println("\nTuition will be doubled in " + year + " years");
		System.out.printf("Tuition will be $%.2f in %2d years" , tuition , year);
		
	}

}
