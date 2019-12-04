package chapter08;
/**
 *
 * 08/04/2019   7:47:46 AM
 *  
 * @author Romani Ezzat
 *
 *
 * Test_00
 *
 */
public class Test_00 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[][] array = {{1, 2}, {3, 4}, {5, 6}};
		for (int i = array.length - 1; i >= 0; i--) 
		{
			for (int j = array[i].length - 1; j >= 0; j--)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
		
		int sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i][0];
		System.out.println(sum);
		
		
		
		int[][] array1 = {{1, 2, 3, 4}, {5, 6, 7, 8}};
		System.out.println(m1(array1)[0]);
		System.out.println(m1(array1)[1]);
		
		
		int d = Integer.MAX_VALUE;
		
		System.out.println(array1[0]);
		
		
		
	}
	
	public static int[] m1(int[][] m) 
	{
		int[] result = new int[2];
		result[0] = m.length;
		result[1] = m[0].length;
		
		return result;
	}

}
