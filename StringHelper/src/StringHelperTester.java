/*
 * Written by Bradley Grose
 */

public class StringHelperTester {

	public static void main(String[] args) {
		System.out.println("Welcome to the String Helper Tester!\n");
		
		//Test Uniqueness
		System.out.println(StringHelper.hasAllUniqueCharacters("facetiously"));
		System.out.println(StringHelper.hasAllUniqueCharacters("banana"));
		
		//Spacer
		System.out.println();
		
		//Mesh Words
		System.out.println(StringHelper.meshStrings("harp", "fiddle"));
		
		//Spacer
		System.out.println();
		
		//Replace Vowels
		System.out.println(StringHelper.replaceVowelsWithOodle("burrito"));
		
		//Spacer
		System.out.println();
		
		//Weight 1
		System.out.println(StringHelper.weight("heavy"));
		//Weight 2
		System.out.println(StringHelper.weight("light"));


	}

}
