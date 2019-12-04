package chapter07;
/**
 *
 * 03/12/2017   7:50:27 PM
 *  
 * @author roman
 *
 *
 * DeckOfCards
 *
 */
public class F_DeckOfCards {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] deck = new int[52];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		for (int i = 0; i < deck.length; i++)
			deck[i] = i;
		
		for (int i = 0; i < deck.length; i++)
		{
			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		for (int i = 0; i < 4; i++)
		{
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number " + deck[i] + " : " + rank + " of " + suit);
		}
		
		System.out.println();
		
		for (int i = 0; i < 4; i++) 
		{
			int cardNumber = (int)(Math.random() * deck.length);
			String suit = suits[cardNumber / 13];
			String rank = ranks[cardNumber % 13];
			System.out.println("Card number " + cardNumber + ": " + rank + " of " + suit);
		}
	}

}
