interface Payment {
    int processPayment(); 
}

class CreditCardPayment implements Payment {
    public int processPayment() {
        System.out.println("Processing Credit Card Payment");
        return 200; 
    }
}

public class PaymentDemo1 {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        int status = payment.processPayment();
        System.out.println("Payment status code: " + status);
    }
}
