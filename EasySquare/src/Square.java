/*
 * Bradley Grose
 */
public class Square {

	private int length;
	
	//Constructors
	public Square()
	{
		this.length = 1;
	}
	
	public Square(int aLength) throws DimensionException
	{
			this.length = aLength;
		
	}
	
	//Accessor and Mutators
	public void setLength(int aLength) 
			throws DimensionException
	{
		//Checks for throw
			if(aLength < 1)
				throw new DimensionException();
			else
				this.length = aLength;
	}
	
	public int getLength()
	{
		return this.length;
	}
	
	//Other Methods
	public void draw()
	{
		for(int i=0; i<length; i++)
		{
			for(int j=0; j<length; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public int getArea()
	{
		return getLength()*getLength();
	}
	
	public int getPerimeter()
	{
		return 4*getLength();
	}
}
