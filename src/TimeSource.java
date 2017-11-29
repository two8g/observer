public interface TimeSource {
    void registerObserver(ClockObserver observer);

    void setTime(int hours, int minutes, int seconds);
}
