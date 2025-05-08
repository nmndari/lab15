package labxx.sict.must.edu.mn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testMultiplyTwoPositiveNumbers() {
        Multiplication multiplication = new Multiplication();
        double result = multiplication.multiply(2, 3);
        assertEquals(6, result, 0.0001);
    }
}