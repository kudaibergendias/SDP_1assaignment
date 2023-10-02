package sdp1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    private List<Product> basketItems = new ArrayList<>();
    public void addProduct(Product product){
        basketItems.add(product);
    }
    public double calculateTotalPrice(){
        double total = 0;
        for (Product product: basketItems){
            total+=product.getPrice() * product.getQuantity();
        }
        return total;
    }
    public void check(PaymentStrategy paymentStrategy){
        double totalAmount = calculateTotalPrice();
        paymentStrategy.processAmount(totalAmount);
    }
}
