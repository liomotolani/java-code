
public class Invoice {
private String partNumber;
private String partDescription;
private int quantity;
private double pricePerItem;
private double totalAmount;

public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem, double totalAmount) {
	
	
	    this.partNumber = partNumber;
	
	    this.partDescription = partDescription;
	
	    if(quantity>0.0)
		this.quantity = quantity;
	    
	    if(pricePerItem>0.0)
	    this.pricePerItem = pricePerItem;
	    
	    if(totalAmount>0.0)
	    this.totalAmount = totalAmount;
	    
}

public double getInvoiceAmount(){
	if(quantity<0.0);
	totalAmount = 0.0;
	if(pricePerItem<0.0);
	totalAmount= 0.0;
	if(quantity>0.0);
	totalAmount = quantity*pricePerItem;
	
	return totalAmount;
   
	   
	  
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getQuantity() {
	return quantity;
}
public void setPricePerItem(double pricePerItem) {
	this.pricePerItem =pricePerItem;
}

public double getPricePerItem() {
	return pricePerItem;
}

public void setPartNumber(String partNumber) {
	this.partNumber = partNumber;
}
public String getPartNumber() {
	return partNumber;
}

public void setPartDescription(String partDescription) {
	this.partDescription = partDescription;
}

public String getPartDescription() {
	return partDescription;
}
}
