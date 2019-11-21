/*
 * Bradley Grose
 */

import java.util.*;
import java.io.*;

public class MovieDatabase {
	public final String DELIM = "\t";
	public static final int DBSIZE = 20;
	private Movie[] movieDB;
	
	public MovieDatabase()
	{
		this.movieDB = new Movie[DBSIZE];
	}
	
	//Add Movie
	public void addMovie(Movie aMovie)
	{
		for(int i=0; i<movieDB.length; i++)
		{
			if(movieDB[i] == null)
			{
				movieDB[i] = aMovie;
				break;
			}
			
		}
	}
	
	//Remove Movie
	public void removeMovie(String aName)
	{
		for(int i=0; i<movieDB.length; i++)
		{
			if(movieDB[i].getName().equals(aName))
			{
				movieDB[i] = null;
				break;
			}
		}
	}
	
	//Sort by Title
	public void sortTitle()
	{
		boolean unsort = true;
		
		while(unsort)
		{
			unsort = false;
		for(int i = 0; i<movieDB.length; i++)
		{
			for(int j=i+1; j<movieDB.length; j++)
			{
				if((movieDB[i] != null && movieDB[j] != null && (movieDB[i].getName()).compareTo(movieDB[j].getName())>0))
				{
					Movie temp = movieDB[i];
					movieDB[i] = movieDB[j];
					movieDB[j] = temp;
				}
			}
		}
		}
		print();
	}
	
	//Sort by Rating
	public void sortRating()
	{
		boolean unsort = true;
		Movie temp;
		
		//run the bubble sorting algorithm
		while (unsort)
		{
			unsort = false;
			for (int i = 0; i < movieDB.length; i++)
			{
				if (movieDB[i] != null && movieDB[i+1] != null && movieDB[i].getRating() > movieDB[i+1].getRating())
				{
					temp = movieDB[i];
					movieDB[i] = movieDB[i+1];
					movieDB[i +1] = temp;
					unsort = true;
				}
			}
		}
		print();
	}
	
	//Sort by Gross
	public void sortGross()
	{
		boolean unsort = true;
		Movie temp;
		
		//run the bubble sorting algorithm
		while (unsort)
		{
			unsort = false;
			for (int i = 0; i < movieDB.length; i++)
			{
				if (movieDB[i] != null && movieDB[i+1] != null && movieDB[i].getBoxGross() > movieDB[i+1].getBoxGross())
				{
					temp = movieDB[i];
					movieDB[i] = movieDB[i+1];
					movieDB[i +1] = temp;
					unsort = true;
				}
			}
		}
		print();
	}
	
	//Show by Director
	public void printByDirector(String aDir)
	{
		for (int i = 0; i < movieDB.length; i++)
		{
			if (movieDB[i] != null && movieDB[i].getDirector().equalsIgnoreCase(aDir))
			{
				System.out.println(movieDB[i].toString());
			}
		}
	}
	
	//Print Database
	public void toFile(String fileName)
	{
		try {
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(fileName));
			for (int i = 0; i < movieDB.length; i++)
			{
				if (movieDB[i] == null)
					break;
				fileWriter.println(movieDB[i].toString());
			}
			
			fileWriter.close();
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	//Read Database
	public void importFile(String fileName)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			while (fileScanner.hasNextLine())  //Runs til empty
			{
				
				String Line = fileScanner.nextLine();
				String[] split = Line.split(DELIM); //Makes array of elements
				if (split.length == 5) //Checks for all elements
				{
					String name = split[0];
					int year = Integer.parseInt(split[1]);
					int rating = Integer.parseInt(split[2]);
					String director = split[3];
					int boxGross = Integer.parseInt(split[4]);
					this.addMovie(new Movie(name, year, rating, director, boxGross));
				}
				else
				{
					System.out.println("File does not exist");
				}
			}
			
			fileScanner.close();
		}
		catch (FileNotFoundException e) {
			
			e.getStackTrace();
		}
		catch (Exception e)
		{
			e.getStackTrace();
		}
	}
	
	public void print()
	{
		for(int i=0; i<movieDB.length; i++)
		{
			System.out.println(movieDB[i].toString());
		}
	}

	
	
	
}
