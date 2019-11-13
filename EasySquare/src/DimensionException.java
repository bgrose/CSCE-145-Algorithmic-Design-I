/*
 * Written By Bradley Grose
 */
public class DimensionException extends Exception
{
	
	//Default constructor
	public DimensionException()
	{
		super("Dimensions must be at least 1");
	}
	
	//Constructor
	public DimensionException(String aMessage)
	{
		super(aMessage);
	}
}
