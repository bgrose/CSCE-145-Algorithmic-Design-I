/*
 * Written By Bradley Grose
 */
public class Dog extends Animal{

	//Instance Varibale
	private int energyLevel;
	
	//Constructors
			public Dog()
			{
				this.energyLevel = 0;
			}
			public Dog(String aName, double aWeight, int aLevel)
			{
				super(aName, aWeight);
				setLevel(aLevel);
			}
			
			//Setters
			
			public void setLevel(int aLevel)
			{
				if(aLevel>=0&&aLevel<=100)
					this.energyLevel = aLevel;
				else
				{
					System.out.println("Invalid number, assumed 0");
					this.energyLevel = 0;
				}
			}
			
			
			//Getters
			public int getLevel()
			{
				return this.energyLevel;
			}
			
			//other methods
			
			public String toString()
			{
				return super.toString()+" Energy Level: "+this.energyLevel;
			}
			
			public boolean equals(Dog aDog)
			{
				return aDog != null &&
						super.equals(aDog) &&
						this.energyLevel == aDog.getLevel();
			}
}
