package hw.ch10;

public class CyclicStrategy implements Strategy{
    private int prevHand = 2 ;

    public CyclicStrategy() {
    }

    @Override
    public void study(boolean win) {
    }

    @Override
    public Hand nextHand() {
        prevHand = ++prevHand%3; 
        return Hand.getHand(prevHand);
    }
}
