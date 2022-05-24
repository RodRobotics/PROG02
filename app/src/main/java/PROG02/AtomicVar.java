package PROG02;
import java.util.concurrent.atomic.*;
public class AtomicVar {
    private int c = 0;
    AtomicInteger intatomic = new AtomicInteger(0);


    public void increment(int setValue) {
        c++;
        intatomic.set(setValue);
    }

    public void decrement(int decrement) {
        c--;
        intatomic.decrementAndGet();
    }

    public int value() {
        //return c;
        return intatomic.get();
    }
}
