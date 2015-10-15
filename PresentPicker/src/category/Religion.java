package category;

/* Class that represents the religion interest */
public class Religion extends Product {

	/* Religion attribute: size */
	private String sizeReligion;
	
	/* Empty constructor */
	public Religion() {
		
	}
	
	/* Full constructor, including those in the superclass Product */
	public Religion(String sizeReligion, String nameProduct, String descriptionProduct, String storeProduct, 
			String imageProduct, double priceProduct) {
		super(nameProduct, descriptionProduct, storeProduct, imageProduct, priceProduct);
		this.sizeReligion = sizeReligion;
	}

	/* Getters and Setter methods to access and to modify, respectively, the attributes */
	public String getSizeReligion() {
		return sizeReligion;
	}

	public void setSizeReligion(String sizeReligion) {
		this.sizeReligion = sizeReligion;
	}
}
