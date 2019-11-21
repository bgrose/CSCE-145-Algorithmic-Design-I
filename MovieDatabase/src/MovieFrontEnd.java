/*
 * Bradley Grose
 */
import java.util.*;

public class MovieFrontEnd {

	public static void main(String[] args) {
		
		MovieDatabase movieDB = new MovieDatabase();
		Scanner keyboard = new Scanner(System.in);
		int answer = 0;
		
		//Instance Holders
		String name = "";
		int year = 0;
		int rating = 0;
		String director = "";
		int boxGross = 0;
		String filename = "";
		
		System.out.println("Welcome to the movie database.");
		
		while (answer != 9) //Quit Function
		{
			
			System.out.println("\nEnter 1 to add a movie\nEnter 2 to remove a movie\nEnter 3 to sort movies by title\n"
					+ "Enter 4 to sort movies by rating\nEnter 5 to sort movies by box office gross income\nEnter 6 to show movies by director\n"
					+ "Enter 7 to print the database to file\nEnter 8 to import from file\nEnter 9 to quit");
			answer = keyboard.nextInt();
			
			//Options
			switch (answer)
			{
				case 1:
					System.out.println("Enter the movie title");
					keyboard.nextLine(); //fix
					name = keyboard.nextLine();
					System.out.println("Enter the year it was released");
					year = keyboard.nextInt();
					System.out.println("Enter the rating from 1-5");
					rating = keyboard.nextInt();
					keyboard.nextLine(); //Fix up
					System.out.println("Enter the director of the movie");
					director = keyboard.nextLine();
					System.out.println("Enter the box office gross income");
					boxGross = keyboard.nextInt();
					movieDB.addMovie(new Movie(name, year, rating, director, boxGross));
					break;
				case 2:
					System.out.println("Enter the movie name you want to remove");
					keyboard.nextLine(); //Fix up
					name = keyboard.nextLine();
					movieDB.removeMovie(name);
					break;
				case 3:
					movieDB.sortTitle();
					break;
				case 4:
					movieDB.sortRating();
					break;
				case 5:
					movieDB.sortGross();
					break;
				case 6:
					keyboard.nextLine(); //Fix up
					System.out.println("Enter the director name");
					director = keyboard.nextLine();
					movieDB.printByDirector(director);
					break;
				case 7:
					movieDB.toFile("movies.txt");
					System.out.println("Finished writing to movies.txt");
					break;
				case 8:
					movieDB.importFile("movies.txt");
					System.out.println("Added movies from movies.txt");
					break;
				case 9:
					System.out.println("Goodbye.");
					break;
				default:
					System.out.println("Invalid response. Please only enter one of the choices.");
			}
		}
	}
		
}
