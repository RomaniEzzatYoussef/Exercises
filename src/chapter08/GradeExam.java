package chapter08;
/**
 *
 * 07/12/2017   11:26:41 PM
 *  
 * @author roman
 *
 *
 * Grade
 *
 */
public class GradeExam {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		char[][] answers = {
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
		
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		
		for (int r = 0; r < answers.length; r++)
		{
			int count = 0;
			for (int c = 0; c < answers[r].length; c++)
				if (keys[c] == answers[r][c])
					count++;
			
			System.out.println("Student " + (r + 1) + "'s correct count is " + count);
		}
	}

}
