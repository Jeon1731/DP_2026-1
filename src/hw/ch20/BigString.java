package hw.ch20;

public class BigString {
    // '큰 문자'의 배열
    private BigChar[] bigchars;

    // 생성자 
    public BigString(String string) {
        BigCharFactory factory = BigCharFactory.getInstance();
        bigchars = new BigChar[string.length()];
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    // 표시
    public void print() {
        for (BigChar bc: bigchars) {
            bc.print();
        }
    }

    // 오버로드
    public void print(String[] colors) { 
        for (int i = 0; i < bigchars.length; i++) { // colors의 배열의 길이는 입력 문자열과 같다고 가정
            bigchars[i].print(colors[i]);
        }
    }
}
