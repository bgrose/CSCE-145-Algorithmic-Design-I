/*
 * Bradley Grose
 */
package testPractice;

import java.util.Scanner;

public class testPractice {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Give me a number");
		int size = keyboard.nextInt();
		int starcount = 1;
		int spacecount = size-1;
		boolean down = true;
		while(starcount != 0)
		{
			for(int i=0; i<spacecount; i++)
			{
				System.out.print(" ");
			}
			for(int i=0; i<starcount; i++)
			{
				System.out.print("* ");
			}
			System.out.println();
			if(starcount==size)
			{
				down = false;
			}
			if(down==true)
			{
				starcount++;
				spacecount--;
			}
			if(down==false)
			{
				starcount--;
				spacecount++;
			}
		}
		
	}

}
