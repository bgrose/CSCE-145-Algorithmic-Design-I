/*
 * Written By Bradley Grose
 */

enum mood{sleepy, playful, hungry};

public class Cat extends Animal{

	//Instance Variables
	private mood mood;
	
		
		//Constructors
		public Cat()
		{
			this.mood = mood.sleepy;
		}
		public Cat(String aName, double aWeight, mood aMood)
		{
			super(aName, aWeight);
			setMood(aMood);
		}
		
		//Setters
		
		public void setMood(mood aMood)
		{
			this.mood = aMood;
		}
		
		
		//Getters
		public mood getMood()
		{
			return this.mood;
		}
		
		//other methods
		
		public String toString()
		{
			return super.toString()+" Mood: "+this.mood;
		}
		
		public boolean equals(Cat aCat)
		{
			return aCat != null &&
					super.equals(aCat) &&
					this.mood == aCat.getMood();
		}
}
