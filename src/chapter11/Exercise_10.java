package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 06/05/2019   4:46:05 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_10
 *
 */
public class Exercise_10 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		MyStack11 stack = new MyStack11();
		
		System.out.println("Add to the stack: ");
		for (int i = 0; i < 5; i++)
			stack.push(input.nextLine());
		
		System.out.println("Popping strings in the stack: ");
		
		while(!stack.isEmpty())
			System.out.println(stack.pop());
		
		input.close();
	}

}


class MyStack11 extends ArrayList<Object> implements Cloneable
{
	private static final long serialVersionUID = 1L;
	ArrayList<Object> list = new ArrayList<>();
	
	public MyStack11()
	{
		
	}
	
	public boolean isEmpty()
	{
		return super.isEmpty();
	}
	
	public int getSize()
	{
		return size();
	}
	
	public Object peek()
	{
		return get(getSize() - 1);
	}
	
	public Object pop()
	{
		return remove(getSize() - 1);
	}
	
	public Object push(Object o)
	{
		add(o);
		return o;
	}
	
	public int search(Object o)
	{
		return indexOf(o);
	}
	
	public String toString()
	{
		return "stack: " + toString();
	}
	

}
