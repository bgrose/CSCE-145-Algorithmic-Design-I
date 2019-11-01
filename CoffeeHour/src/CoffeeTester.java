/*
 * Written By Bradley Grose
 */

import java.util.Scanner;

public class CoffeeTester {

	public static void main(String[] args) {
		
		System.out.println("Let’s Coffee!!!1!11!!ONE!!!1!\n");
		
		String name;
		int content;
		Coffee coffee01 = new Coffee();
		Coffee coffee02 = new Coffee();
		
		//Coffee 01
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What’s the name of the first coffee?");
		name = keyboard.nextLine();
		coffee01.setName(name);
		System.out.println("What’s the caffeine content?");
		content = keyboard.nextInt();
		coffee01.setContent(content);
		coffee01.setRiskyAmount(content);
		
		System.out.println();
		
		//Coffee 02
		System.out.println("What’s the name of the second coffee?");
		keyboard.nextLine();
		name = keyboard.nextLine();
		coffee02.setName(name);
		System.out.println("What’s the caffeine content?");
		content = keyboard.nextInt();
		coffee02.setContent(content);
		coffee02.setRiskyAmount(content);
		
		System.out.println(coffee01);
		System.out.println(coffee02);
		
	}
	
}