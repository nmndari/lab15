package labxx.sict.must.edu.mn;
import static org.junit.jupiter.api.Assertions.assertEquals; // JUnit-ийн алдаа шалгах функц
import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    @Test
    public void testMultiplyPositive() {
        int result = 2 * 3; // multiply operation
        assertEquals(6, result); // test the result
    }
}
