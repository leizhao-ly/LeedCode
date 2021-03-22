package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

public class Text2 {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long time2 = System.currentTimeMillis();
        System.out.println((time2 - time1));
    }
}
