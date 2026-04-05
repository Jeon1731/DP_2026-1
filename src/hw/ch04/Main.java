package hw.ch04;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import hw.ch04.idcard.IDCardFactory;
// import hw.ch04.license.LicenseCard;
import hw.ch04.license.LicenseCardFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20230887, 이름: 전유정");
        
        // Step 1 테스트: IDCard 정보 확장
        Factory factory = new IDCardFactory("2026-03-20");
        Product card1 = factory.create("Kim Youngjin");
        Product card2 = factory.create("Son Heungmin");
        card1.use();
        card2.use();

        // 사용 예시
        // Product license = new LicenseCard("Park jisung", 201, "2026-03-20", "2031-03-19");
        // license.use();

        // Step 2 테스트: 새로운 카드 타입
        Factory factory2 = new LicenseCardFactory("2026-03-20");
        Product license1 = factory2.create("Park Jisung");
        Product license2 = factory2.create("Lee Min-jae");
        license1.use();
        license2.use();
    }
}
