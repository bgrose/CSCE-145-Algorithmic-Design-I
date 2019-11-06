
public class Rectangle implements Shape{
	private double length;
	private double width;
	
	
	//Constructor
	public Rectangle()
	{
		this.length = 1;
		this.width = 1;
	}
	public Rectangle(double aLength, double aWidth)
	{
		this.setLength(aLength);
		this.setWidth(aWidth);
	}
	
	//Setters
	public void setLength(double aLength)
	{
		if(aLength > 0)
			this.length = aLength;
		else
			System.out.println("Invalid Size, Assumed 1.0");
	}
	public void setWidth(double aWidth)
	{
		if(aWidth > 0)
			this.width = aWidth;
		else
			System.out.println("Invalid Size, Assumed 1.0");
	}
	
	//Getters
	public double getLength()
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	
	
	
	//Shape Methods
		public double getArea()
		{		
			return this.length*this.width;
		}
		public String getShapeType()
		{
			return "Rectangle";
		}
		public String toString()
		{
			return getShapeType()+" Length: "+
						getLength()+" Width: "+
						getWidth()+" Area: "+
						getArea();
			
		}
}
