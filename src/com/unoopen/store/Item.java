package com.unoopen.store;

public class Item {

	private String itemName;
	private String description;
	private int price;

	public Item(String itemName, String description, int price) {
		super();
		this.itemName = itemName;
		this.description = description;
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", description=" + description + ", price=" + price + "]";
	}

}
