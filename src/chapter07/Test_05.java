package chapter07;
/**
 *
 * 04/12/2017   9:21:17 AM
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
		int[] list1 = {1, 2, 3, 4, 5, 6};
		int[] list2 = reverse(list1);
		printArray(list1);
		printArray(list2);
		
		System.out.println();
		
		list1 = reverse(list1);
		printArray(list1);
		printArray(list2);
		
		System.out.println();
		
		swap(list2);
		printArray(list1);
		printArray(list2);
		
	}
	
	public static void printArray(int[] list)
	{
		for (int e : list)
			System.out.print(e + " ");
		
		System.out.println();
	}
	
	public static int[] reverse(int[] list)
	{
		int[] result = new int[list.length];
		
		for (int i = 0  , j = list.length - 1; i < list.length ; i++ , j--)
			result[i] = list[j];
			
		
		return result;
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
