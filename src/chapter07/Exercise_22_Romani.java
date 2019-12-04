package chapter07;

/**
 *
 * 06/12/2017   1:43:12 PM
 *  
 * @author roman
 *
 *
 * Exercise_22_Romani
 *
 */
public class Exercise_22_Romani 
{
	static final int SIZE = 8;
	static int[] queens = new int[8];

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		search(0);
		printResult(queens);
	}
	
	/** Search for a solution starting from a specified row */
	public static boolean search(int row) 
	{
		if (row == SIZE) // Stopping condition
			return true; // A solution found to place 8 queens in 8 rows

		for (int column = 0; column < SIZE; column++) 
		{
			queens[row] = column; // Place a queen at (row, column)
			if (isValid(row, column) && search(row + 1)) 
				return true; // Found, thus return true to exit for loop   
		}
      
		// No solution for a queen placed at any column of this row
		return false; 
	}
	
	public static boolean isValid(int row, int column) 
	{
		for (int i = 1; i <= row; i++)
			if (queens[row - i] == column // Check column
				|| queens[row - i] == column - i // Check upleft diagonal
				|| queens[row - i] == column + i) // Check upright diagonal
				return false; // There is a conflict
		return true; // No conflict
	}
	
	public static void printResult(int[] queens) 
	{
		for (int i = 0; i < 8; i++)
			System.out.println(i + ", " + queens[i]);
		System.out.println();
	
		for (int i = 0; i < 8; i++) 
		{
			for (int j = 0; j < queens[i]; j++)
				System.out.print("| ");
			System.out.print("|Q|");
			  
			for (int j = queens[i] + 1; j < 8; j++)
				System.out.print(" |");
			System.out.println();
		} 
	}

}
