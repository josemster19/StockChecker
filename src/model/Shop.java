package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


//TODO
public class Shop {
	private List<Product> products;
	
	// Product sorting helping functions
	public static final int SORT_ASCENDING = 1;
	public static final int SORT_DESCENDING = -1;
	
	//TODO
	private void init(){
		this.products = new ArrayList<Product>();
		
		this.products.add(new Product(1001, "ZZZZ Llet", 5));
		this.products.add(new Product(1002, "Arros", 5));		
		this.products.add(new Product(1003, "AAAA Macarrons", 5));		
		this.products.add(new Product(1004, "Cigrons", 5));		
		this.products.add(new Product(1005, "Pomes", 3));		
		this.products.add(new Product(1006, "Xocolata", 5));
		
		//sort the products list by Name in ascending order
		//TODO
	}

	// Getter
	public List<Product> getProducts() {
		return this.products;
	}
	
	/**
	 * Method that sorts the list of products by the product's stock in 
	 * ascending or descending order.
	 * @param order ascending or descending.
	 */
	public void sortByStock(int order) {
		Collections.sort(this.products, new Comparator<Product> (){
			public int compare(Product o1, Product o2){				
				//TODO return something different from -1
				return -1; 
			}
		});
	}
 
	/**
	 * Method that sorts the list of products by the product's name in 
	 * ascending or descending order.
	 * @param order ascending or descending.
	 */
	public void sortByName(int order) {
		Collections.sort(this.products, new Comparator<Product> (){
			public int compare(Product o1, Product o2){
				//TODO something different from -1
				return -1;
			}
		});
	}
}
