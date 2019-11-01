/*
 * Written By Bradley Grose
 */

enum type {retriever, terrirer, husky, yappy, mutt};

public class DomesticDog  extends Dog{
	
	//Instance
	private type type;
		
		//Constructors
		public DomesticDog()
		{
			this.type = type.husky;
		}
		public DomesticDog(String aName, double aWeight, int aLevel, type aType)
		{
			super(aName, aWeight, aLevel);
			setType(aType);
		}
		
		//Setters
		
		public void setType(type aType)
		{
			this.type = aType;
		}
		
		
		//Getters
		public type getType()
		{
			return this.type;
		}
		
		//other methods
		
		public String toString()
		{
			return super.toString()+" Type: "+getType();
		}
		
		public boolean equals(DomesticDog aDoggo)
		{
			return aDoggo != null &&
					super.equals(aDoggo) &&
					this.type == aDoggo.getType();
		}
}
