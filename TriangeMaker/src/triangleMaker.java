/*
 * Written By Bradley Grose
 */

import java.util.Scanner;

public class triangleMaker {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt and Size Question
		System.out.println("Welcome to Triangle Maker!  Enter the size of the triangle.");
		int size = keyboard.nextInt();
		
		//Check for Wrong Number
		System.out.println();
		if(size <= 0)
		{
			System.out.println("Wrong dim");
			System.exit(0);
		}
		else
		{
		//Draw Triange
		boolean direction =true; //Sets count out or count in
		int starCount=1;
		for(int i = 0; i < size*2; i++) //Vertical Part
		{
			
			if(i ==(size-1))
			{
				direction=false;
			}
			for(int j = 0; j < starCount; j++) //Horizontal Part
			{
				System.out.print("*"); //Stays same line
			}
			System.out.println("");
			if(direction) //Run Direction
			{
				starCount++;
			}
			else
			{
				starCount--;
			}
		}
		System.out.println("DONE!");
		}
	}

}
