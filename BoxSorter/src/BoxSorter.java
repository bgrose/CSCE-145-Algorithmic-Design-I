/*
 * Written by Bradley Grose
 */
import java.util.Scanner;

public class BoxSorter {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the box sorter! Enter the information about boxes and I'll sort them!");
		
		//Build Array
		Box[] boxes = new Box[5];
		for(int i=0; i<boxes.length; i++)
		{
			boxes[i] = new Box();
		}
		
		//Fill Box
		for(int i=0; i<boxes.length; i++)
		{
			System.out.println("Enter the label, length, width, and height (all feet) for box " + (i + 1));
			boxes[i].setLabel(keyboard.nextLine());
			boxes[i].setLength(Double.parseDouble(keyboard.nextLine()));
			boxes[i].setWidth(Double.parseDouble(keyboard.nextLine()));
			boxes[i].setHeight(Double.parseDouble(keyboard.nextLine()));
		}
		
		//Sort Boxes
		for(int i=0; i<boxes.length; i++)
		{
			for(int j=i+1; j<boxes.length; j++)
			{
				Box tempBox = null;
				
				if (boxes[i].getVolume() > boxes[j].getVolume()) {
					tempBox = boxes[i];
					boxes[i] = boxes[j];
					boxes[j] = tempBox;
				}
			}
		}
		System.out.println("Sorted List:");

		for (Box b : boxes) 
		{
			System.out.println("Label: " + b.getLabel() + " Volume: " + b.getVolume());
		}
	}

}
