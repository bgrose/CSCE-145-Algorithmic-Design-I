/*
 * Written by Bradley Grose
 */
public class Truck extends Vehicle{
	private double loadCapicity;
	private double towingCapicity;
	
	public Truck()
	{
		this.loadCapicity = 0;
		this.towingCapicity = 0;
	}
	
	public Truck(String aMan, int aCyl, String aOwn, double aLoad, double aTow)
	{
		super(aMan, aCyl, aOwn);
		this.setLoad(aLoad);
		this.setTow(aTow);
	}
	
	//Setters
	public void setLoad(double aLoad)
	{
		if(aLoad >=0)
			this.loadCapicity = aLoad;
		else
		{
			this.loadCapicity = 0; //Default
			System.out.println("Invalid Load Capicity. Assumed 0");
		}
	}
	public void setTow(double aTow)
	{
		if(aTow >=0)
			this.towingCapicity = aTow;
		else
		{
			this.towingCapicity = 0; //Default
			System.out.println("Invalid Towing Capicity. Assumed 0");
		}
	}
	
	//Getters
	public double getLoad()
	{
		return this.loadCapicity;
	}
	public double getTow()
	{
		return this.towingCapicity;
	}
	
	//Other Methods
	public String toString()
	{
		return super.toString()+"\nLoad Capicity: "+this.loadCapicity+"\nTowing Capicity "+this.towingCapicity;
	}
	
	public boolean equals(Truck aTruck)
	{
		return aTruck != null &&
				super.equals(aTruck) &&
				this.loadCapicity == aTruck.getLoad() &&
				this.towingCapicity == aTruck.getTow();
				
	}
}
