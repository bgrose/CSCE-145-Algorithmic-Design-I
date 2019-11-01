/*
 * Written By Bradley Grose
 */

import java.util.Scanner;

public class BinaryChanger {
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//User Input
		System.out.println("Enter a 4-bit Binary Number");
		int Binary1 = keyboard.nextInt();
		System.out.println("Enter another 4-bit Binary Number");
		int Binary2 = keyboard.nextInt();
		int num1 = 0, num2 = 0, finalbin = 0;

	if((Binary1<=1111)&&(Binary2<=1111))
	{
		//Convert Binary1
		if (Binary1/1000 == 1)
		{
			num1 += 8;
		}
		Binary1 = Binary1 % 1000;
		if (Binary1/100 == 1)
		{
			num1 += 4;
		}
		Binary1 = Binary1 % 100;
		if (Binary1/10 == 1)
		{
			num1 += 2;
		}
		Binary1 = Binary1 % 10;
		if (Binary1 == 1)
		{
			num1 += 1;
		}
	
		//Convert Binary2
		if (Binary2/1000 == 1)
		{
			num2 += 8;
		}
		Binary2 = Binary2 % 1000;
		if (Binary2/100 == 1)
		{
			num2 += 4;
		}
		Binary2 = Binary2 % 100;
		if (Binary2/10 == 1)
		{
			num2 += 2;
		}
		Binary2 = Binary2 % 10;
		if (Binary2 == 1)
		{
			num2 += 1;
		}
		
		//Side Calculations
		int sum = num1+ num2;
		int sumdummy = sum;
		
		//Convert Sum to Binary
		if (sumdummy/8 == 1)
		{
			finalbin += 1000;
			sumdummy -= 8;
		}
		if (sumdummy/4 == 1)
		{
			finalbin += 100;
			sumdummy -= 4;
		}
		if (sumdummy/2 == 1)
		{
			finalbin += 10;
			sumdummy -= 2;
		}
		if (sumdummy/1 == 1)
		{
			finalbin += 1;
		}
		
		System.out.println("The first number is "+num1);
		System.out.println("The second number is "+num2);
		System.out.println("Added together they are "+sum);
		System.out.println("Which in Binary is "+finalbin);
	}
	else
	{
		System.out.println("Sorry I cant solve that");
		System.exit(0);
	}
	}

}
