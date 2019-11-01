
public class SawLine implements Line {
	
	//Instance Variable
	private double modValue;

	//Default Constructor
	public SawLine() 
	{
		this.modValue = 10;
	}

	//Paramerized Constructor
	public SawLine(double aModValue) 
	{
		setModValue(aModValue);
	}

	//Getters
	public double getModValue() 
	{
		return modValue;
	}

	//Seters
	public void setModValue(double amodValue) 
	{
		this.modValue = amodValue;
	}

	//Sets Values for point
	public double getYPoint(double xCord) 
	{
		return xCord % modValue;
	}
}
