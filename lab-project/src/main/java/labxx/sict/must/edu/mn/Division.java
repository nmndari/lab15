package labxx.sict.must.edu.mn;

public final class Division {

    private Division() {
        // prevent instantiation
    }

    /**
     * Divides two integers.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the result of the division
     * @throws IllegalArgumentException if b is zero
     */
    public static int divide(final int a, final int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }
}
