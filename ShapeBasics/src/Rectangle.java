
public class Rectangle extends ShapeBasics implements RectangleInterface{
	private int width, height;
	
	public Rectangle() {
		super();
		width = height = 1;
	}
	public Rectangle(int anOffset, int aW, int aH) {
		super(anOffset);
		this.set(aW, aH);
	}
	
	public void set(int aW, int aH) {
		if (aW > 0 && aH > 0) {
			this.width = aW;
			this.height = aH;
		}
	}
	// Override 
	public void drawHere() {
		
	}
}
