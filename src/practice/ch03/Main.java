package practice.ch03;

import ch03.A4.StringDisplay;

public class Main {
    public static void main(String[] args) {
        // CharDisplay d1 = new CharDisplay('H'); // 'H', "H" 
        AbstractDisplay d1 = new CharDisplay('H'); 
        d1.display();

        StringDisplay d2 = new StringDisplay("Hello, world"); // "Hello, world"
        // AbstractDisplay d2 = new StringDisplay("Hello, world"); // 강의 재시청
        d2.display();
    }
}
