import java.util.Scanner;

//Brendan Caluneo
public class Homework06DresserFrontEnd {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Dresser Management System Pro");
		Homework06Dresser dresser = new Homework06Dresser();

		System.out.println("Enter 1: Add");
		System.out.println("Enter 2: Remove");
		System.out.println("Enter 3: Print contents");
		System.out.println("Enter 4: Quit");

		int choice = 0;
		int clothingType = 0;
		int clothingColor = 0;

		while ((choice = Integer.parseInt(keyboard.nextLine())) != 4) {
			switch (choice) {
			case 1:
				System.out.println("Enter a value (0-5) to designate the type.");
				System.out.println("Undergarment, socks, stockings, top, bottom, or cape.");
				clothingType = Integer.parseInt(keyboard.nextLine());

				System.out.println("Enter a value (0-7) to designate the color.");
				System.out.println("Brown, red, pink, orange, blue, green, purple, grey");
				clothingColor = Integer.parseInt(keyboard.nextLine());

				Homework06Clothing c = new Homework06Clothing(Homework06Clothing.Type.values()[clothingType], Homework06Clothing.Color.values()[clothingColor]);
				dresser.add(c);

				break;
			case 2:
				System.out.println("Enter a value (0-5) to designate the type.");
				System.out.println("Undergarment, socks, stockings, top, bottom, or cape.");
				clothingType = Integer.parseInt(keyboard.nextLine());

				System.out.println("Enter a value (0-7) to designate the color.");
				System.out.println("Brown, red, pink, orange, blue, green, purple, grey");
				clothingColor = Integer.parseInt(keyboard.nextLine());

				Homework06Clothing c0 = new Homework06Clothing(Homework06Clothing.Type.values()[clothingType], Homework06Clothing.Color.values()[clothingColor]);
				dresser.remove(c0);

				break;
			case 3:
				dresser.print();
				break;
			}
			
			System.out.println("Enter 1: Add");
			System.out.println("Enter 2: Remove");
			System.out.println("Enter 3: Print contents");
			System.out.println("Enter 4: Quit");

		}
	}
}