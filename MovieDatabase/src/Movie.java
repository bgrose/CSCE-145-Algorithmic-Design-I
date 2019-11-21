/*
 * Bradley Grose
 */
public class Movie {
	private String name;
	private int year;
	private int rating;
	private String director;
	private int boxGross;
	
	public Movie()
	{
		this.name = "none yet";
		this.year = 0;
		this.rating = 1;
		this.director = "none yet";
		this.boxGross = 0;
	}
	
	public Movie(String aName, int aYear, int aRating, String aDir, int aGross)
	{
		this.setName(aName);
		this.setRating(aRating);
		this.setYear(aYear);
		this.setDirector(aDir);
		this.setBoxGross(aGross);
	}
	
	//Setter
	public void setName(String aName)
	{
		this.name = aName;
	} 
	public void setYear(int aYear)
	{
		if(aYear >= 0)
			this.year = aYear;
		else
			System.out.println("Invalid Year");
	} 
	public void setRating(int aRating)
	{
		if(aRating >= 1 && aRating <= 5)
			this.rating = aRating;
		else
			System.out.println("Invalid Rating");
	}
	public void setDirector(String aDir)
	{
		this.director = aDir;
	} 
	public void setBoxGross(int aGross)
	{
		if(aGross >= 0)
			this.boxGross = aGross;
		else
			System.out.println("Invalid Income");
	} 
	
	//Getters
	public String getName()
	{
		return this.name;
	} 
	public int getYear()
	{
		return this.year;
	} 
	public int getRating()
	{
		return this.rating;
	}
	public String getDirector()
	{
		return this.director;
	} 
	public int getBoxGross()
	{
		return this.boxGross;
	}
	
	//Other Methods
		public String toString()
		{
			return "\nNAME: " + this.name + "\nYEAR: " + this.year + "\nRATING: " + this.rating + "\nDIRECTOR: " + this.director + "\nBOX OFFICE GROSS: " + this.getBoxGross();
		}
		
		public boolean nameEquals(String aName)
		{
			return aName != null && this.name.equals(aName);
		}

	
}
