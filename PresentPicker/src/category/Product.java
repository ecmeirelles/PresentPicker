package category;

/* Class that represents the products which is in the categories */
public class Product {
	/* Product attributes: name, description, store, image and price */
	protected String nameProduct;
	protected String urlProduct;
	protected String storeProduct;
	protected String imageProduct;
	protected double priceProduct;
	
	/* Empty constructor */
	public Product() {

	}

	/* Full constructor */
	public Product(String nameProduct, String urlProduct, String storeProduct, String imageProduct, 
			double priceProduct) {
		this.nameProduct = nameProduct;
		this.urlProduct = urlProduct;
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

	public String getUrlProduct() {
		return urlProduct;
	}

	public void setUrlProduct(String urlProduct) {
		this.urlProduct = urlProduct;
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

	public double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(double priceProduct) {
		this.priceProduct = priceProduct;
	}
}
