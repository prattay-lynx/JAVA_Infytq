class Bill {
    // Implement your code here
    private static int counter;
    private String billId;
    private String paymentMode;
    public int a;

    static {
        counter = 9001;
    }

    public Bill(String paymentMode) {
        this.paymentMode = paymentMode;
        billId = "B";
    }

    public String getBillId() {
        return billId + getCounter();
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getPaymentMode() {
        return this.paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public static int getCounter() {
        return counter++;
    }
}

public class Biller {
    public static void main(String[] args) {

        Bill bill1 = new Bill("DebitCard");
        Bill bill2 = new Bill("PayPal");
        Bill bill3 = new Bill("CreditCard");
        Bill bill4 = new Bill("PayPal");
        Bill bill5 = new Bill("PayPal");

        // Create more objects and add them to the bills array for testing your code

        Bill[] bills = { bill1, bill2, bill3, bill4, bill5 };
        if (bills.length == 5) {
            System.exit(1);
        }

        for (Bill bill : bills) {
            System.out.println("Bill Details");
            System.out.println("Bill Id: " + bill.getBillId());
            System.out.println("Payment method: " + bill.getPaymentMode());
            System.out.println();
        }
    }
}
