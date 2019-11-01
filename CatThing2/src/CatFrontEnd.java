
public class CatFrontEnd {

	public static void main(String[] args) {
		Cat cat01;
		Cat cat02; //Declaring an instance of type cat
		
		cat01 = new Cat(); //Call to default constructor
		cat02 = new Cat("Mr. Fliufferkins",10.0,4);
		/*
		System.out.println(cat01.getName());
		cat01.setName("Triscut");
		System.out.println(cat01.getName());
		System.out.println(cat02.getName());
		
		System.out.println(cat01);
		*/
		
		cat01 = new Cat("Mr. Fliufferkins",10.0,4);
		System.out.println(cat01);
		System.out.println(cat02);
		System.out.println(cat01 == cat02);
		System.out.println(cat01.equals(cat02));
		
		cat01 = cat02;
		cat02.setName("rusty");
		System.out.println(cat01.getName());
	}
}
	