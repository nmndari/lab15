package labxx.sict.must.edu.mn;

public final class Division {
    /**
     * Хоёр тоог хуваана.
     *
     * @param a хуваагдагч (final)
     * @param b хуваагч (final) — тэг байж болохгүй
     * @return хуваалтын үр дүн
     * @throws IllegalArgumentException хэрвээ b нь 0 байвал
     */
    public double divide(final double a, final double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Тэгээр хуваах боломжгүй");
        }
        return a / b;
    }
}
