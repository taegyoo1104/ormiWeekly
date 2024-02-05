package daily.q0205;

import java.math.BigDecimal;

public class LargeAppliance extends Product{
    public LargeAppliance(String name, BigDecimal price, Double weight) {
        super(name, price, weight);
        this.setPrice(price.subtract(getDiscountAmount()));
    }
}
