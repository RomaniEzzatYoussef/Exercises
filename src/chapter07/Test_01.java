package chapter07;
/**
 *
 * 02/12/2017   1:48:36 PM
 *  
 * @author romani
 *
 *
 * Test_01
 *
 */
public class Test_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//String[] s = new String[10];
		char[] c = new char[6];
		boolean[] b = new boolean[5]; 
		System.out.println(b[1]);
		
		c[0] = 'R';
		c[1] = 'o';
		c[2] = 'm';
		c[3] = 'a';
		c[4] = 'n';
		c[5] = 'i';
		
		
		for (char e : c)
			System.out.print(e);
		System.out.println(c);
		
		// Declare a variable allocate space in memory
		// Declare and assign value for variable
		int m = 10;
		System.out.println(m);
		
		// Declare a array doesn't allocate space but create storage location for the reference to an array in memory
		// When space for an array is allocated, the array size must be given, specifying the number of elements
		//  that can be stored in it.
		// Declare , Create and Assign size for array
		int[] myArray = new int[10];
		
		// myArray is a variable that contains a reference to an array of ten int elements
		// Assign values to array element
		for (int i = 0; i < myArray.length; i++)
			myArray[0] = i;
		
		System.out.println("Inside swap method");
		System.out.print(" Before swapping ");
		System.out.println("n1 = " + myArray[0] + " and n2 = " + myArray[1]);
		
		swap(myArray);
		
		System.out.print(" After swapping ");
		System.out.println("n1 = " + myArray[0] + " and n2 = " + myArray[1]);
		
		double[] myList = {1.9 , 2.9 , 3.4 , 3.5};
		for (int i = 0; i < myList.length; i++)
			System.out.println("myList[" + i + "] = " + myList[i]);
		
	}
	
	public static void swap(int n1 , int n2)
	{
		System.out.println("\tInside swap method");
		System.out.println("\t  Before swapping n1 = " + n1 + " and n2 = " + n2);
		
		int temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("\t  After swapping n1 = " + n1 + " and n2 = " + n2);
	}
	
	public static void swap(int[] a)
	{
		System.out.println("\tInside swap method");
		System.out.println("\t  Before swapping n1 = " + a[0] + " and n2 = " + a[1]);
		
		int temp = a[0];
		a[0] = a[1];
		a[1] = temp;
		
		System.out.println("\t  After swapping n1 = " + a[0] + " and n2 = " + a[1]);
	}

}
