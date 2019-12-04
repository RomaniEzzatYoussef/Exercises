package chapter10;

import java.util.Scanner;

/**
 *
 * 20/02/2018   6:55:03 PM
 *  
 * @author roman
 *
 *
 * SegaGame
 *
 */
public class SegaGame {

	/**
	 * @param args
	 */
	static char [][] segaBoard = new char[3][3];
	
	public static void main(String[] args) 
	{
		while(true)
		{
			play();
		}
	}
	
	public static void play()
	{
		assignBoard();
		showBoard();
		playerA();
		showBoard();
		playerB();
	}
	
	public static void assignBoard()
	{
		segaBoard[0][0] = 'A';
		segaBoard[0][1] = 'A';
		segaBoard[0][2] = 'A';

		segaBoard[1][0] = '0';
		segaBoard[1][1] = '0';
		segaBoard[1][2] = '0';
		
		segaBoard[2][0] = 'B';
		segaBoard[2][1] = 'B';
		segaBoard[2][2] = 'B';
	}
	
	public static void showBoard()
	{
		System.out.print("\n    ");
		for (int col = 0; col < 3; col++)
			System.out.print(col + "   ");
		System.out.println("\n  -------------");
		for (int r = 0; r < segaBoard.length; r++)
		{
			System.out.print(r);
			for (int c = 0; c < segaBoard[r].length; c++)
			{
				if (segaBoard[r][c] == '0')
				{
					segaBoard[r][c] = '\u0000';
				}
				
				System.out.print(" | " + segaBoard[r][c]);
				
				segaBoard[r][c] = '0';
			}
				
			System.out.println(" |");
			System.out.println("  -------------");
		}
		
		System.out.println();		
	}
	
	public static void playerA()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Player A");
		System.out.println("Choose A Position to move ");
		int[][] dogLocation = getDogLocationA();
		for (int i = 0; i < 3; i++)
			System.out.print(dogLocation[i][0] + " " + dogLocation[i][1] + "  ");
		System.out.print(": ");
		int [] dogPosition = new int [2];
		dogPosition[0] = input.nextInt();
		dogPosition[1] = input.nextInt();
		
		System.out.println("Choose Empty Position to move ");
		int[][] EmptyLocation = getEmptyLocation();
		for (int i = 0; i < 3; i++)
			System.out.print(EmptyLocation[i][0] + " " + EmptyLocation[i][0] + "  ");
		System.out.print(": ");
		int [] dogDistination = new int [2];
		dogDistination[0] = input.nextInt();
		dogDistination[1] = input.nextInt();
		
		swap(dogPosition , dogDistination);
		
		input.close();
	}
	
	public static void playerB()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Player B");
		System.out.println("Choose B Position to move ");
		int[][] dogLocation = getDogLocationB();
		for (int i = 0; i < 3; i++)
			System.out.print(dogLocation[i][0] + " " + dogLocation[i][1] + "  ");
		System.out.print(": ");
		int[] dogPosition = new int[2];
		dogPosition[0] = input.nextInt();
		dogPosition[1] = input.nextInt();
		
		System.out.println("Choose Empty Position to move ");
		int[][] EmptyLocation = getEmptyLocation();
		for (int i = 0; i < 3; i++)
			System.out.print(EmptyLocation[i][0] + " " + EmptyLocation[i][0] + "  ");
		System.out.print(": ");
		int [] dogDistination = new int [2];
		dogDistination[0] = input.nextInt();
		dogDistination[1] = input.nextInt();
		
		swap(dogPosition , dogDistination);
		
		input.close();
	}
	
	public static void computerTurn()
	{
		System.out.println("Computer Turn");
		System.out.println("");
		int[][] dogPosition = getDogLocationA();
		for (int i = 0; i < 3; i++)
			System.out.print(dogPosition[i][0] + " " + dogPosition[i][0]);
	}
	
	public static int[][] getDogLocationA()
	{
		int[][] dogPosition = new int [3][2];
		
		int s = 0;
		while (s < 3)
		{
			for (int r = 0; r < 3; r++)
				for (int c = 0; c < 3; c++)
				{
					if (segaBoard[r][c] == 'A')
					{
						dogPosition[s][0] = r;
						dogPosition[s][1] = c;
						s++;
					}
				}
		}
					
		
		return dogPosition;
	}
	
	public static int[][] getDogLocationB()
	{
		int[][] dogPosition = new int [3][2];
		
		int s = 0;
		while (s < 3)
		{
			for (int r = 0; r < 3; r++)
				for (int c = 0; c < 3; c++)
				{
					if (segaBoard[r][c] == 'B')
					{
						dogPosition[s][0] = r;
						dogPosition[s][1] = c;
						s++;
					}
				}
		}
					
		
		return dogPosition;
	}
	
	public static int[][] getEmptyLocation()
	{
		int[][] dogPosition = new int [3][2];
		
		int s = 0;
		while (s < 3)
		{
			for (int r = 0; r < 3; r++)
				for (int c = 0; c < 3; c++)
				{
					if (segaBoard[r][c] == '0')
					{
						dogPosition[s][0] = r;
						dogPosition[s][1] = c;
						s++;
					}
				}
		}
					
		
		return dogPosition;
	}
	
	public static void swap(int[] dogPosition , int[] dogDistination)
	{
		for (int r = 0; r < 3; r++)
			for (int c = 0; c < 3; c++)
				if (segaBoard[r][c] == segaBoard[dogPosition[0]][dogPosition[1]])
				{
					if (segaBoard[r][c] == 'A')
					{
						segaBoard[dogDistination[0]][dogDistination[1]] = 'A';
						segaBoard[dogPosition[0]][dogPosition[1]] = '0';
					}
					
					if (segaBoard[r][c] == 'B')
					{
						segaBoard[dogDistination[0]][dogDistination[1]] = 'B';
						segaBoard[dogPosition[0]][dogPosition[1]] = '0';
					}
				}
	}

}
