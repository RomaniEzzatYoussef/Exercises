package chapter07;
/**
 *
 * 04/12/2017   8:05:41 PM
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
		int[] list = {1 , 2 , 3 , 4 , 5};
		list = reverser(list);
		
		for(int e: list)
			System.out.print(e + " ");
	}
	
	public static void reverse(int[] list) 
	{
		int[] newList = new int[list.length];
		
		for (int i = 0; i < list.length; i++)
			newList[i] = list[list.length - 1 - i];
		
		//for(int e: newList)
			//System.out.print(e + " ");
		
		list = newList;
	}
	
	public static int[] reverser(int[] list) 
	{
		int[] newList = new int[list.length];
		
		for (int i = 0; i < list.length; i++)
			newList[i] = list[list.length - 1 - i];
		
		//for(int e: newList)
			//System.out.print(e + " ");
		
		return newList;
	}

}
