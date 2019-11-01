
public class FrontEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeInterface[] shapes = new ShapeInterface[3];
		
		// Cannot use "new" on interface
		// shapes[0] = new ShapeInterface();
		shapes[0] = new ShapeBasics();
		shapes[1] = new Rectangle();
	}

}
