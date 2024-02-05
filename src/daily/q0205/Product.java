package daily.q0205;

import java.math.BigDecimal;

public class Product implements Promotion{
    private String name;
    private BigDecimal price;
    private Double weight;

    public Product(String name, BigDecimal price, Double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public BigDecimal getDiscountAmount() {
        if(getName().equals("grocery")) {
            return BigDecimal.valueOf(2000);
        } else if(getName().equals("beauty")) {
            return BigDecimal.valueOf(10000);
        } else {
            return BigDecimal.ZERO;
        }
    }
}