/*
 * BRadley Grose
 */



public class Library {
	
	
	
	private Book[][] Books;
	public static int CLASSES = 10;
	public static int MAX_BOOKS = 100;
	SimpleBook book = new SimpleBook();
	
	
	//Contructor
	public Library()
	{
		this.Books = new Book[CLASSES][MAX_BOOKS];
	}
	
	//Other methods
	public static int classIndex(Book aBook)
	{
		int ret=0;
		double temp = aBook.getCallNumber();
		ret=(int)(temp%100); //Gets class
		return ret;
	}
	
	public void addBook(Book aBook)
	{
		String aName, aAuthor;
		double aCall;
		
		aName = aBook.getName();
		aAuthor = aBook.getAuthor();
		aCall = aBook.getCallNumber();
		int index = classIndex(aBook);
		
		switch(index)
		{
		case 0:
			Books[0][getOpen(0)] = new ComputerScienceBook(aName, aAuthor, aCall);
			break;
		case 1:
			Books[1][getOpen(1)] = new PhilosophyBook(aName, aAuthor, aCall);
			break;
		case 2:
			Books[2][getOpen(2)] = new ReligionBook(aName, aAuthor, aCall);
			break;
		case 3:
			Books[3][getOpen(3)] = new SocialSciencesBook(aName, aAuthor, aCall);
			break;
		case 4:
			Books[4][getOpen(4)] = 	new LanguageBook(aName, aAuthor, aCall);
			break;
		case 5:
			Books[5][getOpen(5)] = new ScienceBook(aName, aAuthor, aCall);
			break;
		case 6:
			Books[6][getOpen(6)] = new TechnologyBook(aName, aAuthor, aCall);
			break;
		case 7:
			Books[7][getOpen(7)] = new ArtsBook(aName, aAuthor, aCall);
			break;
		case 8:
			Books[8][getOpen(8)] = new LiteratureBook(aName, aAuthor, aCall);
			break;
		case 9:
			Books[9][getOpen(9)] = new HistoryBook(aName, aAuthor, aCall);
			break;
		}
		
	}
	
	public void removeBook(Book aBook)
	{
		boolean removed = false;
				
		while(!removed)
		{
		for(int i=0; i<Books.length; i++)
		{
			for(int j=0; j<MAX_BOOKS; j++)
			{
				if(aBook.equals(Books[i][j]))
				{
					Books[i][j] = null;
					removed=true;
				}
			}
		}
		}
		
	}
	
	public void printBooks()
	{
		for(int i=0; i<Books.length; i++)
		{
			printOption(i);
			for(int j=0; j<MAX_BOOKS; j++)
			{
				if(Books[i][j]!=null)
				{
					System.out.println(book.toString(Books[i][j]));
				}
			}
		}
	}
	
	public void printOption(int i)
	{
		switch(i)
		{
	case 0:
		Book book = new ComputerScienceBook();
		book.toString();
		break;
	case 1:
		Book book1 = new PhilosophyBook();
		book1.toString();
		break;
	case 2:
		Book book2 = new ReligionBook();
		book2.toString();
		break;
	case 3:
		Book book3 = new SocialSciencesBook();
		book3.toString();
		break;
	case 4:
		Book book4 = new LanguageBook();
		book4.toString();
		break;
	case 5:
		Book book5 = new ScienceBook();
		book5.toString();
		break;
	case 6:
		Book book6 = new TechnologyBook();
		book6.toString();
		break;
	case 7:
		Book book7 = new ArtsBook();
		book7.toString();
		break;
	case 8:
		Book book8 = new LiteratureBook();
		book8.toString();
		break;
	case 9:
		Book book9 = new HistoryBook();
		book9.toString();
		break;
		}
	}
	
	public int getOpen(int aIndex)
	{
		int spot = -1;
		for(int i=0; i<MAX_BOOKS; i++)
		{
			if(Books[aIndex][i]==null)
			{
				spot = i;
				break;
			}
		}
		return spot;
	
	}
}
