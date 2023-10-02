package sdp1;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void processAmount(double amount) {
        System.out.println("Paid $" + amount + " with Credit Card " + cardNumber);
    }

    private String cardNumber;
    public CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }
}
