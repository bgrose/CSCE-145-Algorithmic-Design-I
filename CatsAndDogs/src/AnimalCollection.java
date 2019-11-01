/*
 * Written By Bradley Grose
 */
public class AnimalCollection {

	private static final int MAX_ANIMALS = 10;
	
	//Constructor
	private Animal[] animals;
	
	public AnimalCollection()
	{
		animals = new Animal[MAX_ANIMALS];
	}
	
	//Getter
	public Animal[] getAnimals() 
	{
		return this.animals;
	}
	
	//Adds Animal
	public void addAnimal(Animal aAnimal)
	{
		for(int i = 0; i<animals.length; i++)
		{
			if(animals[i] == null)
			{
				animals[i] = aAnimal;
				return;
			}
		}
		
		//if full
		System.out.println("Database is Full");
	}
	
	//Removes Animal
	public void removeAnimal(String aName)
	{
		for(int i=0; i<animals.length; i++)
		{
			if(animals[i] == null)
				continue;
			if(animals[i].getName().equalsIgnoreCase(aName))
			{
				animals[i] = null;
				return;
			}
		}
		
	}
	
	public void printAnmals()
	{
		for(int i=0; i<animals.length; i++)
		{
			System.out.println(animals[i].toString());
		}
	}
	
	//Checks for if spot full
	public boolean hasAnimals() {
		for (Animal animal : this.getAnimals()) {
			if (animal != null) 
				return true;
		}

		return false;
	}
}
