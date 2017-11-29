public class ClockDriver implements ClockObserver {
    private TimeSink timeSink;

    public ClockDriver(TimeSource timeSource, TimeSink timeSink) {
        timeSource.setObserver(this);
        this.timeSink = timeSink;
    }

    @Override
    public void update(int hours, int minutes, int seconds) {
        timeSink.setTime(hours, minutes, seconds);
    }
}
