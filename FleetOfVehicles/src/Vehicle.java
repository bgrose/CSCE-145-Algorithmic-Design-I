/*
 * Written By Bradley Grose
 */
public class Vehicle {
	private String manufacturer;
	private int cylinders;
	private String ownersName;
	
	public Vehicle()
	{
		this.manufacturer = "none";
		this.cylinders = 4;
		this.ownersName = "none";
	}
	
	public Vehicle(String aManu, int aCyl, String aOwn)
	{
		this.setManu(aManu);
		this.setCyl(aCyl);
		this.setOwn(aOwn);
	}
	
	//Setters
	public void setManu(String aManu)
	{
		this.manufacturer = aManu;
	}
	public void setCyl(int aCyl)
	{
		if(aCyl > 0)
			this.cylinders = aCyl;
		else
		{
			this.cylinders = 4; //Default
			System.out.println("Invalid Cylinder Count. Assumed 4");
		}
	}
	public void setOwn(String aOwn)
	{
		this.ownersName = aOwn;
	}
	
	//Getters
	public String getManu()
	{
		return this.manufacturer;
	}
	public int getCyl()
	{
		return this.cylinders;
	}
	public String getOwn()
	{
		return this.ownersName;
	}
	
	//Other Methods
	public String toString()
	{
		return "Manufacturer: "+this.manufacturer+"\n# of Cylinders: "+this.cylinders+"\nOwners Name: "+this.ownersName;
	}
	
	public boolean equals(Vehicle aVehicle)
	{
		return aVehicle != null &&
				this.manufacturer == aVehicle.getManu() &&
				this.cylinders == aVehicle.getCyl() &&
				this.ownersName == aVehicle.getOwn();
				
	}
}
