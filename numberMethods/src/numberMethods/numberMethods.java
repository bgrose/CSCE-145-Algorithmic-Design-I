/*
 * Written by Bradley Grose
 */

package numberMethods;

import java.util.Scanner;

public class numberMethods {


	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		//User Input
		System.out.println("Enter a 4 digit number");
		String number = keyboard.nextLine();
		
	
		//User Output
		
		//Number Squared
		System.out.println("The Number Squared is:\n"+number);
		System.out.println(number.charAt(1)+"  "+number.charAt(2));
		System.out.println(number.charAt(2)+"  "+number.charAt(1));
		System.out.println(""+number.charAt(3)+number.charAt(2)+number.charAt(1)+number.charAt(0));
		
		//Number Counter Clockwise
		System.out.println("The number squared rotated counterclockwise one space is");
		System.out.println(""+number.charAt(1)+number.charAt(2)+number.charAt(3)+number.charAt(2));
		System.out.println(number.charAt(0)+"  "+number.charAt(1));
		System.out.println(number.charAt(1)+"  "+number.charAt(0));
		System.out.println(""+number.charAt(2)+number.charAt(3)+number.charAt(2)+number.charAt(1));
	
		//Number Counter Clockwise
		System.out.println("The number squared rotated counterclockwise one space is");
		System.out.println(""+number.charAt(2)+number.charAt(3)+number.charAt(4)+number.charAt(1));
		System.out.println(number.charAt(1)+"  "+number.charAt(0));
		System.out.println(number.charAt(0)+"  "+number.charAt(1));
		System.out.println(""+number.charAt(1)+number.charAt(2)+number.charAt(3)+number.charAt(2));
	}

}
