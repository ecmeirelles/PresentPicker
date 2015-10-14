package category;

/* Class that represents the sports interest */
public class Sport extends Product {
	/* Sports attributes: equipment for and size */
	private String equipmentFor;
	private String sizeSport;
	
	/* Empty constructor */
	public Sport() {
		
	}
	
	/* Full constructor, including those in the superclass Products */
	public Sport (String equipmentFor, String sizeSport, String nameProduct, String descriptionProduct, 
			String storeProduct, float priceProduct) {
		super(nameProduct, descriptionProduct, storeProduct, priceProduct);
		this.equipmentFor = equipmentFor;
		this.sizeSport = sizeSport;
	}

	/* Getters and Setter methods to access and to modify, respectively, the attributes */
	public String getEquipmentFor() {
		return equipmentFor;
	}

	public void setEquipmentFor(String equipmentFor) {
		this.equipmentFor = equipmentFor;
	}
	
	public String getSizeSport() {
		return sizeSport;
	}

	public void setSizeSport(String sizeSport) {
		this.sizeSport = sizeSport;
	}
}
