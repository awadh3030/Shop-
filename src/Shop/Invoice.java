package Shop;

import java.io.Serializable;

public class Invoice implements Serializable {

	private String customeName;
	private int phonenumber;
	private String invoicedate;
	private int numberofitems;
	private int totalamount;
	private int paidamount;
	private int balance;
	
	Product Product = new Product();
	
	public String getCustomeName() {
		return customeName;
	}
	public void setCustomeName(String customeName) {
		this.customeName = customeName;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getInvoicedate() {
		return invoicedate;
	}
	public void setInvoicedate(String invoicedate) {
		this.invoicedate = invoicedate;
	}
	public int getNumberofitems() {
		return numberofitems;
	}
	public void setNumberofitems(int numberofitems) {
		this.numberofitems = numberofitems;
	}
	public int getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}
	public int getPaidamount() {
		return paidamount;
	}
	public void setPaidamount(int paidamount) {
		this.paidamount = paidamount;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
