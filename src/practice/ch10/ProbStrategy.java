package practice.ch10;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
<<<<<<< HEAD
    private int prevHandValue = 0; // 이전에 낸 손의 값
    private int currentHandValue = 0; // 바로 직전에 낸 손의 값
=======
    private int prevHandValue = 0;
    private int currentHandValue = 0;
>>>>>>> e24812565cf58e69af81de89c2147eb73c890aae
    private int[][] history = {
        { 1, 1, 1, },
        { 1, 1, 1, },
        { 1, 1, 1, },
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
<<<<<<< HEAD
    public Hand nextHand() { // 전략의 핵심
        int bet = random.nextInt(getSum(currentHandValue));
        int handvalue = 0; // 이번에 낼 손의 값
=======
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int handvalue = 0;
>>>>>>> e24812565cf58e69af81de89c2147eb73c890aae
        if (bet < history[currentHandValue][0]) {
            handvalue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handvalue = 1;
        } else {
            handvalue = 2;
        }
        prevHandValue = currentHandValue;
        currentHandValue = handvalue;
        return Hand.getHand(handvalue);
    }

    private int getSum(int handvalue) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
<<<<<<< HEAD
            sum += history[handvalue][i]; // 셀 번호는 고정, 열 번호가 0, 1, 2로 바뀜 => 그 행의 값을 다 더함
=======
            sum += history[handvalue][i];
>>>>>>> e24812565cf58e69af81de89c2147eb73c890aae
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
<<<<<<< HEAD
        if (win) { // 이겼으면
            history[prevHandValue][currentHandValue]++;
        } else { // 졌으면
=======
        if (win) {
            history[prevHandValue][currentHandValue]++;
        } else {
>>>>>>> e24812565cf58e69af81de89c2147eb73c890aae
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
