package chapter12;
/**
 *
 * 25/07/2019   9:45:31 PM
 *  
 * @author Romani Ezzat
 *
 *
 * AlgorithmSolving
 *
 */
public class AlgorithmSolving {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] cities = new int[33];
		
	}
	
	public static int solution(int[] A)
	{
		int highestAppeal = 0;

		for (int i = 0; i < A.length; i++) 
		{
		    for (int j = 0; j < A.length; j++) 
		    {
		        int currentAppeal = A[i] + A[j] + (i - j);
		        highestAppeal = currentAppeal > highestAppeal ? currentAppeal : highestAppeal;
		    }
		}

		return highestAppeal;
	}
	
	public static int solution2(int[] A)
	{
		int maxStart = A[0];
		int maxEnd = A[0];

		for (int i = 0; i < A.length; i++) {
		    if ((A[i] - i) > maxStart) {
		        maxStart = A[i] - i;
		    }

		    if ((A[i] + i) > maxEnd) {
		        maxEnd = A[i] + i;
		    }
		}

		return maxEnd + maxStart;
	}
	
	

}
