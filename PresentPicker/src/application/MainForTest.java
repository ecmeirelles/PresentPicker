package application;

import gifted.Gifted;

/* Class used for methods tests */
public class MainForTest {

	public static void main(String[] args) {
		/* --------------------------------- Gifted.java ------------------------------------------- */
		Gifted person = new Gifted();
		
		/* Test using set method in all the attributes, except interestsGifted */
		person.setFirstNameGifted("Katie");
		person.setLastNameGifted("Fritz");
		person.setGenderGifted("Female");
		person.setRelationshipGifted("Friend");
		person.setAgeGifted(23);
		
		/* Test using addInterest method */
		person.addInterest("Books/Movies");
		person.addInterest("Religion");
		person.addInterest("Fitness");
		
		/* Test using get method in all attributes */
		System.out.println("Name: " + person.getFirstNameGifted() + " " + person.getLastNameGifted());
		System.out.println("Gender: " + person.getGenderGifted());
		System.out.println("Relationship: " + person.getRelationshipGifted());
		System.out.println("Age: " + person.getAgeGifted());
		System.out.println("Interests (before): " + person.getInterestsGifted());
		
		/* Test using removeInterest method */
		person.removeInterest("Religion");
		System.out.println("Interests (after): " + person.getInterestsGifted());	
	}
}
