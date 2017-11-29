public interface TimeSource {
    void setDriver(ClockDriver driver);

    void setTime(int hours, int minutes, int seconds);
}
