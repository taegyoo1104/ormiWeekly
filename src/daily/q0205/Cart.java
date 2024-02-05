package daily.q0205;

import java.math.BigDecimal;

public class Cart {
    Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public BigDecimal calculateDeliveryCharge() {
        Double totalWeight = 0.0;
        BigDecimal totalPrice = BigDecimal.ZERO;
        BigDecimal totalDeliveryCharge = BigDecimal.ZERO;

        for (int i = 0; i < products.length; i++) {
            totalWeight += products[i].getWeight();
            totalPrice = totalPrice.add(products[i].getPrice());
        }

        if(totalWeight < 3.0) {
            totalDeliveryCharge = BigDecimal.valueOf(1000);
        } else if(totalWeight < 10.0) {
            totalDeliveryCharge = BigDecimal.valueOf(5000);
        } else {
            totalDeliveryCharge = BigDecimal.valueOf(10000);
        }

        if(totalPrice.compareTo(BigDecimal.valueOf(30000)) == -1) {
        } else if(totalPrice.compareTo(BigDecimal.valueOf(100000)) == -1) {
            totalDeliveryCharge = totalDeliveryCharge.subtract(BigDecimal.valueOf(1000));
        } else {
            totalDeliveryCharge = BigDecimal.ZERO;
        }

        return totalDeliveryCharge;
    }
}
