/*
 * Written by Bradley Grose
 */

package dateCheck;
import java.util.Scanner;

public class dateCheck {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//User Input
		System.out.println("Enter a date in the format month/day/year");
		String date = keyboard.nextLine();
		
		//String Seperation
		int slashlocation = date.indexOf("/");
		String monthstring = date.substring(0, slashlocation);
		int month = Integer.parseInt(monthstring);
		
		String remainderdate = date.substring(slashlocation+1);
		slashlocation = remainderdate.indexOf("/");	
		String daystring = remainderdate.substring(0, slashlocation);
		int day = Integer.parseInt(daystring);
		
		String yearstring = remainderdate.substring(slashlocation+1);
		int year = Integer.parseInt(yearstring);
		
		//Date Check
		if((month < 1) || (month > 12))
		{
			System.out.println(date+ " is an invalid date");
		}
		else if((day>0) && (day<=31))
		{
			if(month == 2)
			{
				if (year%4==0 && year%100!=0 || year %400==0)
				{
					if((day>0) && (day<=29))
					{
					System.out.println(date+" is a valid date!");
					}
					else
					{
					System.out.println(date+ " is an invalid date. Must be between 1 and 29");
					}
				}
				else
				{
					if((day>0) && (day<=28))
					{
					System.out.println(date+" is a valid date!");
					}
					else
					{
					System.out.println(date+ " is an invalid date. Must be between 1 and 28");
					}
				}
			}
			else if ((month == 4) || (month ==6) ||(month == 9) || (month == 11))
			{
				if((day>0) && (day<=30))
				{
				System.out.println(date+" is a valid date!");
				}
				else
				{
				System.out.println(date+ " is an invalid date. Must be between 1 and 30");
				}
			}
			else
			{
				System.out.println(date+" is a valid date!");
			}
		}
		else
		{
			System.out.println(date+ " is an invalid date. All months have 31 or less days");
		}
	}

}
