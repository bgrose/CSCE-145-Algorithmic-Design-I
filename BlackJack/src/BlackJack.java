/*
 * Written by Bradley Grose
 */

import java.util.Scanner;
import java.util.Random;

//Back end code from the game
public class BlackJack {
	public static final int CARDAMT = 52;
	public static final int HANDAMT = 5;
	public static final int CARDSUITAMT = 13;
	public static final String[] SUITS = {"Hearts","Clubs","Diamonds","Spades"};
	public static final int SHUFFLEAMT = 100;
	public static final int EMPTY = -1;

	//Entry Point of Game
	public void run()
	{
		boolean gameOver = false;
		
		while(!gameOver)
		{
			Scanner keyboard = new Scanner(System.in);
			int[] deck = this.createDeck();
			int[] playerhand = createHand();
			int[] comphand = createHand();
			this.shuffleDeck(deck);
		}
	}
	
	public int[] createDeck()
	{
		int[] ret = new int[CARDAMT];
		for(int i=0; i<ret.length; i++)
		{
			ret[i] = i;
		}
		
		
		return ret;
	}
	public int[] createHand()
	{
		int[] ret = new int[HANDAMT];
		for(int i=0; i<ret.length; i++)
		{
			ret[i] = EMPTY;
		}
		
		return ret;
	}
	public void shuffleDeck(int[] deck)
	{
		Random r = new Random();
		for(int i=0; i<SHUFFLEAMT; i++)
		{
			int j = r.nextInt(CARDAMT);
			int k = r.nextInt(CARDAMT);
			int temp = deck[j];
			deck[j] = deck[k];
			
		}
	}
}
