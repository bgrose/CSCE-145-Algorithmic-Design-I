
public class person {
	private String name;
	private String address;
	
	public person()
	{
		name = "none";
		address = "none";
	}
	public person(String aName)
	{
		this.setName(aName);
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String aName)
	{
		this.name = aName;
	}
	
	public String toString()
	{
		return this.name;
	}
	public boolean equals(person aPerson)
	{
		return aPerson != null &&
				this.name.equals(aPerson.getName());
	}
}
