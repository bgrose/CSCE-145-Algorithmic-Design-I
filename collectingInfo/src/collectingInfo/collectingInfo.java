/*
*Written By Bradley Grose
*/
package collectingInfo;

import java.util.Scanner;

public class collectingInfo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//Questions for User and Storage
		System.out.println("Welcome to the Data Collection System");
			
		System.out.println("Enter your name");
		String name = keyboard.nextLine();
		
		System.out.println("Enter your age");
		int age = keyboard.nextInt();
		
		System.out.println("Enter your height in meters");
		double height = keyboard.nextDouble();
		
		keyboard.nextLine();//Fix Up
		
		System.out.println("Enter your blood type");
		String blood = keyboard.nextLine();
		
		System.out.println("Are you a cat person? (True or False)");
		Boolean cat = keyboard.nextBoolean();
		
		System.out.println("Are you a dog person? (True or False)");
		Boolean dog = keyboard.nextBoolean();
		
		System.out.println("Are you a reptilian shape shifter? (True or False)");
		Boolean shape = keyboard.nextBoolean();
		
		System.out.println("In kilograms, how much gold do you have buried on your property?");
		double gold = keyboard.nextDouble();
		
		//Output Data
		System.out.println("Name: "+name);
		System.out.println("Age: "+age+" years old");
		System.out.println("Height: "+height+"m");
		System.out.println("Blood Type: "+blood);
		System.out.println("Cat Person: "+cat);
		System.out.println("Dog Person: "+dog);
		System.out.println("Reptile Shape Shifter: "+shape);
		System.out.println("Amount of gold burried on land: "+gold+"kg"); 
		
		
	}

}
