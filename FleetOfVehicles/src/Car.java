/*
 * Written By Bradley Grose
 */
public class Car extends Vehicle{
	private double gasMilage;
	private int passengers;
	
	public Car()
	{
		this.gasMilage = 0;
		this.passengers = 1;
	}
	
	public Car(String aMan, int aCyl, String aOwn, double aGas, int aPass)
	{
		super(aMan, aCyl, aOwn);
		this.setGas(aGas);
		this.setPass(aPass);
	}
	
	//Setters
	public void setGas(double aGas)
	{
		if(aGas >=0)
			this.gasMilage = aGas;
		else
		{
			this.gasMilage = 20; //Default
			System.out.println("Invalid Gas Milage. Assumed 20");
		}
	}
	public void setPass(int aPass)
	{
		if(aPass >=1)
			this.passengers = aPass;
		else
		{
			this.passengers = 1; //Default
			System.out.println("Invalid Passanger Number. Assumed 1");
		}
	}
	
	//Getters
	public double getGas()
	{
		return this.gasMilage;
	}
	public int getPass()
	{
		return this.passengers;
	}

	//Other Methods
	public String toString()
	{
		return super.toString()+"\nGas Milage: "+this.gasMilage+"\n# of Passangers "+this.passengers;
	}
	
	public boolean equals(Car aCar)
	{
		return aCar != null &&
				super.equals(aCar) &&
				this.gasMilage == aCar.getGas() &&
				this.passengers == aCar.getPass();
				
	}
}
