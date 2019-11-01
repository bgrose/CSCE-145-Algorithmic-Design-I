/*
 * Written by Bradley Grose
 */

	import java.util.Scanner;
	
public class DateAndTimeTester {
	
	
	public void run() //Runs Function
	{
		String trigger = "";
		while(!trigger.equals("quit"))
		{
			
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid");
		String datetime = keyboard.nextLine();
		Boolean isValid = isValid(datetime); //Runs Check on Date
		
		if(isValid) //Prints out results
		{
			System.out.println("The date and time is valid!");
		}
		else
		{
			System.out.println("The date and time is not valid");
		}

		
		System.out.println("Would you like to exit? Type \"quit\" to exit or press [ENTER] to continue");
		trigger = keyboard.nextLine();
		}
		
		
		System.out.println("Good bye");
	}
	
	//Checks Date and Time Valid
	public boolean isValid(String datetime)
	{
		Boolean DateValid=isValidDate(datetime);
		Boolean TimeValid=isValidTime(datetime);
		boolean ret;
		
		if(DateValid&&TimeValid)
		{
			ret = true;
		}
		else
		{
			ret = false;
		}
		
		return ret;
	}
	
	public boolean isValidDate(String datetime)
	{
		boolean ret = false;
		int month = getMonth(datetime);
		int date = getDay(datetime);
		
		if(month>0&&month<13)
		{
			if(month==4||month==6||month==9||month==11)
			{
				if(date>0&&date<31)
				{
					ret = true;
				}
			}
			else if(month==2)
			{
				if(date>0&&date<29)
				{
					ret = true;
				}
			}
			else
			{
				if(date>0&&date<32)
				{
					ret = true;
				}
			}
		}
		
		return ret;
	}
	public boolean isValidTime(String datetime)
	{
		boolean ret = false;
		int hour = getHour(datetime);
		int minute = getMinute(datetime);
		
		if((hour>0&&hour<13)&&(minute>=0&&minute<60))
		{
			ret = true;
		}
		
		return ret;
	}
	public int getMonth(String datetime)
	{
		String monthstring = datetime.substring(0, 2);
		int month = Integer.parseInt(monthstring);
		return month;
	}
	public int getDay(String datetime)
	{
		String daystring = datetime.substring(3, 5);
		int day = Integer.parseInt(daystring);
		
		return day;
	}
	public int getHour(String datetime)
	{
		String daystring = datetime.substring(6, 8);
		int hour = Integer.parseInt(daystring);
		
		return hour;
	}
	public int getMinute(String datetime)
	{
		String daystring = datetime.substring(9, 11);
		int minute = Integer.parseInt(daystring);
		
		return minute;
	}


}
