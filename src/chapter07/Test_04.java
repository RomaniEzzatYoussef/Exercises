package chapter07;
/**
 *
 * 03/12/2017   5:12:16 PM
 *  
 * @author roman
 *
 *
 * Test_04
 *
 */
public class Test_04 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] sourceArray = {2 , 3 , 1 , 5 , 10};
		int[] targetArray = new int[sourceArray.length];
		for (int i = 0; i < sourceArray.length; i++)
			targetArray[i] = sourceArray[i];
		
		System.arraycopy(sourceArray, 0, targetArray, 1, 4);
		printArray(targetArray);
		
		System.out.println();
		
		int[] source = {3 , 4 , 5 , 6 , 7};
		int[] t = new int[source.length-2];
		
		System.arraycopy(source, 0, t, 0, t.length);
		printArray(t);;
		
		System.out.println();
		
		printArray(new int[]{1 , 2 , 7 , 7 , 7 , 7});
		
		System.out.println();
		
		int[] a = {13 , 15 , 17 , 23 , 54 ,45 , 98};
		
		printArray(a);
		m(a);
		
		System.out.println();
		printArray(a);
	}
	
	
	
	public static void printArray(int[] array)
	{
		for (int e : array)
			System.out.print(e + " ");
	}
	
	public static void m(int[] a)
	{
		a[0] = 0;
		a[1] = 1;
		a[2] = 2;
	}

}
