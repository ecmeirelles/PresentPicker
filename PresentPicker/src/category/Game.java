package category;

/* Class that represents the game interest */
public class Game extends Product {
	/* Game attribute: videoGameType */
	private String videoGameType;
	
	/* Empty constructor */
	public Game() {
		
	}
	
	/* Full constructor, including those in the superclass Product */
	public Game(String videoGameType, String nameProduct, String descriptionProduct, String storeProduct, 
			String imageProduct, double priceProduct) {
		super(nameProduct, descriptionProduct, storeProduct, imageProduct, priceProduct);
		this.videoGameType = videoGameType;
	}

	/* Getters and Setter methods to access and to modify, respectively, the attributes */
	public String getVideoGameType() {
		return videoGameType;
	}

	public void setVideoGameType(String videoGameType) {
		this.videoGameType = videoGameType;
	}
}
