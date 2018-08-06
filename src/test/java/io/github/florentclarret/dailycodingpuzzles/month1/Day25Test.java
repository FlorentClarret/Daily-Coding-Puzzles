package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day25Test {

    @Test
    public void testSubstractTheSum() {
        for(int i = 10; i < 10000; ++i) {
            Assertions.assertEquals("apple", Day25.substractTheSum(i));
        }
    }
}
