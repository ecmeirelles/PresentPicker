package gifted;

/* Class that represents the person who will receive the gift */
public class Gifted {
	/* Gifted attributes: first name, last name, relationship, gender and age */
	private String firstNameGifted;
	private String lastNameGifted;
	private String relationshipGifted;
	private String genderGifted;
	private int ageGifted;
	
	/* Empty constructor */	
	public Gifted() {

	}
	
	/* Full constructor */
	public Gifted(String firstNameGifted, String lastNameGifted, String relationshipGifted, String genderGifted, int ageGifted) {

		this.firstNameGifted = firstNameGifted;
		this.lastNameGifted = lastNameGifted;
		this.relationshipGifted = relationshipGifted;
		this.genderGifted = genderGifted;
		this.ageGifted = ageGifted;
	}
	
	/* Constructor without firstNameGifted and lastNameGifted */
	public Gifted(String relationshipGifted, String genderGifted, int ageGifted) {

		this.relationshipGifted = relationshipGifted;
		this.genderGifted = genderGifted;
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
	
	public int getAgeGifted() {
		return ageGifted;
	}
	
	public void setAgeGifted(int ageGifted) {
		this.ageGifted = ageGifted;
	}
}
