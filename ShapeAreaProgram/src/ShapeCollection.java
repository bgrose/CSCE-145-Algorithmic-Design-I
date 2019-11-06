/*
 * Bradley Grose
 */
public class ShapeCollection {
	
	//Creates array
	private Shape[] shapes = null;
	
	public ShapeCollection()
	{
		shapes = new Shape[10];
	}
	
	//Methods
	public void addShape(Shape aShape)
	{
		for(int i=0; i<shapes.length; i++)
		{
			if(shapes[i] == null)
			{
				shapes[i] = aShape;
				break;
			}
		}
	}
	
	private void sortShapes()
	{
		boolean sort = true;
		Shape tempo;
		
		while (sort)
		{
			sort = false;
			for (int i = 0; i < shapes.length; i++)
			{
				if (shapes[i]!=null && shapes[i+1]!=null && shapes[i].getArea() > shapes[i +1].getArea())
				{
					tempo = shapes[i]; 
					shapes[i] = shapes[i + 1];
					shapes[i + 1] = tempo; 
					sort = true; 
				}
			}
		}
	}
	
	public void removeShape(String aShape, double aArea)
	{
		boolean removed = false;
		
		for(int i =0; i<shapes.length&&!removed; i++)
		{	
			
			if (shapes[i] != null && shapes[i].getShapeType().equals(aShape) && shapes[i].getArea() == aArea)
			{
				shapes[i] = null;
				removed = true;
			}
		}
	}
	
	public void printShapes()
	{
		this.sortShapes();
		
		System.out.println();
		for(int i=0; i<shapes.length; i++)
		{
			if(shapes[i] != null)
				System.out.println(shapes[i].toString());
		}
	}
	
	
}
