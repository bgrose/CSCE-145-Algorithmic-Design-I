//Brendan Caluneo
public class Homework06Dresser {

	private Homework06Clothing[][] clothes;

	public Homework06Dresser() {
		clothes = new Homework06Clothing[5][10];
	}

	public void add(Homework06Clothing c) {
		for (int i = 0; i < clothes[c.getType().ordinal()].length; i++) {
			if (clothes[0][i] == null) {
				System.out.println("Added a piece of clothing of type " + c.getType() + " that is " + c.getColor() + " in color.");
				clothes[0][i] = c;
				return;
			}
		}

		System.out.println("This drawer is full.");
	}

	public void remove(Homework06Clothing c) {
		for (int i = 0; i < clothes[c.getType().ordinal()].length; i++) {
			if (clothes[0][i] == null) continue;

			if (clothes[0][i].equals(c)) {
				System.out.println("Removed a piece of clothing of type " + c.getType() + " that is " + c.getColor() + " in color.");
				clothes[0][i] = null;
			}
		}
	}

	public void print() {
		for (int i = 0; i < clothes.length; i++) {
			System.out.println("Drawer " + Homework06Clothing.Type.values()[i]);
			for (int j = 0; j < clothes[i].length; j++) {
				if (clothes[i][j] != null) System.out.println(clothes[i][j].getType() + " " + clothes[i][j].getColor());
			}
		}
	}

}