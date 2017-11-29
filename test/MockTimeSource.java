public class MockTimeSource implements TimeSource {
    private int hours;
    private int minutes;
    private int seconds;
    private ClockObserver observer;

    @Override
    public void registerObserver(ClockObserver observer) {
        this.observer = observer;
    }

    @Override
    public void setTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        observer.update(hours, minutes, seconds);
    }
}
