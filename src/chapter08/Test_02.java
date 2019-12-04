package chapter08;

/**
 *
 * 08/12/2017   9:57:44 AM
 *  
 * @author roman
 *
 *
 * Test_02
 *
 */
public class Test_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] a_1D = {1 , 2 , 3};
		
		int[][] a_2D = { {1 , 2 , 3},
					     {4 , 5 , 6},
					     {7 , 8 , 9} };
		
		int[][][] a_3D = {{{1 , 2},{0 , 1},{0 , 0}},
						  {{2 , 3},{1 , 2},{0 , 1}},
						  {{3 , 4},{2 , 3},{1 , 2}}};
		
		System.out.println(a_1D + " " + a_2D + " " + a_3D);
	}
}
