

public class Item {
	
	
	public Item(String itemName, String description, String storeDetails, int price) {
		super();
		ItemName = itemName;
		Description = description;
		StoreDetails = storeDetails;
		this.price = price;
	}

	private  String ItemName,Description,StoreDetails;
	private  int price;
	
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getStoreDetails() {
		return StoreDetails;
	}
	public void setStoreDetails(String storeDetails) {
		StoreDetails = storeDetails;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Item [ItemName=" + ItemName + ", Description=" + Description + ", StoreDetails=" + StoreDetails
				+ ", price=" + price + "]";
	}
	
	//Getters
	
}
