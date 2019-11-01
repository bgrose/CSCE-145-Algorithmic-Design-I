/*
 * Written By Bradley Grose
 */
public class Coffee {
	private String name;
	private int content;
	private double cupAmount;
	
	public Coffee()
	{
		this.name = "none yet";
		this.content= 50; //Min ammount
		this.cupAmount = 60; //Highest # Cups
	}
	
	public Coffee(String aName,int aContent, double aRisky)
	{
		this.setName(aName);
		this.setContent(aContent);
		this.setRiskyAmount(aContent);
	}
	
	/*Getters
	public String getName()
	{
		return this.name;
	}
	public int getContent()
	{
		return this.content;
	}
	public double getCup()
	{
		return this.cupAmount;
	}
	*/

		
		//Mutators 
		public void setName(String aName)
		{
			this.name = aName;
		}
		public void setContent(int aContent)
		{
			if((aContent>=50)&&(aContent<=300))
			{
				this.content = aContent;
			}
			else
			{
				this.content = 50;
				System.out.println("This is not a normal amount of caffiene");
			}
		}
		public void setRiskyAmount(int aContent)
		{
			this.cupAmount = 180/((aContent/100)*6);
		}
		
		
		public String toString()
		{
			return "It would take "+this.cupAmount+" "+this.name+" coffees before it’s dangerous to drink more.";
		}
}
