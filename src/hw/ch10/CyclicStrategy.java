package hw.ch10;

public class CyclicStrategy implements Strategy{
     private int handValue = 2 ;

    public CyclicStrategy() {
    }

    @Override
    public void study(boolean win) {
    }

    @Override
    public Hand nextHand() {
        handValue = ++handValue%3; 
        return Hand.getHand(handValue);
    }
}
