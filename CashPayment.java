package sdp1;

public class CashPayment implements PaymentStrategy {
    @Override
    public void processAmount(double amount) {
        System.out.println("Paid $" + amount + " with Cash " + cash);
    }

    private String cash;
    public CashPayment(String cash){
        this.cash = cash;
    }

}
