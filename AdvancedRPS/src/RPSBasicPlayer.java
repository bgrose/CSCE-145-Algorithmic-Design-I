/*
 * Written By Bradley Grose
 */
public class RPSBasicPlayer implements RPSPlayer {
	
	//Instance variables
	private String gesture;
	private int points;
	
	//Constructor
	public RPSBasicPlayer()
	{
		this.gesture = "none";
		this.points = 0;
	}
	
	//Setters
	public void setGesture(String aGesture)
	{
		if(aGesture.equalsIgnoreCase("rock")||
				aGesture.equalsIgnoreCase("paper")||
				aGesture.equalsIgnoreCase("scissors"))
		{
			this.gesture = aGesture;
		}
		else
		{
			System.out.println("Invaid choice");
			this.gesture = "none";
		}
	}
	public void setPoints(int aPoints)
	{
		if(aPoints >= 0)
		{
			this.points = aPoints;
		}
	}
	
	//Getters
	public String getGesture()
	{
		return this.gesture;
	}
	public int getPoints()
	{
		return this.points;
	}
	
	public void chooseGesture()
	{
		gesture = "rock";
	}
	
	
}
