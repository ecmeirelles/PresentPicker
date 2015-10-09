package gifted;

import java.util.ArrayList;

/* Class that represents the person who will receive the gift */
public class Gifted {
	/* Gifted attributes: first name, last name, relationship, gender, interests and age */
	private String firstNameGifted;
	private String lastNameGifted;
	private String relationshipGifted;
	private String genderGifted;
	private ArrayList<String> interestsGifted = new ArrayList<String>();
	private int ageGifted;
	
	/* Empty constructor */	
	public Gifted() {

	}
	
	/* Full constructor */
	public Gifted(String firstNameGifted, String lastNameGifted, String relationshipGifted, 
			String genderGifted, ArrayList<String> interestsGifted, int ageGifted) {

		this.firstNameGifted = firstNameGifted;
		this.lastNameGifted = lastNameGifted;
		this.relationshipGifted = relationshipGifted;
		this.genderGifted = genderGifted;
		this.interestsGifted = interestsGifted;
		this.ageGifted = ageGifted;
	}
	
	/* Constructor without firstNameGifted and lastNameGifted */
	public Gifted(String relationshipGifted, String genderGifted, ArrayList<String> interestsGifted, 
			int ageGifted) {

		this.relationshipGifted = relationshipGifted;
		this.genderGifted = genderGifted;
		this.interestsGifted = interestsGifted;
		this.ageGifted = ageGifted;
	}
	
	/* Getters and Setter methods to access and to modify, respectively, the attributes */
	public String getFirstNameGifted() {
		return firstNameGifted;
	}
	
	public void setFirstNameGifted(String firstNameGifted) {
		this.firstNameGifted = firstNameGifted;
	}
	
	public String getLastNameGifted() {
		return lastNameGifted;
	}
	
	public void setLastNameGifted(String lastNameGifted) {
		this.lastNameGifted = lastNameGifted;
	}
	
	public String getRelationshipGifted() {
		return relationshipGifted;
	}
	
	public void setRelationshipGifted(String relationshipGifted) {
		this.relationshipGifted = relationshipGifted;
	}
	
	public String getGenderGifted() {
		return genderGifted;
	}
	
	public void setGenderGifted(String genderGifted) {
		this.genderGifted = genderGifted;
	}
	
	public ArrayList<String> getInterestsGifted() {
		return interestsGifted;
	}
	
	public void setInterestsGifted(ArrayList<String> interestsGifted) {
		this.interestsGifted = interestsGifted;
	}
	
	public int getAgeGifted() {
		return ageGifted;
	}
	
	public void setAgeGifted(int ageGifted) {
		this.ageGifted = ageGifted;
	}
	
	/* Method to add a new element to interestsGifted */
	public void addInterest(String interestCategory) {
		interestsGifted.add(interestCategory);
	}
	
	/* Method to remove an element from interestsGifted */
	public void removeInterest(String interestCategory) {
		interestsGifted.remove(interestCategory);
	}
}
