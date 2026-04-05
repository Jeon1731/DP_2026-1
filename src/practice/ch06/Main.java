package practice.ch06;

public class Main {
    public static void main(String[] args) {
        MessageBox mbox1 = new MessageBox('@');
        mbox1.use("Hello, world.");

        mbox1.createCopy().use("Hello, world.");
        // mbox1.clone(); // clone() 메소드는 자신의 클래스 및 하위 클래서에서만 호출 가능
    }
}
