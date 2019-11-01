/*
 * Written by Jasmine Randolph
 * They are variables for types
 * You "implement" an interface
 * You cannot construct an interface IE cannot use "new"
 * Only construct classes that implement said interface
 */
public interface ShapeInterface {
	public int getOffeset();
	public void setOffset(int anOffset);
	public void drawHere();
	public void drawAt(int lineNumber);
}
