/*
 * Written By bradley Grose
 */

	
public class AppleTester {

	public static void main(String[] args) {
			//Creates the default Apple
				Apple apple01 = new Apple();
				System.out.println(apple01.toString());
				System.out.println();
				
				//Creates a Proper Apple
				Apple apple02 = new Apple("Granny Smith", 0.75, 0.99);
				System.out.println(apple02.toString());
				System.out.println();
				
				//Creates a False Apple
				Apple apple03 = new Apple("iPad", 2.5, -200);
				System.out.println(apple03.toString());
	}
	
	
}


