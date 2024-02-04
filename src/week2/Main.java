package week2;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        // 무게 11, 가격 10,000원 -> 기본배송비 10000원 + 추가 배송비 10000원 = 20000원
        Beauty beauty = new Beauty("뷰티1", BigDecimal.valueOf(10000), 11.0);
        beauty.getDeliveryCharge();

        // 무게 2, 가격 50,000원 -> 기본 배송비 1000원 + 추가 배송비 (-1000원) = 0원
        Grocery grocery = new Grocery("식료품1", BigDecimal.valueOf(50000), 2.0);
        grocery.getDeliveryCharge();

        // 무게 130, 가격 1,300,000원 ->  가격 130만 이상, 배송비 0원
        LargeAppliance largeAppliance = new LargeAppliance("가전1", BigDecimal.valueOf(1300000), 130.0);
        largeAppliance.getDeliveryCharge();

        /*
        OUTPUT

        뷰티1의 총 배송비는 20000원 입니다.
        식료품1의 총 배송비는 0원 입니다.
        가전1의 총 배송비는 0원 입니다.
        */
    }
}
