/*
 * Written By Bradley Grose
 */
public class Box {
	//Instance Varibales
	private String label = " ";
	private double length = 0;
	private double width = 0;
	private double height = 0;
	
	public Box()
	{
		this.setLabel("Default Box");
		this.setHeight(1);
		this.setLength(1);
		this.setWidth(1);
	}
	public Box(String aLabel, Double aLength, Double aWidth, Double aHeight)
	{
		this.setLabel(label);
		this.setHeight(height);
		this.setLength(length);
		this.setWidth(width);
	}
	
	//Getters
	public String getLabel()
	{
		return label;
	}
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public double getHeight()
	{
		return height;
	}
	
	//Setters
	public void setLabel(String aLabel)
	{
		this.label = aLabel;
	}
	public void setLength(double aLength)
	{
		if(aLength <= 0)
			return;
		this.length = aLength;
	}
	public void setWidth(double aWidth)
	{
		if(aWidth <= 0)
			return;
		this.width = aWidth;
	}
	public void setHeight(double aHeight)
	{
		if(aHeight <= 0)
			return;
		this.height = aHeight;
	}
	
	public double getVolume()
	{
		return length * width * height;
	}
	
	public String toString()
	{
		return String.format("Label: "+label+" Volume: "+getVolume());
	}
	
	
}
