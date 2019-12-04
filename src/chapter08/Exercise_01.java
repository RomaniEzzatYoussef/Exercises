package chapter08;
/**
 * (Sum elements column by column) Write a method that returns the sum of all the
 *  elements in a specified column in a matrix using the following header:
 *  public static double sumColumn(double[][] m, int columnIndex){}
 * 
 * 10/12/2017   9:58:43 AM
 *  
 * @author roman
 *
 *
 * Exercise_01
 *
 */
public class Exercise_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double[][] a = new double[3][4];
		
		System.out.println("3-by-4 matrix: ");
		for (int r = 0; r < a.length; r++)
		{
			for (int c = 0; c < a[r].length; c++)
			{
				a[r][c] = (int)(Math.random() * 100) / 10.0;
				System.out.print(a[r][c] + " ");
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
		sumColumn(a, 1);
		
	}
	
	public static void sumColumn(double[][] a, int columnIndex)
	{
		for (int c = 0; c < a.length; c++)
		{
			double sum = 0;
			for (int r = 0; r < a.length; r++)
			{
				sum += a[r][c];
			}
			
			System.out.println("Sum of the elements at column " + c + " is " + sum);
		}
	}

}
