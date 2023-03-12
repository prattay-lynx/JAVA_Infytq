interface Tax{
    //Implement your code here
	public double calculateTax(double price);
}

class PurchaseDetails implements Tax{
    //Implement your code here
	private String purchaseId;
	private String paymentType;
	private double taxPercentage;

	public String getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public PurchaseDetails(String purchaseId, String paymentType) {
		this.purchaseId = purchaseId;
		this.paymentType = paymentType;
	}
	
	public double calculateTax(double price)
	{
		if(this.paymentType.equals("Debit Card"))
		{
			this.setTaxPercentage(2);
		}
		else if(this.paymentType.equals("Credit Card"))
		{
			this.setTaxPercentage(3);
		}
		else 
		{
			this.setTaxPercentage(4);
		}
		price = price + (price*(this.getTaxPercentage()/100.0));
		return price;
	}
}


class Seller implements Tax{
    //Implement your code here
	private String location;
	private double taxPercentage;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public Seller(String location) {
		this.location = location;
	}

	public double calculateTax(double price)
	{
		if(this.getLocation().equals("Middle east"))
		{
			this.setTaxPercentage(15);
		}
		else if(this.getLocation().equals("Europe"))
		{
			this.setTaxPercentage(25);
		}
		else if(this.getLocation().equals("Canada"))
		{
			this.setTaxPercentage(22);
		}
		else if(this.getLocation().equals("Japan"))
		{
			this.setTaxPercentage(12);
		}
		else 
		{
			this.setTaxPercentage(0);
		}
		return (price*(this.getTaxPercentage()/100.0));
	}	
}

class Tax1{
    public static void main(String args[]) {
		System.out.println("Purchase Details\n***************");
		PurchaseDetails purchaseDetails = new PurchaseDetails("P1001","Credit Card");
		System.out.println("Total purchase amount: " + Math.round(purchaseDetails.calculateTax(100)*100)/100.0);
		System.out.println("Tax percentage: "+purchaseDetails.getTaxPercentage());

        System.out.println("Seller Details\n***************");
		Seller seller = new Seller("Canada");
		System.out.println("Tax to be paid by the seller: " + Math.round(seller.calculateTax(100)*100)/100.0);
		System.out.println("Tax percentage: "+seller.getTaxPercentage());
		
		//Create more objects for testing your code
	}
}