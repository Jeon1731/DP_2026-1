package hw.ch02;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20230887, 이름: 전유정");
        
        // KoreanOutletAdapter 생성
        KoreanOutletAdapter koreanOutletAdapter = new KoreanOutletAdapter();

        // Smartphone에 전달
        Smartphone smartphone = new Smartphone(koreanOutletAdapter);

        // charge() 호출
        smartphone.charge();
    }
}
