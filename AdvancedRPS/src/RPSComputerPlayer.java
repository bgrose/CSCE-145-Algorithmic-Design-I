/*
 * Written By Bradley Grose
 */

import java.util.Random;

public class RPSComputerPlayer extends RPSBasicPlayer{

	//Instance Variable
	Random rand;
	
	//Constructor
	
	public RPSComputerPlayer()
	{
		super();
		rand = new Random();
	}
	
	//Setter Override
	public void chooseGesture()
	{
		int gestnum = rand.nextInt(3);
		if(gestnum == 0)
			super.setGesture("rock");
		if(gestnum == 1)
			super.setGesture("paper");
		if(gestnum == 2)
			super.setGesture("scissors");
	}
}
