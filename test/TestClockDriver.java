import org.junit.Assert;
import org.junit.Test;

public class TestClockDriver {
    @Test
    public void testTimeChange() {
        MockTimeSource mockTimeSource = new MockTimeSource();
        MockTimeSink mockTimeSink = new MockTimeSink();
        ClockDriver clockDriver = new ClockDriver(mockTimeSource, mockTimeSink);
        mockTimeSource.setTime(3, 4, 5);
        Assert.assertEquals(3, mockTimeSink.getHours());
        Assert.assertEquals(4, mockTimeSink.getMinutes());
        Assert.assertEquals(5, mockTimeSink.getSeconds());

        mockTimeSource.setTime(7, 8, 9);
        Assert.assertEquals(7, mockTimeSink.getHours());
        Assert.assertEquals(8, mockTimeSink.getMinutes());
        Assert.assertEquals(9, mockTimeSink.getSeconds());
    }
}
