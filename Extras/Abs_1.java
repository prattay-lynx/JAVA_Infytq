abstract class Payment{
    //Implement your code here
    private int customerId;
    protected String paymentId;
    protected double serviceTaxPercentage;

    public Payment(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    public double getServiceTaxPercentage() {
        return serviceTaxPercentage;
    }
    public void setServiceTaxPercentage(double serviceTaxPercentage) {
        this.serviceTaxPercentage = serviceTaxPercentage;
    }
    public abstract double payBill(double amount);

}

class DebitCardPayment extends Payment{
    //Implement your code here
    private static int counter = 1000;
    private double discountPercentage;
    public static int getCounter() {
        return counter;
    }
    public static void setCounter(int counter) {
        DebitCardPayment.counter = counter;
    }
    public double getDiscountPercentage() {
        return discountPercentage;
    }
    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    public DebitCardPayment(int customerId) {
        super(customerId);
        counter++;
        paymentId="D"+counter;
    }
    
    public double payBill(double amount)
    {
        double serviceTaxAmount=0;
        double discountAmount=0;

        if(amount<=500) serviceTaxPercentage=2.5;
        else if(amount<=1000) serviceTaxPercentage=4;
        else serviceTaxPercentage=5;

        serviceTaxAmount=amount*serviceTaxPercentage/100.0;

        if(amount<=500) discountPercentage=1;
        else if(amount<=1000) discountPercentage=2;
        else discountPercentage=3;

        discountAmount=amount*discountPercentage/100.0;

        return amount+serviceTaxAmount-discountAmount;

    }

}

class CreditCardPayment extends Payment{
    //Implement your code here
    private static int counter=1000;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        CreditCardPayment.counter = counter;
    }

    public CreditCardPayment(int customerId)
    {
        super(customerId);
        counter++;
        paymentId="C"+counter;
    }
    public double payBill(double amount)
    {
        double serviceTaxAmount=0;

        if(amount<=500) serviceTaxPercentage=3;
        else if(amount<=1000) serviceTaxPercentage=5;
        else serviceTaxPercentage=6;

        serviceTaxAmount=amount*serviceTaxPercentage/100.0;
        return amount+serviceTaxAmount;
    }
    
}

class Abs_1{
    public static void main(String args[]){
        DebitCardPayment debitCardPayment = new DebitCardPayment(101);
        double billAmount=Math.round(debitCardPayment.payBill(500)*100)/100.0;
		System.out.println("Customer Id: " + debitCardPayment.getCustomerId());
		System.out.println("Payment Id: " + debitCardPayment.getPaymentId());
		System.out.println("Service tax percentage: " + debitCardPayment.getServiceTaxPercentage());
		System.out.println("Discount percentage: " + debitCardPayment.getDiscountPercentage());
		System.out.println("Total bill amount: " + billAmount);
		
		CreditCardPayment creditCardPayment = new CreditCardPayment(102);
        billAmount=Math.round(creditCardPayment.payBill(1000)*100)/100.0;
		System.out.println("Customer Id: " + creditCardPayment.getCustomerId());
		System.out.println("Payment Id: " + creditCardPayment.getPaymentId());
		System.out.println("Service tax percentage: " + creditCardPayment.getServiceTaxPercentage());
		System.out.println("Total bill amount: " + billAmount);
    }
}