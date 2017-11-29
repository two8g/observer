import java.util.Vector;

public class MockTimeSource implements TimeSource {
    private int hours;
    private int minutes;
    private int seconds;
    //private ClockObserver observer;
    private Vector<ClockObserver> observers = new Vector<>();

    @Override
    public void registerObserver(ClockObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void setTime(int hours, int minutes, int seconds) {
        //this.hours = hours;
        //this.minutes = minutes;
        //this.seconds = seconds;
        ////observer.update(hours, minutes, seconds);
        for (ClockObserver observer : observers) {
            observer.update(hours, minutes, seconds);
        }
    }
}
