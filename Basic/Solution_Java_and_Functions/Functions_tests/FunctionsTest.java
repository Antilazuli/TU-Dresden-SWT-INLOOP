import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FunctionsTest {
    @Test
    public void testFactorialOfZeroIsOne() {
        assertEquals(1, Functions.factorial(0));
    }

    @Test
    public void testFactorialOfOneIsOne() {
        assertEquals(1, Functions.factorial(1));
    }

    @Test
    public void testFactorialValues() {
        assertEquals(2, Functions.factorial(2));
        assertEquals(6, Functions.factorial(3));
        assertEquals(24, Functions.factorial(4));
        assertEquals(120, Functions.factorial(5));
        assertEquals(3_628_800, Functions.factorial(10));
        assertEquals(479_001_600, Functions.factorial(12));
        // 12! is the last factorial that fits in an int
    }
}
