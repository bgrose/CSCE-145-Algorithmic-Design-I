/*
 * Written By Bradley Grose
 */
public class Animal {

	//Instance Variables
	private String name;
	private double weight;
	
	//Constructors
	public Animal()
	{
		this.name = "none yet";
		this.weight = 20;
	}
	public Animal(String aName, double aWeight)
	{
		this.setName(aName);
		this.setWeight(aWeight);
	}
	
	//Setters
	
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setWeight(double aWeight)
	{
		if(aWeight>0)
		{
			this.weight = aWeight;
		}
		else
		{
			this.weight = 20;
			System.out.println("Invalid Weight, Assumed 20 pounds");
		}
	}
	
	//Getters
	public String getName()
	{
		return this.name;
	}
	public double getWeight()
	{
		return this.weight;
	}
	
	//other methods
	
	public String toString()
	{
		return "Name: "+this.name+" Weight: "+this.weight;
	}
	
	public boolean equals(Animal aAnimal)
	{
		return aAnimal != null &&
				this.name == aAnimal.getName() &&
				this.weight == aAnimal.getWeight();
	}
}
