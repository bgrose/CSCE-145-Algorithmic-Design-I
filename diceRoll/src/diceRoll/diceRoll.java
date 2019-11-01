/*
 * Written by Bradley Grose
 */

package diceRoll;
import java.util.Scanner;
import java.util.Random;


public class diceRoll {

	public static final int UPPERDICE = 6; //Sets random Max
			
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, count = 0; //Dice Counts
	
	System.out.println("Enter the number of times a 6 sided die should be rolled");
	int times = keyboard.nextInt();
	
	do { //Run Dice Rolls
	Random r = new Random();
	int diceValue = r.nextInt(UPPERDICE)+1; //gives random value 1-6
	System.out.println(diceValue+" was rolled");
	
	//Count for each number
	if (diceValue == 1)
	{
	one++;	
	}
	else if (diceValue == 2)
	{
	two++;	
	}
	else if (diceValue == 3)
	{
	three++;	
	}
	else if (diceValue == 4)
	{
	four++;	
	}
	else if (diceValue == 5)
	{
	five++;	
	}
	else if (diceValue == 6)
	{
	six++;	
	}
	
	count ++;
	}while(count<times); //Tells when to end
	
//End Display
	System.out.println("One: "+one);
	System.out.println("Two: "+two);
	System.out.println("Three: "+three);
	System.out.println("Four: "+four);
	System.out.println("Five: "+five);
	System.out.println("Six: "+six);
	
	}

}
