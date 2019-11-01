
public class PetTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Two Instances of type pet
		Pet pet01;
		Pet pet02; //null
		
		pet01 = new Pet();
		pet02 = new Pet();
		Pet pet03 = Pet.createPet(PetType.abomination);
		greeting();
	}
	public static void greeting()
	{
		System.out.println("Hello Worlds!");
	}

}
