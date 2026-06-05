package practice.ch21;

public class Main {
    public static void main(String[] args) {
        // 본인 생성 -> tlrksdl dhfo rjffla
        // Printable p1 = new Printer("Alice");
        // p1.print("Hello world");

        // 프록시를 생성해서 이용
        Printable p2 = new PrinterProxy();
        p2.setPrinterName("Bob");
        System.out.println(p2.getPrinterName());

        p2.print("Hello world"); // 본인이 생성
    }
}
