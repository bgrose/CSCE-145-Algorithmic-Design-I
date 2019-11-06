/*
 * Written by Bradley Grose
 */
public class Circle implements Shape {

	
	public static double pi = 3.14159;

	private double radius;
	
	
	//Constructor
	public Circle()
	{
		this.radius = 1;
	}
	public Circle(double aRad)
	{
		this.setRadius(aRad);
	}
	
	//Setters
	public void setRadius(double aRad)
	{
		if(aRad > 0)
			this.radius = aRad;
		else
			System.out.println("Invalid Size, Assumed 1.0");
	}

	
	//Getters
	public double getRad()
	{
		return this.radius;
	}
	
	
	
	//Shape Methods
		public double getArea()
		{		
			return pi*getRad()*getRad();
		}
		public String getShapeType()
		{
			return "Circle";
		}
		public String toString()
		{
			return getShapeType()+" Radius: "+
						getRad()+ " Area: "+
						getArea();
			
		}
}
