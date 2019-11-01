/*
 * Written By Bradley Grose
 */
public class Leopard extends Cat{

	private int numberOfSpots;
	
	//Constructors
	public Leopard()
	{
		this.numberOfSpots = 0;
	}
	public Leopard(String aName, double aWeight, mood aMood, int aSpot)
	{
		super(aName, aWeight, aMood);
		setSpot(aSpot);
	}
	
	//Setters
	
	public void setSpot(int aSpot)
	{
		if(aSpot >= 0)
			this.numberOfSpots = aSpot;
		else
		{
			this.numberOfSpots = 0;
			System.out.println("");
		}
	}
	
	//Getters
	public int getSpot()
	{
		return this.numberOfSpots;
	}
	
	//other methods
	
	public String toString()
	{
		return super.toString()+" Number of Spots: "+getSpot();
	}
	
	public boolean equals(Leopard aCat)
	{
		return aCat != null &&
				super.equals(aCat) &&
				this.numberOfSpots == aCat.getSpot();
	}

}
