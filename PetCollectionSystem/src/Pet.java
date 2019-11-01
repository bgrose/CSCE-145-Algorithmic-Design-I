//Step 1. Define Class
public class Pet {

	//Create Instance Variable
	private String name;
	private double weight;
	private int age;
	private PetType type;
	
	//Create Constuctors
	public Pet()
	{
		this.name = "none yet";
		this.weight = 1.0;
		this.age = 0;
		this.type = PetType.abomination;
	}
	
	public Pet(String aName, double aWeight, int aAge, PetType aType)
	{
		//TODO call mutators
		this.SetAge(aAge);
		this.SetName(aName);
		this.SetWeight(aWeight);
		this.SetType(aType);
	}
	
	//Create Accessors
	public String getName()
	{
		return this.name;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public int getAge()
	{
		return this.age;
	}
	public PetType getType()
	{
		return this.type;
	}
	
	//Create mutators
	public void SetName(String aName)
	{
		this.name = aName;
	}
	public void SetWeight(double aWeight)
	{
		if(aWeight > 0)
		{
			this.weight = aWeight;
		}
		else
		{
			this.weight = 1; //Default Weight
		}
	}
	public void SetAge(int aAge)
	{
		if(age >= 0)
		{
			this.age = aAge;
		}
	}
	public void SetType(PetType aType)
	{
		this.type = aType;
	}
	
	//Step 6. MEthods
	public String toString()
	{
		return this.name+" "+this.weight+" "+this.age+" "+this.type;
	}
	public boolean equals(Pet aPet)
	{
		return aPet != null &&
				this.name.equals(aPet.getName()) &&
				this.weight == aPet.getWeight() &&
				this.age == aPet.getAge() &&
				this.type == aPet.getType();
	}
	
	//Step 7 More Methods
	//Static methods are in class not and instance
	public static Pet createPet(PetType aType)
	{
		Pet newPet = new Pet();
		newPet.SetType(aType);
		return newPet;
		//Static Methods cannot us this
		//Static methods can call Static Methods
		//Non Static can call static methods
		//Static Methods cant call non-statics
	}
	
	public static Pet clone(Pet aPet)
	{
		if (aPet == null)
		{
			return null;
		}
		Pet ret = new Pet();
		ret.SetName(aPet.getName());
		ret.SetAge(aPet.getAge());
		ret.SetWeight(aPet.getWeight());
		ret.SetType(aPet.getType());
		return ret;
	}
	
	public static Pet splice(Pet pet01, Pet pet02)
	{
		if ((pet01 == null)||(pet02 == null))
			return null;
			
		if (pet01.getType() == pet02.getType())
		{
			System.out.println("That's Boring");
			return createPet(pet01.getType());
		}
		else {
			System.out.println("You're creating a part "+pet01.getType()+
					" and part "+pet02.getType());
			return createPet(PetType.abomination);
		}
		
	}
	public static Pet splice(Pet[] pets)
	{
		return createPet(PetType.abomination);
	}
}
