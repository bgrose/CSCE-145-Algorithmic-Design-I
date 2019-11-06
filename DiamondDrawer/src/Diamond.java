/*
 * Written by Bradley Grose
 */
public class Diamond extends ShapeBasics implements DiamondInterface {

	//Instance Variables
	private int width;
	
	//Constructor
	public Diamond()
	{
		super();
		width = 0;
	}
	
	public Diamond(int width, int offset)
	{
		super(offset);
		setWidth(width);
	}
	
	//Setters
	public void setWidth(int aWidth)
	{
		if(aWidth % 2 == 1 && aWidth > 0)
			this.width = aWidth;
	}
	
	public int getWidth()
	{
		return this.width;
	}
	
	//Drawing voids
	
	public void drawHere()
	{
		drawTopV();
		drawBottomV();
	}
	
	//Draws top part of diamond
	public void drawTopV()
	{
		int start = width+this.getOffset() / 2;
		
		//Spaces out the diamond
		skipSpaces(start);
		
		System.out.println("*");
		int diamondcount = width / 2 - 1;
		int inWidth = 1;
		
		for (int i=0; i<diamondcount; i++)//Runs lines with 2 stars
		{
			start--;
			skipSpaces(start);
			System.out.print("*");
			skipSpaces(inWidth);
			System.out.println("*"); //Sends to next line
			
			inWidth += 2;
		}
	}
	
	//Draws bottom part of diamond
	public void drawBottomV()
	{
		int start = (width+this.getOffset() /2) - width /2;
		int diamondcount = width /2;
		int inWidth = width - (width % 2 + 1);
		
		//Draw the V down
		for(int i = 0; i < diamondcount; i++)
		{
			skipSpaces(start);
			start++;
			System.out.print("*");
			skipSpaces(inWidth);
			System.out.println("*"); //Sends to next line
			inWidth -= 2;
		}
		
		skipSpaces(start); //Adds bottom piece
		System.out.println("*");
	}
	
	public static void skipSpaces(int lineNumber) //Counts out needed spaces
	{
		for(int i=0; i<lineNumber; i++)
			System.out.print(" ");
	}
	
	
}
