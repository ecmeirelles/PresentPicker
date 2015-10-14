package category;

/* Class that represents the products which is in the categories */
public class Product {
	/* Product attributes: name, description, store and price */
	private String nameProduct;
	private String descriptionProduct;
	private String storeProduct;
	private float priceProduct;
	
	/* Empty constructor */
	public Product() {

	}

	/* Full constructor */
	public Product(String nameProduct, String descriptionProduct, String storeProduct, float priceProduct) {
		super();
		this.nameProduct = nameProduct;
		this.descriptionProduct = descriptionProduct;
		this.storeProduct = storeProduct;
		this.priceProduct = priceProduct;
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

	public float getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(float priceProduct) {
		this.priceProduct = priceProduct;
	}
}
