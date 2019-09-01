package model;

public class Product{
	private int id;
	private String name;
	private int stockQuantity;
	
	// Constructor	
	public Product(int id, String name, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.stockQuantity = stock;
	}

	// Getters
	public int getStockQuantity() {
		return stockQuantity;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	// Stock management	
	public void decreaseStock() {
		if (this.stockQuantity > 0) {
			this.stockQuantity--;
		}
	}
	
	public boolean isStockLow() {
		return this.stockQuantity <= 2;
	}
		
}
