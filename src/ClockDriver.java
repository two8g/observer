public class ClockDriver {
    private TimeSink timeSink;

    public ClockDriver(TimeSource timeSource, TimeSink timeSink) {
        timeSource.setDriver(this);
        this.timeSink = timeSink;
    }

    void update(int hours, int minutes, int seconds) {
        timeSink.setTime(hours, minutes, seconds);
    }
}
