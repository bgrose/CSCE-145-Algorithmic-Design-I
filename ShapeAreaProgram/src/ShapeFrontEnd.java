/*
 * Bradley Grose
 */

import java.util.Scanner;

public class ShapeFrontEnd {

	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Shapes collection");
	
		//Variables
		String type = "";
		double area;
		double dim1 = 0;
		double dim2 = 0;
		int choice = 0;
		
		ShapeCollection shapes = new ShapeCollection();
	
		while(choice!=9)
		{
			//Prompt the user
			System.out.println("Enter 1: Add a shape\nEnter 2: Remove a shape\nEnter 9: Quit");
			choice = keyboard.nextInt();
			switch(choice)
			{
			case 1: //Adds
				System.out.println("What type of shape?\nRectangle, Triangle, or Circle?");
				keyboard.nextLine();
				type = keyboard.nextLine();
				type = type.toLowerCase();
				switch(type)
				{
				case "rectangle": 
					System.out.println("Enter a length");
					dim1 = keyboard.nextDouble();
					System.out.println("Enter a Width");
					dim2 = keyboard.nextDouble();
					shapes.addShape(new Rectangle(dim1, dim2));
					break;
				case "triangle":
					System.out.println("Enter a Base");
					dim1 = keyboard.nextDouble();
					System.out.println("Enter a Height");
					dim2 = keyboard.nextDouble();
					shapes.addShape(new Triangle(dim1, dim2));
					break;
				case "circle":
					System.out.println("Enter a Radius");
					dim1 = keyboard.nextDouble();
					shapes.addShape(new Circle(dim1));
					break;
				default:
					System.out.println("Invalid Shape");
					break;
					}	
				break;
				
				
			case 2: //Removes
				System.out.println("Enter the shape type.(Rectangle, Triangle, and Circle)");
				keyboard.nextLine();
				type = keyboard.nextLine();
				System.out.println("Enter an area");
				area = keyboard.nextDouble();
				shapes.removeShape(type, area);
				keyboard.nextLine();
				break;
				
			case 9: //Exits
				System.out.println("Goodbye");
				System.exit(0);
				break;
			}
			
			System.out.println();			
			shapes.printShapes();
			System.out.println();
		}
	}
}
