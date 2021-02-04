@SuppressWarnings("all")

public class ShapeBasics implements ShapeInterface{
	private int offset;
	
	public ShapeBasics() {
		this.offset = 0;
	}
	public ShapeBasics(int anOffset) {
		this.setOffset(anOffset);
	}
	
	public int getOffeset() {
		return this.offset;
	}
	public void setOffset(int anOffset) {
		if (anOffset >= 0)
		{
			this.offset = anOffset;
		}
	}
	public void drawHere() { // Draws the shape
		for (int i = 0; i < offset; i++)
			System.out.print(" "); // Don't need curly braces for one line
		System.out.println("*");
	}
	public void drawAt(int lineNumber) {
		for (int i = 0; i < lineNumber; i++)
			System.out.println();
		drawHere();
	}
}
