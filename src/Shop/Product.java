package Shop;

import java.io.Serializable;

public class Product implements Serializable  {
	
	private int itemID;
	private String itemname;
	private int unitprice;
	private int quantity;
	private int amountprice;
	

	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAmountprice() {
		return amountprice;
	}
	public void setAmountprice(int amountprice) {
		this.amountprice = amountprice;
	}
	
	
	
	
	

}
