
public class UGrad extends Student{
	private int level; //1 Fresh, 2, Soph, 3 Jun, 4 Senior, 5 SSen
	
	public UGrad()
	{
		super();
		this.level = 1;
	}
	public UGrad(String aName, int aId, int aLevel)
	{
		super(aName, aId);
		setLevel(aLevel);
		
	}
	public int getLevel()
	{
		return this.level;
	}
	public void setLevel(int aLevel)
	{
		if(aLevel >=1 && aLevel <= 5)
			this.level = aLevel;
		else
			this.level = 1;
	}
	
	
	public String toString()
	{
		return super.toString()+" "+this.level;
	}
	
	public boolean equals(UGrad aU)
	{
		return aU != null &&
				super.equals(aU) &&
				this.level == aU.getLevel();
			
	}
	
}
