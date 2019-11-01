/*
 * Written By Bradley Grose
 */

import java.util.Scanner;

public class createAdventure {

	public static int CARVALUE = 19550;
	public static String END1 = "Congrats You won $1, but the ticket was $5, so you owe me $4";
	public static String END2 = "Well, in the envelope there were two tickets to Jamaca, Congrats!";	
	public static String END3 = "You took the easy way out, so you will only get $5 as a prize";
	public static String END4 = "CONGRATS YOU WON THE HONDA CIVIC VALUED AT $"+CARVALUE;
	public static String END5 = "Congrats you won a 1964 car with no engine just rust valued at $12";
	public static String END6 = "Congrats, you won unlimited free car washes for a year for the car you didnt win!!";
	public static String END7 = "Well here are my car keys I guess";
	public static String END8 = "Congrats you won $10,000!!";
	public static String END9 = "Well, you are the lucky winner of day old pizza from our production meeting";
	public static String ERROR = "Sorry that wasnt a valid choice";
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt and First Question
		System.out.println("Welcome to the only gameshow where you might owe the host money!");
		System.out.println("Your first question is: Do you want the \"Box\", the \"Curtain\", or \"Pocket\"");
		String decision = keyboard.nextLine();
		
		//Break to next prompt
		
		if(decision.equalsIgnoreCase("box")) //Box Pick
		{
			System.out.println("Inside the Box is a lottery ticket. You can \na: Scratch the ticket and pay for it. \nb: Get whats in this envelope. \nc:Sell the lottery ticket back to me.\nType which letter you pick!");
			decision = keyboard.nextLine();
			if(decision.equalsIgnoreCase("a"))
			{
				System.out.println(END1);
			}
			else if(decision.equalsIgnoreCase("b"))
			{
				System.out.println(END2);
			}
			else if(decision.equalsIgnoreCase("c"))
			{
				System.out.println(END3);
			}
			else
			{
				System.out.println(ERROR);
			}
		}
		else if(decision.equalsIgnoreCase("curtain")) //Curtain Pick
		{
				System.out.println("Inside the curtain is a BRAND NEW 2019 HONDA CIVIC.\nGuess the approximent value of the car, you must be withing $1000 to win it");
				int CarValueGuess = keyboard.nextInt();
				
				if((CarValueGuess < CARVALUE+1000)&&(CarValueGuess > CARVALUE-1000)) //Curtain Sub1
				{
					keyboard.nextLine();
					System.out.println("I have another car in parking lot.\nWould you like to \"keep\" or \"switch\"");
					decision = keyboard.nextLine();
					if(decision.equalsIgnoreCase("keep"))
					{
						System.out.println(END4);
					}
					else if(decision.equalsIgnoreCase("switch"))
					{
						System.out.println(END5);
					}
					else
					{
						System.out.println(ERROR);	
					}
				}
				else if((CarValueGuess > CARVALUE+1000)||(CarValueGuess < CARVALUE-1000)) //Curtain Sub 2
				{
					keyboard.nextLine();
					System.out.println("Im sorry the value was $"+CARVALUE+".\nHowever, I can give you what is in the \"envelope\" or what is on the \"screen\"");
					decision = keyboard.nextLine();
					if(decision.equalsIgnoreCase("envelope"))
					{
						System.out.println(END2);
					}
					else if(decision.equalsIgnoreCase("screen"))
					{
						System.out.println(END6);
					}
					else
					{
						System.out.println(ERROR);	
					}
				}
				else
				{
					System.out.println(ERROR);
				}
		}
		else if(decision.equalsIgnoreCase("pocket")) //Pocket set
		{
			System.out.println("You have 3 choices. \"left\" pocket, \"right\" pocket, or \"backstage\"");
			decision = keyboard.nextLine();
				if(decision.equalsIgnoreCase("left"))
				{
					System.out.println(END7);
				}
				else if(decision.equalsIgnoreCase("right"))
				{
					System.out.println(END8);
				}
				else if(decision.equalsIgnoreCase("backstage"))
				{
					System.out.println(END9);
				}
				else
				{
					System.out.println(ERROR);
				}
			}
		else
		{
			System.out.println(ERROR);
		}

	}

}
