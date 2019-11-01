/*
* Written by Bradley Grose
*/
import java.util.Scanner;
import java.util.Random;

public class RockPaper {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	String trigger = "yes";

	do
	{
		int compwins = 0, userwins = 0;
		for(int i=0; i<3; i++) //Runs Game 3 times
		{
		System.out.println("Enter \"Rock\", \"Paper\", or \"Scissors\"");
		String user = keyboard.nextLine();
		
		//Check for Valid Answer
		if(user.equalsIgnoreCase("rock")||user.equalsIgnoreCase("paper")||user.equalsIgnoreCase("scissors"))
		{
			//Create Random Value
			Random r = new Random();
			int rps = r.nextInt(3);
			String comp = "";
			
			if(rps==0) //Set Computer Result
			{
				comp="Rock";
			}
			else if(rps==1)
			{
				comp="Paper";
			}
			else if(rps==2)
			{
				comp="Scissors";
			}
			
			//Calculate Result Comp Wins
			if((user.equalsIgnoreCase("rock")&&comp.equalsIgnoreCase("paper"))||(user.equalsIgnoreCase("paper")&&comp.equalsIgnoreCase("scissors"))||(user.equalsIgnoreCase("scissors")&&comp.equalsIgnoreCase("rock")))
			{
				compwins++;
				System.out.println(user+" v "+comp+"! Computer Wins!");
			}
			//Calculates Tie
			else if(user.equalsIgnoreCase(comp))
			{
				System.out.println(user+" v "+comp+"! Tie!");
			}
			//User Wins
			else
			{
				userwins++;
				System.out.println(user+" v "+comp+"! User Wins!");
			}
		}
		else //Invalid Response
		{
			System.out.println("Not a valid input! Computer wins");
			compwins++;
		}
		//Display Standing
		System.out.println("Player has won "+userwins+" times and the computer has won "+compwins+" times");		
		}
		
		if(userwins>compwins) //User Wins
		{
			System.out.println("User Wins!");	
		}
		else if(userwins==compwins) //Tie
		{
			System.out.println("Tie!");
		}
		else //Comp Wins
		{
			System.out.println("Computer Wins!");
		}
		System.out.println("Play again? \"Yes\" or \"No\""); //Check if still playing
		trigger = keyboard.nextLine();
		
	}while(trigger.equalsIgnoreCase("yes")); //quits
	
	System.out.println("Goodbye!");
	}

}
