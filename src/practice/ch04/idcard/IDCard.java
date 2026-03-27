package practice.ch04.idcard;

import practice.ch04.framework.Product;

public class IDCard extends Product{
    private String owner;

    IDCard(String owner) { // public 키워드 없으면 같은 패키지 내에서만 사용 가능 
        // 부모의 인자 없는 생성자를 호출함
        // super(); // 생략가능
        // super(x, y); // 인자 있는 부모 생성자 // 첫 문장
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다."); // this.toString() 자동 호출
    }

    @Override
    // Object 클래스의 toString 메소드 오버라이드
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
