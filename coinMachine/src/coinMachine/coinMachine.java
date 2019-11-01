/*
 * Written by Bradley Grose
 */
package coinMachine;

import java.util.Scanner;

public class coinMachine {

	public static final int QUART = 25; //Divisor Values for Coins
	public static final int DIME = 10;
	public static final int NICKEL = 5;
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//User Input Value
		System.out.println("Enter a whole number between 1 and 99. The machine will determine a combination of coins.");
		int coins = keyboard.nextInt();
		System.out.println(coins+" cents in coins");
		
		//Calculations
		int quarters, dimes, nickels, pennies = 0; //Define the Values
		quarters = coins / QUART;
		coins = coins % QUART;
		
		dimes = coins / DIME;
		coins = coins % DIME;
		
		nickels = coins / NICKEL;
		pennies = coins % NICKEL;
		
		//Output
		System.out.println(quarters+" quarters");
		System.out.println(dimes+" dimes");
		System.out.println(nickels+" nickels");
		System.out.println(pennies+" pennies");
		
	}

}
