package labxx.sict.must.edu.mn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {
    @Test
    @DisplayName("multiply(): positive×negative yields negative")
    void multiply_positiveAndNegative() {
        // Arrange
        Multiplication calc = new Multiplication();
        double a = 5.0, b = -4.0;
        // Act
        double product = calc.multiply(a, b);
        // Assert
        assertEquals(-20.0, product, 1e-9);
    }
    
    @Test
    @DisplayName("multiply(): using zero yields zero")
    void multiply_withZero() {
        // Arrange
        Multiplication calc = new Multiplication();
        // Act & Assert combined
        assertEquals(0.0, calc.multiply(0.0, 123.45), 1e-9);
    }
}