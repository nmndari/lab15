package labxx.sict.must.edu.mn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {
    @Test
    void testMultiplyPositive() {
        assertEquals(6.0, new Multiplication().multiply(2.0, 3.0));
}

}
