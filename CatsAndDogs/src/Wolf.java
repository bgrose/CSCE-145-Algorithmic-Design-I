/*
 * Written By Bradley Grose
 */
public class Wolf extends Dog {

	private String packLeaderName;
	
	//Constructors
	public Wolf()
	{
		this.packLeaderName = "none";
	}
	public Wolf(String aName, double aWeight, int aLevel, String aLead)
	{
		super(aName, aWeight, aLevel);
		setLead(aLead);
	}
	
	//Setters
	
	public void setLead(String aLead)
	{
		this.packLeaderName = aLead;
	}
	
	//Getters
	public String getLead()
	{
		return this.packLeaderName;
	}
	
	//other methods
	
	public String toString()
	{
		return super.toString()+" Pack Leader Name: "+getLead();
	}
	
	public boolean equals(Wolf aWolf)
	{
		return aWolf != null &&
				super.equals(aWolf) &&
				this.packLeaderName == aWolf.getLead();
	}
}
