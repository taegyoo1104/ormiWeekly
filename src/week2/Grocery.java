package week2;

import java.math.BigDecimal;

public class Grocery extends Product implements DeliveryChargeCalculator{
    public Grocery(String name, BigDecimal price, Double weight) {
        super(name, price, weight);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void getDeliveryCharge() {
        BigDecimal feeByWeight = BigDecimal.ZERO;
        BigDecimal additionalFee = BigDecimal.ZERO;

        if(getWeight() < 3.0) {
            feeByWeight = BigDecimal.valueOf(1000);
        } else if(getWeight() < 10.0) {
            feeByWeight = BigDecimal.valueOf(5000);
        } else {
            feeByWeight = BigDecimal.valueOf(10000);
        }

        if(getPrice().compareTo(BigDecimal.valueOf(30000)) == -1) {
            additionalFee = feeByWeight;
        } else if(getPrice().compareTo(BigDecimal.valueOf(100000)) == -1) {
            additionalFee = BigDecimal.valueOf(-1000);
        } else {
            additionalFee = feeByWeight.negate();
        }

        BigDecimal totalFee = feeByWeight.add(additionalFee);

        System.out.println(getName() + "의 총 배송비는 " + totalFee + "원 입니다.");
    }
}
