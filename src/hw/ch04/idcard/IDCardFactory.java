package hw.ch04.idcard;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class IDCardFactory extends Factory {
    private String baseDate; // 카드 발급 기준 날짜, "YYYY-MM-DD"
    private int serialCounter = 0; // 시리얼 넘버 카운터 (0 부터 시작)

    public IDCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, ++serialCounter, baseDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
