package category;

/* Class that represents the kids interest */
public class Kid extends Product {
	/* Kid attribute: ageToy */
	private int ageToy;
	
	/* Empty constructor */
	public Kid() {
		
	}
	
	/* Full constructor, including those in the superclass Product */
	public Kid(int ageToy, String nameProduct, String descriptionProduct, String storeProduct, 
			String imageProduct, double priceProduct) {
		super(nameProduct, descriptionProduct, storeProduct, imageProduct, priceProduct);
		this.ageToy = ageToy;
	}

	/* Getters and Setter methods to access and to modify, respectively, the attributes */
	public int getAgeToy() {
		return ageToy;
	}

	public void setAgeToy(int ageToy) {
		this.ageToy = ageToy;
	}
}
