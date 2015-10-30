package category;

/* Class that represents the outdoor interest */
public class Outdoor extends Product {
	/* Outdoor attribute: sizeProduct */
	private String sizeProduct;
	
	/* Empty constructor */
	public Outdoor() {
		
	}
	
	/* Full constructor, including those in the superclass Product */
	public Outdoor(String sizeProduct, String nameProduct, String descriptionProduct, String storeProduct, 
			String imageProduct, double priceProduct) {
		super(nameProduct, descriptionProduct, storeProduct, imageProduct, priceProduct);
		this.sizeProduct = sizeProduct;
	}

	/* Getters and Setter methods to access and to modify, respectively, the attributes */
	public String getSizeProduct() {
		return sizeProduct;
	}

	public void setSizeProduct(String sizeProduct) {
		this.sizeProduct = sizeProduct;
	}
}