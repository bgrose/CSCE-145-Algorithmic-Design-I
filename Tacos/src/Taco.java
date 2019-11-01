
public class Taco {
private String name;
private String loc;
private double price;

	public Taco()
	{
		this.name = this.loc = "none";
		this.price = 0.0;
	}
	
	public Taco(String aName, String aLoc, double aPrice)
	{
		this.Setname(aName);
		this.setLoc(aLoc);
		this.setPrice(aPrice);
	}
	public String getName()
	{
		return this.name;
	}
	public String getLoc()
	{
		return this.getLoc();
	}
	public double getPrice()
	{
		return this.price;
	}
	public void Setname(String aName)
	{
		this.name = aName;
	}
	public void setLoc(String aLoc)
	{
		this.loc = aLoc;
	}
	public void setPrice(double aPrice)
	{
		if(aPrice >= 0.0)
		{
			this.price = aPrice;
		}
	}
	public String toString()
	{
		return this.name+" "+this.loc+" "+this.price;
	}
	public boolean equals(Taco aTaco)
	{
		return aTaco != null &&
				this.name.contentEquals(aTaco.getName()) &&
				this.loc.contentEquals(aTaco.getLoc()) &&
				this.price == aTaco.getPrice();
	}
	
}
