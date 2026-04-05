package practice.ch05.ex;

// Thread 클래스 상속
public class Main extends Thread{ // Thread 클래스 JDK 제공
    public static void main(String[] args) {
        // 스레드 객체 생성
        Main t1 = new Main("Thread A");
        Main t2 = new Main("Thread B");

        // 스레드에 시작해라 지시
        t1.start(); // 스레드가 해야 할 일을 작성한 run() 메소드가 자동으로 실행됨
        t2.start();

    }

    // 스레드가 해야 할 일을 작성
    @Override
    public void run() {
        Singleton s = Singleton.getInstance();
        System.out.println(getName() + ": " + s); // 스레드 이름과 싱글턴 인스턴스의 주소값 출력
    }

    public Main(String name) {
        super(name); // 부모인 Thread의 생성자를 호출해서 스레드 이름 설정
    }
}

// synchronized 키워드
/* before
인스턴스가 생성되었습니다.
인스턴스가 생성되었습니다.
Thread B: practice.ch05.ex.Singleton@인스턴스_주소1
Thread A: practice.ch05.ex.Singleton@인스턴스_주소2
*/

/* after
인스턴스가 생성되었습니다.
Thread B: practice.ch05.ex.Singleton@인스턴스_주소
Thread A: practice.ch05.ex.Singleton@인스턴스_주소
*/

