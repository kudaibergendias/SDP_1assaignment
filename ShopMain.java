package sdp1;
public class ShopMain {
    public static void main(String[] args){
        Product product1 = new Product("Bread", 0.31, 35);
        Product product2 = new Product("Samsa", 0.52, 30);
        ShoppingBasket basket = new ShoppingBasket();
        basket.addProduct(product1);
        basket.addProduct(product2);
        System.out.println("Amount: " + basket.calculateTotalPrice());
        
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9100-1234");
        PaymentStrategy qrPayment = new QRPayment("1098-7654-3210-0123");
        PaymentStrategy cashPayment = new CashPayment("27");
        PaymentProcessor paymentProcessorCard = new PaymentProcessor(creditCardPayment);
        PaymentProcessor paymentProcessorQr = new PaymentProcessor(qrPayment);

        paymentProcessorCard.processorPayment(basket.calculateTotalPrice());
        paymentProcessorQr.processorPayment(basket.calculateTotalPrice());
        basket.check(cashPayment);
    }
}
