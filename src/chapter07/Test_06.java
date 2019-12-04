package chapter07;
/**
 *
 * 04/12/2017   11:15:26 AM
 *  
 * @author roman
 *
 *
 * Test_06
 *
 */
public class Test_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] list1 = {1 , 2 , 3 , 4 , 5 , 6};
		int[] list2 = list1;
		printArray(list1);
		printArray(list2);
		
		// When you change list2 is the same as change list1 because the same reference
		randomArray(list2);
		printArray(list1);
		printArray(list2);
		
		swap(list1);
		printArray(list1);
		printArray(list2);
		
		
	}
	
	public static void printArray(int[] list)
	{
		for (int e : list)
			System.out.print(e + " ");
		
		System.out.println("\n");
	}
	
	public static int[] reverseUsingNewArray(int[] list)
	{
		int[] result = new int[list.length];
		
		for (int i = 0  , j = list.length - 1; i < list.length ; i++ , j--)
			result[i] = list[j];
			
		
		return result;
	}
	
	public static void randomArray(int[] list)
	{
		for (int i = 0 ; i < list.length ; i++)
			list[i] = (int) (Math.random() * 10 + 1);
	}
	
	public static void swap(int[] list)
	{
		for (int i = 0; i < list.length - 1; i++)
		{
			int temp = list[i];
			list[i] = list[i + 1];
			list[i + 1] = temp;
		}
	}

}
