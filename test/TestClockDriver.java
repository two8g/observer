import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestClockDriver {

    private MockTimeSource mockTimeSource;
    private MockTimeSink mockTimeSink;

    @Before
    public void setUp() throws Exception {
        mockTimeSource = new MockTimeSource();
        mockTimeSink = new MockTimeSink();
        mockTimeSource.setObserver(mockTimeSink);
    }

    @Test
    public void testTimeChange() {
        mockTimeSource.setTime(3, 4, 5);
        assertSinkEquals(mockTimeSink, 3, 4, 5);

        mockTimeSource.setTime(7, 8, 9);
        assertSinkEquals(mockTimeSink, 7, 8, 9);
    }

    private void assertSinkEquals(MockTimeSink mockTimeSink, int hours, int minutes, int seconds) {
        Assert.assertEquals(hours, mockTimeSink.getHours());
        Assert.assertEquals(minutes, mockTimeSink.getMinutes());
        Assert.assertEquals(seconds, mockTimeSink.getSeconds());
    }
}
