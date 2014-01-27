import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by manalit on 1/27/14.
 */
public class DateTimeTest {
    @Test
    public void testDateAndTime() throws Exception {
        String date = "01/01/2014 12:00:00";
        DateTime dt = new DateTime(date);

        String actual = dt.toString();

        Assert.assertEquals(date, actual);
    }
    @Test
    public void testDateAndTime1() throws Exception {
        String date = "30/11/1994 09:30:15";
        DateTime dt = new DateTime(date);

        String actual = dt.toString();

        Assert.assertEquals(date, actual);
    }
}
