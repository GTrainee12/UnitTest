package evenOddNumber;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class evenOddNumberTest {

    @Test
    public void testEvenNumber() {
        evenOddNumber eo = new evenOddNumber();
        boolean result = eo.evenOddNumber(4);
        assertEquals(true, result);
    }

    @Test
    public void testOddNumber() {
        evenOddNumber eo = new evenOddNumber();
        boolean result = eo.evenOddNumber(7);
        assertEquals(false, result);
    }

    @Test
    public void testZero() {
        evenOddNumber eo = new evenOddNumber();
        boolean result = eo.evenOddNumber(0);
        assertEquals(true, result);
    }

    @Test
    public void testNegativeEvenNumber() {
        evenOddNumber eo = new evenOddNumber();
        boolean result = eo.evenOddNumber(-10);
        assertEquals(true, result);
    }

    @Test
    public void testNegativeOddNumber() {
        evenOddNumber eo = new evenOddNumber();
        boolean result = eo.evenOddNumber(-5);
        assertEquals(false, result);
    }
}