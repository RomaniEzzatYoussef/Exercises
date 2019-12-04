package chapter12;

import java.util.Scanner;

/**
 *
 * 09/05/2019   7:37:56 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_01
 *
 */
public class Exercise_01 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		if (args.length != 3)
		{
			System.out.println("Operand Operator Operand");
			return;
		}
		
		calculator(args);
	}
	
	public static void calculator(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		if(checkOperand(args[0]))
		{
			System.out.println("Operand 1 is not a number, enter another number: ");
			args[0] = input.next();
		}
		
		if(checkOperand(args[2]))
		{
			System.out.println("Operand 2 is not a number, enter another number: ");
			args[2] = input.next();
		}		
		
		switch (args[1])
		{
			case "+" : System.out.print(args[0] + " + " + args[2] + " = " + (Integer.parseInt(args[0]) + Integer.parseInt(args[2])));
				break;
			
			case "-" : System.out.print(args[0] + " - " + args[2] + " = " + (Integer.parseInt(args[0]) - Integer.parseInt(args[2])));
				break;
				
			case "#" : System.out.print(args[0] + " * " + args[2] + " = " + (Integer.parseInt(args[0]) * Integer.parseInt(args[2])));
				break;
			
			case "/" : System.out.print(args[0] + " / " + args[2] + " = " + (Integer.parseInt(args[0]) / Integer.parseInt(args[2])));
				break;
				
			default : System.out.println(args[0] + " " + args[1]+ " " + args[2] + " = ?");
		}
		
		
		input.close();
	}
	
	public static void calculatorExceptionHandling(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		try {
			Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.out.print("Operand 1 not a number, enter a number: ");
			args[0] = input.next();
		}
		
		try {
			Integer.parseInt(args[2]);
		} catch (Exception e) {
			System.out.print("Operand 1 not a number, enter a number: ");
			args[2] = input.next();
		}
		
		switch (args[1])
		{
			case "+" : System.out.print(args[0] + " + " + args[2] + " = " + (Integer.parseInt(args[0]) + Integer.parseInt(args[2])));
				break;
			
			case "-" : System.out.print(args[0] + " - " + args[2] + " = " + (Integer.parseInt(args[0]) - Integer.parseInt(args[2])));
				break;
				
			case "*" : System.out.print(args[0] + " * " + args[2] + " = " + (Integer.parseInt(args[0]) * Integer.parseInt(args[2])));
				break;
			
			case "/" : System.out.print(args[0] + " / " + args[2] + " = " + (Integer.parseInt(args[0]) / Integer.parseInt(args[2])));
				break;
				
			default : System.out.println(args[0] + " " + args[1]+ " " + args[2] + " = ?");
		}
		
		input.close();
	}
	
	public static boolean checkOperand(String operand)
	{
		for (int i = 0; i < operand.length(); i++)
		{
			if(!Character.isDigit(operand.charAt(i)))
				return true;
		}
		
		return false;
	}
	

}
