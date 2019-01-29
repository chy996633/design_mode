package design_mode.behaviour.mediator.timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerMediator {

    static class MyTaskOne extends TimerTask {
        private int num = 0;

        @Override
        public void run() {
            System.out.println("task one : " + num++);
        }
    }

    static class MyTaskTwo extends TimerTask {

        private int num = 1000;

        @Override
        public void run() {
            System.out.println("task two : " + --num);
        }
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new MyTaskOne(), 1000, 1000);
        timer.schedule(new MyTaskTwo(), 1000, 1000);
    }

}
