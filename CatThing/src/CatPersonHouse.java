
public class CatPersonHouse {

	public static void main(String[] args) {
		Cat cat01;
		Cat cat02;
		
		cat01 = new Cat(); //Call Constructor
		cat02 = new Cat("Mr Fluff", 10.0, 4);
		
		cat01.setName("Triscut");
		cat01.setWeight(15.0);
		cat01.setNumOfLegs(3);
		
		System.out.println(cat01.getName());
		System.out.println(cat02.getName());
		
		System.out.println(cat01);
		
		cat01.setName("Mr. Fluffer");
		cat01.setWeight(10.0);
		cat01.setNumOfLegs(4);
		
		System.out.println(cat01 == cat02);
		System.out.println(cat01 == cat02);
	}
}
