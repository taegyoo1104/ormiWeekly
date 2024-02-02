package week2;

import java.math.BigDecimal;

public class Product {
    protected String name;
    protected BigDecimal price;
    protected Double weight;

    public Product(String name, BigDecimal price, Double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
}