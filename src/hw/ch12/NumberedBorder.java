package hw.ch12;

public class NumberedBorder extends Border{
    private int numberInt = 0; // 장식 숫자

    // 내용물이 될 Display를 지정
    public NumberedBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        // 문자 수는 내용물의 왼쪽에 "%2d| " 장식 문자만큼 더한 것
        return 4 + display.getColumns();
    }

    @Override
    public int getRows() {
        // 행수는 내용물의 행수와 같다
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        // 지정 행의 내용은 내용물의 지정 행 왼쪽에 장식 문자를 붙인 것
        return String.format("%2d| %s", ++numberInt, display.getRowText(row));
    }
}
