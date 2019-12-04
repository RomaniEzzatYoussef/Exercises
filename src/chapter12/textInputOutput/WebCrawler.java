package chapter12.textInputOutput;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CORBA.TRANSACTION_MODE;

/**
 *
 * 08/05/2019 7:06:45 PM
 * 
 * @author Romani Ezzat
 *
 *
 *         WebCrawler
 *
 */
public class WebCrawler 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a URL: ");
		String url = input.nextLine();

		crawler(url);

		input.close();

	}

	public static void crawler(String url) 
	{
		ArrayList<String> pendingURLs = new ArrayList<>();
		ArrayList<String> traversedURLs = new ArrayList<>();

		pendingURLs.add(url);

		while (!pendingURLs.isEmpty() && traversedURLs.size() <= 100) 
		{
			String urlString = pendingURLs.remove(0);

			if (!traversedURLs.contains(urlString)) 
			{
				traversedURLs.add(urlString);
				System.out.println("Craw " + urlString);
				
				for (String s : getSubURLs(urlString)) 
				{
					if (!traversedURLs.contains(s))
						pendingURLs.add(s);
				}
			}

		}

	}
	
	public static ArrayList<String> getSubURLs(String urlString)
	{
		ArrayList<String> list = new ArrayList<>();
		
		try {
			URL url = new URL(urlString);
			Scanner input = new Scanner(url.openStream());
			int current = 0;
			
			while (input.hasNext())
			{
				String line = input.nextLine();
				current = line.indexOf("https:", current);
				while (current > 0)
				{
					int endIndex = line.lastIndexOf("\"", current);
					if (endIndex > 0)
					{
						list.add(line.substring(current , endIndex));
						current = line.indexOf("https:", endIndex);
					}
					else
						current = -1;
								
				}
			}
		}
		
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		return list;
	}

}
