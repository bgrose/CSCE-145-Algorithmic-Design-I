//Step 1 Define the Class

public class Cat {

	private String name;
	private double weight;
	private int numOfLegs;
	//Define constructors
	
	public Cat() 
	{
		this.name = "none yet";
		this.weight = 1.0;
		numOfLegs = 4;
	}
	
	//Mutator
	public Cat(String aName, double aWeight, int anumOfLegs)
	{
		this.setName(aName);
		this.setWeight(aWeight);
		this.setNumOfLegs(anumOfLegs);
	}
	//Create accesors
	public String getName()
	{
		return this.name;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public int getNumofLegs()
	{
		return this.numOfLegs;
	}
	//Step 5, greate mutators for each instance variable
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setWeight(double aW)
	{
		if(aW > 0.0)
		{
		this.weight = aW;
		}
	}
	public void setNumOfLegs(int aNum)
	{
		if(aNum <= 4 && aNum >=0)
		{
			this.numOfLegs = aNum;
		}
	}
	
	//Step 6 other methods
	public String toString()
	{
		return this.name+" "+this.weight+" "+this.numOfLegs;
	}
	public boolean equals(Cat aCat)
	{
		return this.name.contentEquals(aCat.getName()) &&
				this.weight == aCat.getWeight())
	}
}
