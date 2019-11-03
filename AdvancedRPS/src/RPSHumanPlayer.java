/*
 * Written By Bradley Grose
 */

import java.util.Scanner;

public class RPSHumanPlayer extends RPSBasicPlayer {
	Scanner keyboard;
	public RPSHumanPlayer()
	{
		super();
		keyboard = new Scanner(System.in);
	}
	
	//OverRides BasicPlayer
	public void chooseGesture()
	{
		super.setGesture(keyboard.nextLine());
	}
	
	
}