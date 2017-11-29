public class MockTimeSource implements TimeSource {
    private int hours;
    private int minutes;
    private int seconds;
    private ClockDriver driver;

    @Override
    public void setDriver(ClockDriver driver) {
        this.driver = driver;
    }

    @Override
    public void setTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        driver.update(hours, minutes, seconds);
    }
}
