package lab_7;

import java.io.Serializable;

public class Item implements Serializable{
	
	private String name;
	private String quantity;

	
	
	public Item(String name, String quantity) {
	
		this.name = name;
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "Item name=" + name + ", quantity=" + quantity;
	}
	
	

}
