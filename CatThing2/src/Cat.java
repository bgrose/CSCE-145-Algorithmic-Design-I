//Step 1 Define the class
public class Cat {
	//Step 2. Creat attribbutes/Instance Variables
	private String name;
	private double weight; //Make it private for encapsalation
	private int numOfLegs;
	
	//Step 3 Create Constructors
	public Cat() //Default Constructor
	{
		this.name = "none yet";
		this.weight = 1.0;
		this.numOfLegs = 4;
	}
	public Cat(String aName, double aWeight, int aNumofLegs)
	{
		this.setName(aName);
		this.setWeight(aWeight);
		this.setNumOfLegs(aNumofLegs);
	}
	
	//Create Accessprs for each
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
	
	
	//Step 5 mutators
	public void setName(String aName)
	{
		this.name=aName;
	}
	public void setWeight(double aWeight)
	{
		if(aWeight > 0.0)
		{
			this.weight = aWeight;
		}
		else
		{
			this.weight = 1.0;
		}
	}
	public void setNumOfLegs(int aNumofLegs)
	{
		if(aNumofLegs >= 0.0&&aNumofLegs <= 4)
		{
			this.numOfLegs = aNumofLegs;
		}
		else
		{
			this.numOfLegs = 4;
		}
	}
	//Other Methods
	public String toString()
	{
		return this.name+" "+this.weight+" "+this.numOfLegs;
	}
	public boolean equals(Cat aCat)
	{
		return this.name.equals(aCat.getName())&&
				this.weight == aCat.getWeight() &&
				this.numOfLegs == aCat.getNumofLegs();
	}
}
