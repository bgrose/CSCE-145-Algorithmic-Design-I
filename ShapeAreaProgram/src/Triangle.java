
public class Triangle implements Shape{
	private double base;
	private double height;
	
	
	//Constructor
	public Triangle()
	{
		this.base = 1;
		this.height = 1;
	}
	public Triangle(double aBase, double aHeight)
	{
		this.setBase(aBase);
		this.setHeight(aHeight);
	}
	
	//Setters
	public void setBase(double aBase)
	{
		if(aBase > 0)
			this.base = aBase;
		else
			System.out.println("Invalid Size, Assumed 1.0");
	}
	public void setHeight(double aHeight)
	{
		if(aHeight > 0)
			this.height = aHeight;
		else
			System.out.println("Invalid Size, Assumed 1.0");
	}
	
	//Getters
	public double getBase()
	{
		return this.base;
	}
	public double getHeight()
	{
		return this.height;
	}
	
	
	
	//Shape Methods
		public double getArea()
		{		
			return .5*this.base*this.height;
		}
		public String getShapeType()
		{
			return "Triangle";
		}
		public String toString()
		{
			return getShapeType()+" Base: "+
						getBase()+" Height: "+
						getHeight()+" Area: "+
						getArea();
			
		}
}
