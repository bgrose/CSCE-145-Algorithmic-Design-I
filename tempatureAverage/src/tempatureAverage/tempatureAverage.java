/*
 * Written By Bradley Grose
 */

package tempatureAverage;
import java.util.Scanner;

public class tempatureAverage {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int day = 0;
		double[] temp = new double[10];
		double sum = 0;
		
		//Take in input
		for(int i=0; i<10; i++)
		{
			System.out.println("Enter Tempature for Day "+(i+1));
			temp[i] = keyboard.nextDouble();
			sum += temp[i];
		}
		double average = sum/10;
		System.out.println("The Average Tempature was "+average);
		System.out.println("The Days Below the Average Tempature Are:");
		
		//Find days below
		for(int i=0; i<10; i++)
		{
			if(temp[i]<average)
			{
				System.out.println("Day "+(i+1)+" with "+temp[i]);
			}
		}

	}

}
