
/*
 * Written by Bradley Grose
 */
import java.util.Scanner;

public class CoffeeTester {

	public static void main(String[] args) {
				Scanner keyboard = new Scanner(System.in);

				//Creates two coffeecups
				Coffee coffee01 = new Coffee();
				Coffee coffee02 = new Coffee();
				
				//Sets coffee01 Name
				System.out.println("What’s the name of the first coffee?");
				String aName = keyboard.nextLine();
				coffee01.setName(aName);
				
				//Sets coffee02 Name
				System.out.println("What’s the caffeine content?");
				int aCaffAmt = keyboard.nextInt();
				coffee01.setCaffContent(aCaffAmt);
				keyboard.nextLine();
				
				//Second Cup name
				System.out.println("What’s the name of the second coffee?");
				String aName2 = keyboard.nextLine();
				coffee02.setName(aName2);
						
				//Second Cup Caffeine
				System.out.println("What’s the caffeine content?");
				int aCaffAmt2 = keyboard.nextInt();
				coffee02.setCaffContent(aCaffAmt2);

				//Prints the Results
				System.out.println(coffee01.RiskyAmount());
				System.out.println(coffee02.RiskyAmount());
				
				
			}

}
