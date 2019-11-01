/*
 * Written by Bradley Grose
 */

public class StringHelper {
	
	//Checks for Repeated letters
	public static boolean hasAllUniqueCharacters(String aWord)
	{
		boolean result = true;
		
		System.out.println("Testing Has All Unique Characters with "+aWord);
		
		for(int i=0; i<aWord.length(); i++)
		{
			for(int j=i+1; j<aWord.length(); j++)
			{
				if(aWord.charAt(i) == aWord.charAt(j))
				{
					result = false;
				}
			}
		}
		
		return result;
	}
	
	public static String meshStrings(String word1, String word2)
	{
		String result = " ";
		
		System.out.println("Testing Mesh Strings with "+word1+" and "+word2);
		
		int length = word1.length() + word2.length();
		
		for(int i=0; i < length; i++)
		{
			if (i<word1.length())
				result += word1.charAt(i);
			if (i<word2.length())
				result += word2.charAt(i);
		}
		
		return result;
	}
	
	public static String replaceVowelsWithOodle(String aWord)
	{
		String result = "";
		
		System.out.println("Testing Replace Vowels with Oodle with "+aWord);
		
		//Checks each char
		for (int i = 0; i<aWord.length(); i++) 
		{
			char c = aWord.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
				result += "oodle";
			else 
				result += c;
		}
	
		return result;
	}
	
	//Replaces Vowels with oodle
	public static double weight(String aWord)
	{
		double result = 0;
		
		System.out.println("Testing Weight with "+aWord);
		
		//Checks each char
				for (int i = 0; i<aWord.length(); i++) 
				{
					char c = aWord.charAt(i);
					if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
						result += 2.5;
					else 
						result += 3.4;
				}
		return result;	
	}
}
