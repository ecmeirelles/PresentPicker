package category;

/* Class that represents the products which is in the categories */
public class Product {
	/* Product attributes: name, description, store, image and price */
	protected String nameProduct;
	protected String descriptionProduct;
	protected String storeProduct;
	protected String imageProduct;
	protected float priceProduct;
	
	/* Empty constructor */
	public Product() {

	}

	/* Full constructor */
	public Product(String nameProduct, String descriptionProduct, String storeProduct, String imageProduct, 
			float priceProduct) {
		this.nameProduct = nameProduct;
		this.descriptionProduct = descriptionProduct;
		this.storeProduct = storeProduct;
		this.priceProduct = priceProduct;
		this.imageProduct = imageProduct;
	}

	/* Getters and Setter methods to access and to modify, respectively, the attributes */
	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public String getDescriptionProduct() {
		return descriptionProduct;
	}

	public void setDescriptionProduct(String descriptionProduct) {
		this.descriptionProduct = descriptionProduct;
	}

	public String getStoreProduct() {
		return storeProduct;
	}

	public void setStoreProduct(String storeProduct) {
		this.storeProduct = storeProduct;
	}
	
	public String getImageProduct() {
		return imageProduct;
	}

	public void setImageProduct(String imageProduct) {
		this.imageProduct = imageProduct;
	}

	public float getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(float priceProduct) {
		this.priceProduct = priceProduct;
	}
}
