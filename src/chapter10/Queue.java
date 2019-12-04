package chapter10;
/**
 *
 * 21/04/2019   7:34:27 AM
 *  
 * @author Romani Ezzat
 *
 *
 * Queue
 *
 */
public class Queue 
{
	private int[] elements;
	private int size;
	
	public Queue()
	{
		elements = new int[8];
	}
	
	public void enqueue(int value)
	{
		if (size >= elements.length)
		{
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		
		elements[size++] = value;
	}
	
	public int dequeue()
	{
		int v = elements[0];
		
		for (int i = 0; i < size - 1; i++)
		{
			elements[i] = elements[i + 1];
		}
		
		size--;
		
		return v;
	}
	
	public void dequeueFirstInFirstOutFashion()
	{		
		for ( int r = 0; r < size - 1; r++)
		{
			
			for (int i = r; i < size - r - 1; i++)
			{
				elements[i] = elements[i + 1];
				System.out.printf("%4d",elements[i]);
				
			}
			
			System.out.println();
//			for (int i = 0; i < size - r - 1; i++)
//			{
//				//elements[i] = elements[i + 1];
//				System.out.printf("%4d",elements[i]);
//				
//			}
//			
//			System.out.println();
		}
		
		
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public int getSize()
	{
		return this.size;
	}

}
