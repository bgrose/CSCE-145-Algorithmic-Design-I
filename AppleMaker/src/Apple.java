/*
 * Written by Bradley Grose
 */
public class Apple {
		//Creates Instance Variables
		private String type;
		private double weight;
		private double cost;
		
		//Constructor
		public Apple()
		{
			this.type = "Gala"; //Given Example
			this.weight = 0.5; //Given Default
			this.cost = 0.89; //Given Price
		}
		
		//Constructs Apple
		public Apple(String aType, double aWeight, double aCost)
		{
			this.setType(aType);
			this.setWeight(aWeight);
			this.setCost(aCost);
		}
		
		//Accessors
		public String getType()
		{
			return this.type;
		}
		
		public double getWeight()
		{
			return this.weight;
		}
		
		public double getCost()
		{
			return this.cost;
		}
		
		//Setters for Each
		public void setType(String aType)
		{
			if(aType.equalsIgnoreCase("Red Delicious")||aType.equalsIgnoreCase("Gala")||aType.equalsIgnoreCase("Golden Delicious")||aType.equalsIgnoreCase("Granny Smith"))
			{
				this.type=aType;
			}
			else
			{
				System.out.println("Invalid Name");
			}
		}
		public void setWeight(double aWeight)
		{
			if((aWeight > 0.0)&&(aWeight < 2.0))
			{
				this.weight = aWeight;
			}
			else
			{
				System.out.println("Invalid Weight");
			}
		}
		public void setCost(double aCost)
		{
			if(aCost > 0.0)
			{
				this.cost = aCost;
			}
			else
			{
				System.out.println("Invalid Cost");
			}
		}
		
		public String toString()
		{
			return "Type: " + type + "\nWeight: " + weight + "kg\nPrice: $" + cost;
		}
}
