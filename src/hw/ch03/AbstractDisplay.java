package hw.ch03;

public abstract class AbstractDisplay {
    private int repeatCount;

    // 생성자
    public AbstractDisplay() { // default repeatCount == 5
        this.repeatCount = 5;
    }

    public AbstractDisplay(int repeatCount) {
        this.repeatCount = repeatCount;
    }

    public abstract void open();
    public abstract void print();
    public abstract void close();

    public final void display() { 
        open();
        for (int i = 0; i < repeatCount; i++) {
            print();
        }
        close();
    }
}
