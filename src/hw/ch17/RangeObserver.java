package hw.ch17;

public class RangeObserver implements Observer{
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("RangeObserver:");
        int number = generator.getNumber();
        if (number >= 0 && number < 10) { // 0 이상 ~ 10 미만
            System.out.print("[Low]");
        } 
        else if (number >=10 && number < 20) { // 10 이상 ~ 20 미만
            System.out.print("[Mid]");
        }
        else if (number >= 20) { // 20 이상
            System.out.print("[High]");
        }
        System.out.println(number);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
    
}
