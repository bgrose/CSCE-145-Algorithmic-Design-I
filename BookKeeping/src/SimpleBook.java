/*
 * Bradley Grose
 */
public class SimpleBook implements Book{

	private String name;
	private String author;
	private double CallNum;
	
	//Constructors
	public SimpleBook()
	{
		this.name = "none yet";
		this.author = "none yet";
		this.CallNum = 0;
	}
	public SimpleBook(String aName, String aAuth, double aCall)
	{
		setName(aName);
		setAuthor(aAuth);
		setCallNumber(aCall);
	}
	
	//Setters
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setAuthor(String aAuth)
	{
		this.author = aAuth;
	}
	public void setCallNumber(double aCall)
	{
		if(aCall >= 0 && aCall <1000)
		{
			this.CallNum = aCall;
		}
	}
	
	//Getters
	public String getName()
	{
		return this.name;
	}
	public String getAuthor()
	{
		return this.author;
	}
	public double getCallNumber()
	{
		return this.CallNum;
	}
	
	//Others
	public String toString()
	{
		return this.getName()+"\n"+this.getAuthor()+"\n"+this.getCallNumber();
	}
	
	public boolean equals(Book aBook)
	{
		return aBook != null &&
				this.name == aBook.getName() &&
				this.author == aBook.getAuthor()&&
				this.CallNum == aBook.getCallNumber();
	}
}
