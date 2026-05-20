package hw.ch16;

import java.awt.Color;
import java.awt.Label;

public class ColleagueLabel extends Label implements Colleague{
    private Mediator mediator;
    
    // Mediator를 설정한다
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // Mediator에서 활성/비활성을 지시한다
    @Override
    public void setColleagueEnabled(boolean enabled) {
        if (enabled == true) {
            this.setText("● 로그인 가능");
            this.setForeground(Color.blue);
        } else { // enabled == false
            this.setText("● 로그인 불가");
            this.setForeground(Color.gray);
        }
    }
    
}
