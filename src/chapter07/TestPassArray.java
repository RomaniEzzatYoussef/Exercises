package chapter07;
/**
 *
 * 04/12/2017   9:20:37 AM
 *  
 * @author roman
 *
 *
 * TestPassArray
 *
 */
public class TestPassArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] a = {1 , 2};
		int[] c = {1 , 2 , 3 , 4 , 5};
		int[] b = reverse(c);
		for (int e : b)
			System.out.print(e);
		System.out.println();
		
		System.out.println("Before invoking passByValueArgument");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		
		passByValueArgument(a[0], a[1]);
		
		System.out.println("After invoking passByValueArgument");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		
		System.out.println("Before invoking passByReferenceArgument");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		
		passByReferenceArgument(a);
		
		System.out.println("After invoking passByReferenceArgument");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
	}
	
	public static void passByValueArgument(int n1 , int n2)
	{
		int temp = n1;
		n1 = n2;
		n2 = temp;
	}
	
	public static void passByReferenceArgument(int[] a)
	{
		int temp = a[0];
		a[0] = a[1];
		a[1] = temp;
	}
	
	public static int[] reverse(int[] a)
	{
		int[] b = new int[a.length]; 
		for (int i = 0 , j = a.length - 1; i < a.length; i++ , j--)
		{
			b[i] = a[j];
		}
		return b;
	}
	
	public static int[] notReverse(int[] a)
	{
		int[] b = new int[a.length]; 
		for (int i = 0 , j = a.length - 1; i < a.length; i++ , j--)
		{
			int temp = b[i];
			b[i] = a[j];
			a[j] = temp;
		}
		return b;
	}

}
