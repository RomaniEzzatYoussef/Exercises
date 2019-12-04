package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 06/05/2019   6:09:37 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_16
 *
 */
public class Exercise_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
	    
	    int number1 = (int) (Math.random() * 10);
	    int number2 = (int) (Math.random() * 10);

	    Scanner input = new Scanner(System.in);
	    System.out.print("What is " + number1 + " + " + number2 + "? ");
	    int answer = input.nextInt();
	    list.add(answer);
	      
	    while (number1 + number2 != answer) 
	    {
	    	System.out.print("Wrong. Try again. What is " + number1 + " + " + number2 + "? ");
	    	answer = input.nextInt();
	      
	    	if (list.contains(answer)) 
	    		System.out.println("You already entered " + answer);
	    	else 
	    	  list.add(answer);   
	    }	    
	    System.out.println("You got it!");
	    
	    input.close();
	}
}
