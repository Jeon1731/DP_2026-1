package practice.ch02.delegation;

public class Main {
    public static void main(String[] args) {
        // Print print = new PrintBannerAdapter02("Hello, World!");
        PrintBannerAdapter02 print = new PrintBannerAdapter02("Hello, World!");
        print.printWeak();
        print.printStrong();
        // ((PrintBannerAdapter02)print).getYourName(); // 형변환(타입캐스팅)
        // (PrintBannerAdapter02)print.getYourName(); // 순서 . > 형변환, 괄호 필요
        System.out.println(print.getYourName());
    }
}
