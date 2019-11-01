//Brendan Caluneo
public class Homework06Clothing {

	static enum Type {
		UNDERGARMENT, SOCKS, STOCKINGS, TOP, BOTTOM, CAPE;
	}

	static enum Color {
		BROWN, RED, PINK, ORANGE, GREEN, BLUE, PURPLE, GREY;
	}

	private Type type;
	private Color color;

	public Homework06Clothing() {
		setType(Type.SOCKS);
		setColor(Color.ORANGE);
	}
	
	public Homework06Clothing(Type type, Color color) {
		setType(type);
		setColor(color);
	}

	public Type getType() {
		return this.type;
	}

	public Color getColor() {
		return this.color;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String toString() {
		return "Type: " + getType() + "\nColor: " + getColor();
	}

	public boolean equals(Homework06Clothing c) {
		return c != null && c.getType() == getType() && c.getColor() == getColor();
	}
}