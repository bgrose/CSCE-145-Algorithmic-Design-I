/*
 * Written By Bradley Grose
 */

import java.util.Scanner;

public class AnimalFrontEnd {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int answer = 0;
		
		AnimalCollection AnimalCollection = new AnimalCollection();
		
		//Default Storing
		String name;
		String aTempMood, aTempType;
		double weight;
		int energyLevel;
		mood aMood;
		type aType;
		String catType;
		int Spots;
		String lead;
		
		
		while(answer!=3)
		{
			
			new AnimalCollection();
			
			System.out.println("Would you like to\n" + 
					"1. Add a cat or dog\n" + 
					"2. Remove a cat or dog\n" +  
					"3. Quit\n" + 
					"Enter a selection");
			answer = keyboard.nextInt();
		
			
			switch(answer)
			{
			case 1: //Add an Animal
				int choice2 = 0;
				System.out.println("Options:\n1. House Cat\n2. Leopard\n3. Domestic Dog\n4. Wolf");
				choice2 = keyboard.nextInt();
				keyboard.nextLine();//Fix Up
				
				switch(choice2)
				{
				case 1: //House Cat
					System.out.println("Enter the house cats name, weight, mood, and Type.");
					name = keyboard.nextLine();
					weight = Double.parseDouble(keyboard.nextLine());
					aTempMood = keyboard.nextLine();
					aTempMood = aTempMood.toLowerCase();
					aMood = mood.valueOf(aTempMood);
					catType= keyboard.nextLine();
					AnimalCollection.addAnimal(new HouseCat(name, weight, aMood, catType));
			
					
					break;
				case 2: //Leopard
					System.out.println("Enter the leopard's name, weight, mood, and number of spots.");
					name = keyboard.nextLine();
					weight = Double.parseDouble(keyboard.nextLine());
					aTempMood = keyboard.nextLine();
					aTempMood = aTempMood.toLowerCase();
					aMood = mood.valueOf(aTempMood);
					Spots = keyboard.nextInt();
					AnimalCollection.addAnimal(new Leopard(name, weight, aMood, Spots));
					
					break;
				case 3: //Dog
					System.out.println("Enter the domestic dog's name, weight, energy level, and type.");
					name = keyboard.nextLine();
					weight = Double.parseDouble(keyboard.nextLine());
					energyLevel = keyboard.nextInt();
					keyboard.nextLine();//Fix Up
					aTempType = keyboard.nextLine();
					aTempMood = aTempType.toLowerCase();
					aType = type.valueOf(aTempType);
					AnimalCollection.addAnimal(new DomesticDog(name, weight, energyLevel, aType));
					
					break;
				case 4: //Wolf
					System.out.println("Enter the wolf's name, weight, energy level, and pack leader name.");
					name = keyboard.nextLine();
					weight = Double.parseDouble(keyboard.nextLine());
					energyLevel = keyboard.nextInt();
					keyboard.nextLine();//Fix Up
					lead = keyboard.nextLine();
					AnimalCollection.addAnimal(new Wolf(name, weight, energyLevel, lead));
					break;
				}
				
				break;
			case 2:
				System.out.println("Enter the name of the animal to be removed.");
				String animalName = keyboard.nextLine();
				keyboard.nextLine();//Fix Up

				AnimalCollection.removeAnimal(animalName);
				
				break;
			}
			
			
				System.out.println("Current Collection: ");
				for (Animal animal : AnimalCollection.getAnimals()) {
					if (animal != null) {
						System.out.println(animal.toString());
					}
				}
			

		}
		
		System.exit(0);

	}

}
