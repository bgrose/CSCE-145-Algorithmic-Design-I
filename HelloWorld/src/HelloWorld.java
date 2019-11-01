/*
 * Written by Bradley Grose
 */

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		System.out.println("What is your name?"); //Intake Name of User
		Scanner keyboard = new Scanner(System.in); 
		String name = keyboard.nextLine();
		System.out.println("Greetings! " + name);
		
		System.out.println("How many cats do you own?"); //Intake # of Cats
		int numberOfCats = keyboard.nextInt();
		System.out.println("How does one live with " + numberOfCats + " cats?");
	}

}
