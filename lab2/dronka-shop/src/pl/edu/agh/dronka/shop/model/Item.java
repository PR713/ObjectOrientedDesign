package pl.edu.agh.dronka.shop.model;

import java.util.Map;

public class Item {

	private String name;

	private Category category;

	private int price;

	private int quantity;

	private boolean secondhand;

	private boolean polish;

	private Map<String,Object> details;

	public Item(String name, Category category, int price, int quantity) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}

	public Item() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Category getCategory() {
		return category;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setSecondhand(boolean secondhand) {
		this.secondhand = secondhand;
	}

	public boolean isSecondhand() {
		return secondhand;
	}

	public void setPolish(boolean polish) {
		this.polish = polish;
	}

	public void setDetails(Map<String, Object> details){
		this.details = details;
	}

	public Map<String, Object> getDetails(){
		return this.details;
	}

	public boolean isPolish() {
		return polish;
	}

	@Override
	public String toString() {
		return getName();
	}
}
