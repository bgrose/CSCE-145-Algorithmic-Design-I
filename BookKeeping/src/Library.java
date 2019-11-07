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
		Books = new Book[CLASSES][MAX_BOOKS];
	}
	
	//Other methods
	public static int classIndex(Book aBook)
	{
		int ret=0;
		double temp = aBook.getCallNumber();
		ret=(int)(temp/100); //Gets class
		return ret;
	}
	
	public void addBook(Book aBook)
	{
		
		int index = Library.classIndex(aBook);
		
		switch(index)
		{
		case 0:
			ComputerScienceBook comp = new ComputerScienceBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber());
			for(int i=0; i<MAX_BOOKS; i++)
			{
				if(Books[0][i] == null)
				{
					Books[0][i] = comp;
					break;
				}
			}
		case 1:
			PhilosophyBook Phil = new PhilosophyBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber());
			for(int i=0; i<MAX_BOOKS; i++)
			{
				if(Books[1][i] == null)
				{
					Books[1][i] = Phil;
					break;
				}
			}
			break;
		case 2:
			ReligionBook rel = new ReligionBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber());
			for(int i=0; i<MAX_BOOKS; i++)
			{
				if(Books[2][i] == null)
				{
					Books[2][i] = rel;
					break;
				}
			}
			break;
		case 3:
			SocialSciencesBook soc = new SocialSciencesBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber());
			for(int i=0; i<MAX_BOOKS; i++)
			{
				if(Books[3][i] == null)
				{
					Books[3][i] = soc;
					break;
				}
			}
			break;
		case 4:
			LanguageBook lang = new LanguageBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber());
			for(int i=0; i<MAX_BOOKS; i++)
			{
				if(Books[4][i] == null)
				{
					Books[4][i] = lang;
					break;
				}
			}
			break;
		case 5:
			ScienceBook sci = new ScienceBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber());
			for(int i=0; i<MAX_BOOKS; i++)
			{
				if(Books[5][i] == null)
				{
					Books[5][i] = sci;
					break;
				}
			}
			break;
		case 6:
			TechnologyBook tech = new TechnologyBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber());
			for(int i=0; i<MAX_BOOKS; i++)
			{
				if(Books[6][i] == null)
				{
					Books[6][i] = tech;
					break;
				}
			}
			break;
		case 7:
			ArtsBook arts = new ArtsBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber());
			for(int i=0; i<MAX_BOOKS; i++)
			{
				if(Books[7][i] == null)
				{
					Books[7][i] = arts;
					break;
				}
			}
			break;
		case 8:
			LiteratureBook lit = new LiteratureBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber());
			for(int i=0; i<MAX_BOOKS; i++)
			{
				if(Books[8][i] == null)
				{
					Books[8][i] = lit;
					break;
				}
			}
			break;
		case 9:
			HistoryBook hist = new HistoryBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber());
			for(int i=0; i<MAX_BOOKS; i++)
			{
				if(Books[0][i] == null)
				{
					Books[0][i] = hist;
					break;
				}
			}
			break;
		}
		
	}
	
	public void removeBook(Book aBook)
	{
		boolean removed = false;
				
		for(int i=0; i<Books.length; i++)
		{
			for(int j=0; j<MAX_BOOKS; j++)
			{
				if(aBook.equals(Books[i][j]))
				{
					Books[i][j] = null;
					removed = true;
					break;
				
				}
			}
			if(removed)
				break;
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
					System.out.println(Books[i][j].toString());
				}
			}
		}
	}
	
	public void printOption(int i)
	{
		switch(i)
		{
	case 0:
		System.out.println("Class 000 - Computer Science");
		break;
	case 1:
		System.out.println("Class 100 - Philosophy");
		break;
	case 2:
		System.out.println("Class 200 - Religion");
		break;
	case 3:
		System.out.println("Class 300 - Social Science");
		break;
	case 4:
		System.out.println("Class 400 - Language");
		break;
	case 5:
		System.out.println("Class 500 - Science");
		break;
	case 6:
		System.out.println("Class 600 - Technology");
		break;
	case 7:
		System.out.println("Class 700 - Arts");
		break;
	case 8:
		System.out.println("Class 800 - Literature");
		break;
	case 9:
		System.out.println("Class 900 - History");
		break;
		}
	}
	
}
