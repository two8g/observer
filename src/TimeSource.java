public interface TimeSource {
    void setObserver(ClockObserver observer);

    void setTime(int hours, int minutes, int seconds);
}
