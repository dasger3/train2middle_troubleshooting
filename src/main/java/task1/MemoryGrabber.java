package task1;

import java.util.LinkedList;
import java.util.List;

public class MemoryGrabber {
    static final List<Object[]> arrays = new LinkedList<>();

    public static void grabAllMemory() {
        for (; ; ) {
            arrays.add(new Object[100]);
        }
    }
}
