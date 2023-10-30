package numberInInterval;

import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;

public class NumberInIntervalTest {

    @Test
    public void testNumberInInterval() {
        NumberInInterval nii = new NumberInInterval();
        boolean result = nii.numberInInterval(50);
        assertEquals(true, result);
    }

    @Test
    public void testNumberBelowInterval() {
        NumberInInterval nii = new NumberInInterval();
        boolean result = nii.numberInInterval(20);
        assertEquals(false, result);
    }

    @Test
    public void testNumberAboveInterval() {
        NumberInInterval nii = new NumberInInterval();
        boolean result = nii.numberInInterval(110);
        assertEquals(false, result);
    }

    @Test
    public void testNumberAtLowerBound() {
        NumberInInterval nii = new NumberInInterval();
        boolean result = nii.numberInInterval(26);
        assertEquals(true, result);
    }

    @Test
    public void testNumberAtUpperBound() {
        NumberInInterval nii = new NumberInInterval();
        boolean result = nii.numberInInterval(99);
        assertEquals(true, result);
    }
}