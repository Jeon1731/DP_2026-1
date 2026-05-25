package hw.ch19;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20230887, 이름: 전유정");
        SafeFrame frame = new SafeFrame("State Test");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);   // 시간 설정 
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
