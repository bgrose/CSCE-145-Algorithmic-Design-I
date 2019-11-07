/*
 * Bradley Grose
 */
public interface Book {
	public String getName();
	public String getAuthor();
	public double getCallNumber();
	public void setName(String aName);
	public void setAuthor(String aAuthor);
	public void setCallNumber(double aCall);
	public boolean equals(Book aBook);
	public String toString();
	
}
