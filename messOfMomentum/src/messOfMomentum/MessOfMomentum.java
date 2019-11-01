/*
 * Written by Bradley Grose
 */

package messOfMomentum;

import java.util.Scanner;

public class MessOfMomentum {

	
	public static final double LBSTOKG = 2.205; //Divisor for LBS to Kilograms
	public static final double MPHTOMPS = 2.237; //Divisor for MPH to M/S
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	
		//Prompt user and take input
		System.out.println("We are going to convert and find momentum and kinetic energy!");
		System.out.println("First enter the mass of the object (lbs)");
		double lbs = keyboard.nextDouble(); //Input Pounds of Object
		System.out.println("Enter the velocity of the object (mph)");
		double mph = keyboard.nextDouble(); //Import Speed MPH
		
		double kg = lbs / LBSTOKG; //Converts Imperial to Metric
		double mps = mph / MPHTOMPS;
		
		double momentum = kg * mps; //Solves Answer
		double kinetic = (momentum*momentum)/(2*kg);
		
		//Answer Output
		System.out.println("The momentum and potential energy for an object whose mass is "+lbs+" lbs");
		System.out.println("and is moving at "+mph+" is "+momentum+" kgm/s and "+kinetic+" J");

	}

}
