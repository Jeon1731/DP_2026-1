package hw.ch04.license;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class LicenseCardFactory extends Factory{
    private int licenseCounter = 100; // 면허 번호 카운터 (100 부터 시작)
    private String baseDate; // 발급 기준 날짜

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    protected Product createProduct(String holder) {
        // 문자열을 LocalDate로 변환
        LocalDate date = LocalDate.parse(baseDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        // 5년 추가
        LocalDate newDate = date.plusYears(5).minusDays(1);
        String expiryDate = newDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return new LicenseCard(holder, ++licenseCounter, baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
