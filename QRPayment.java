package sdp1;

public class QRPayment implements PaymentStrategy{
    @Override
    public void processAmount(double amount) {
        System.out.println("Paid $" + amount + " with QR (" + qrId + ")");
    }
    private String qrId;
    public QRPayment(String qrId){
        this.qrId = qrId;
    }
}
