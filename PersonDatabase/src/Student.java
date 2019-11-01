
public class Student extends person {
	private int id;
	
	public Student()
	{
		super();
		this.id = 0;
	}
	public Student(String aName, int aId)
	{
		super(aName);
		this.setID(aId);
	}
	public int getID()
	{
		return this.id;
	}
	public void setID(int aId)
	{
		if(aId >= 0)
			this.id = aId;
		
	}
	
	//Overriding
	public String toString()
	{
		return super.toString()+" "+this.id;
	}
	
	public boolean equals(Student aStudent)
	{
		return aStudent != null &&
				super.equals(aStudent) &&
				this.id == aStudent.getID();
	}
}
