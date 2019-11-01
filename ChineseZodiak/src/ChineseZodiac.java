/*
 * Written By Bradley Grose
 */

import java.util.Scanner;

public class ChineseZodiac {
	
	public static final int BASEYEAR = 1924; //First year you can be Born

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	//User Input
	System.out.println("What is your Chinese zodiac?  Enter your birth year!");
	int Year = keyboard.nextInt();
	
	if(Year >= BASEYEAR)
	{
		//Calculate Out
		Year -= BASEYEAR;
		int remainder = Year % 12;
		
		
		if (remainder == 0)
		{
			System.out.println("You are a Water Rat");
		}
		else if (remainder == 1)
		{
			System.out.println("You are a Earth Ox");
		}
		else if (remainder == 2)
		{
			System.out.println("You are a Wood Tiger");
		}
		else if (remainder == 3)
		{
			System.out.println("You are a Wood Rabbit");
		}
		else if (remainder == 4)
		{
			System.out.println("You are a Earth Dragon");
		}
		else if (remainder == 5)
		{
			System.out.println("You are a Fire Snake");
		}
		else if (remainder == 6)
		{
			System.out.println("You are a Fire Horse");
		}
		else if (remainder == 7)
		{
			System.out.println("You are a Earth Goat");
		}
		else if (remainder == 8)
		{
			System.out.println("You are a Metal Monkey");
		}
		else if (remainder == 9)
		{
			System.out.println("You are a Metal Rooster");
		}
		else if (remainder == 10)
		{
			System.out.println("You are a Earth Dog");
		}
		else if (remainder == 11)
		{
			System.out.println("You are a Water Pig");
		}
	}
	else //Too Old Prompt
	{
		System.out.println("Unfortunately, we cannot determine your Zodiac with that given year");
		System.exit(0); //Close
	}

	}

}
