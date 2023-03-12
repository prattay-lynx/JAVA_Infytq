class Shipment{
	
    public boolean checkProductNameValidity(String productName) {
	    //Implement your code here and change the return value accordingly
        // 
        String regex = "^[a-zA-Z]{1,15}\\s[a-zA-Z]{1,15}(?:\\s[a-zA-Z]{1,15})?$";
        //Implement your code here and change the return value accordingly
        if(productName.matches(regex)) return true;
        else return false;
	}
	
	public boolean checkProductIdValidity(String productId) {
	    //Implement your code here and change the return value accordingly
            //Implement your code here and change the return value accordingly
        // 
        String regex = "^[a-zA-Z0-9]{2,20}$";
        //Implement your code here and change the return value accordingly
        if(productId.matches(regex)) return true;
        else return false;
	}
	
	public boolean checkTrackerIdValidity(String trackerId) {
	    //Implement your code here and change the return value accordingly
        String regex = "^[A-Z]{1}[\\:]{1}[A-Z]{4}[\\:][a-z]{3}[\\:][0-9]{2}$";
        //Implement your code here and change the return value accordingly
        if(trackerId.matches(regex)) return true;
        else return false;
	}
	
}

class product {
      
    public static void main(String[] args) {
            
        Shipment shipment = new Shipment();
        
        //Change the values for testing your code with different values
        
        String productName = "Digital Camera";
        System.out.println("The product name is "+ (shipment.checkProductNameValidity(productName) ? "valid!" : "invalid!"));

        String productId = "DCVN112";
        System.out.println("The product Id is "+ (shipment.checkProductIdValidity(productId) ? "valid!" : "invalid!"));

        String trackerId = "D:CMDC:cmd";
        System.out.println("The tracker Id is "+ (shipment.checkTrackerIdValidity(trackerId) ? "valid!" : "invalid!"));
    
    }
}





// ^[A-Za-z\s]{1,}[\.]{0,1}[A-Za-z\s]{0,}$