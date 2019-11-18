/*
 * Bradley Grose
 */

import java.util.*;
import java.io.*;

public class VowelCounter {

	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String fileName = "file1.txt";
		
		System.out.println("Enter a file name and I will say how many times AEIOU appears in order");
		fileName = keyboard.nextLine();
		
		int vowelCount = getVowelCount(fileName);
		System.out.println("The file "+fileName+" has AEIOU in order "+vowelCount+" times.");
	}


	public static int getVowelCount(String aName)
	{
	//Variables
		int ret = 0;
		Scanner fileReader;
		String word = "";
		String vowels = "aeiou";
		String VowelsOnly = "";
		
		try
		{
			fileReader = new Scanner(new File(aName));
			while(fileReader.hasNext()) //Runs til done
			{
				word = fileReader.next().toLowerCase(); //gets ride of capitilization
				word = word.replaceAll(" ", ""); //Removes the spaces
				
				
				for(int i=0; i<word.length(); i++)
				{
					if (word.charAt(i)=='a'|| word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u')
						VowelsOnly += word.charAt(i);
				}
				
				if(VowelsOnly.contains(vowels)) //finds aeiou
				{
					ret += 1;
					VowelsOnly = VowelsOnly.replace(vowels,  "");
				}
			}
			
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return ret;
	}
}
