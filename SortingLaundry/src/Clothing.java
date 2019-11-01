/*
 * Written By Bradley Grose
 */
enum Type {UNDERGARMENT, SOCKS, STOCKINGS, TOP, BOTTOM, CAPE}; //Makes Global
enum Color {BROWN, RED, PINK, ORANGE, GREEN, BLUE, PURPLE, GREY};
	
public class Clothing {
	
	//Sets Enums or Instances
	
	private Type type;
	private Color color;
	
	//Constructors
	public Clothing() //Default
	{
		this.setType(Type.CAPE);
		this.setColor(Color.BLUE);
	}
	public Clothing(Type atype, Color aColor) //Paramaterized
	{
		this.setType(atype);
		this.setColor(aColor);
	}
	
	//Setters
	public void setType(Type aType) //Enum Checks
	{
		this.type = aType;
	}
	public void setColor(Color aColor) //Enum Checks
	{
		this.color = aColor;
	}
	
	//Getters
	public Color getColor()
	{
		return this.color;
	}
	public Type getType()
	{
		return this.type;
	}
	
	//Other Methods
	public String toString()
	{
		return this.color + " " + this.type;
	}
	
	public boolean equals(Clothing aClothing)
	{
		return aClothing != null &&
				this.type == aClothing.getType() &&
				this.color == aClothing.getColor();
	}
}
