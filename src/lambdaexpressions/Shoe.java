package lambdaexpressions;

public class Shoe {
	
	boolean branded;
	String retailPrice;
	
	
	
	public Shoe(boolean branded, String retailPrice) {
		super();
		this.branded = branded;
		this.retailPrice = retailPrice;
	}

	public void setBranded(boolean branded) {
		this.branded = branded;
	}
	
	public void setRetailPrice(String retailPrice) {
		this.retailPrice = retailPrice;
	}
	
	public boolean isBranded() {
		return branded;
	}
	
	public String getRetailPrice() {
		return retailPrice;
	}
	
}
