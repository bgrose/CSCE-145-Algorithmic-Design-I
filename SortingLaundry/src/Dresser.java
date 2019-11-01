/*
 * Written By Bradley Grose
 */
public class Dresser {
	private Clothing[][] clothes;
	
	//Constructors
	public Dresser() //Defines Area
	{
		this.clothes = new Clothing[5][10];
	}
	
	//Add Clothes
	public void add(Clothing aClothing)
	{
		int i = 0;
		 
		switch (aClothing.getType())  //Figures out which drawer
		{
		case UNDERGARMENT:
			i = 0;
			break;
		case SOCKS:
			i = 1;
			break;
		case STOCKINGS:
			i = 1;
			break;
		case TOP:
			i = 2;
			break;
		case BOTTOM:
			i = 3;
			break;
		case CAPE:
			i = 4;
			break;
		}	
		
		//Find Spot
		 for(int j=0; j<10; j++)
		{
			if(this.clothes[i][j] == null)
			{
				this.clothes[i][j] = aClothing;
				break;
			}
			else
				continue;
		}
	

	}
	
	//Removes items from Array
	public void remove(Clothing aClothing)
	{
		boolean removed = false;
		
		for (int i = 0; i < 5 && !removed; i++) 
		{
			for (int j = 0; j < 10 && !removed; j++)
			{
				if (this.clothes[i][j] != null && this.clothes[i][j].equals(aClothing))
				{
					clothes[i][j] = null;
					removed = true;
				}
			}
		}
	}
	
	//Prints out Drawers
	public void print()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Drawer " + i);
			for (int j = 0; j < 10; j++)
			{
				//print the thing if it isn't null
				if (this.clothes[i][j] != null)
				{
					System.out.println(this.clothes[i][j].toString());
					
				}
			}
		}
	}
}
