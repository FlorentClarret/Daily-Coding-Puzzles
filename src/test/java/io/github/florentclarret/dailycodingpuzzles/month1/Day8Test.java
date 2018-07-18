package io.github.florentclarret.dailycodingpuzzles.month1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day8Test {

    @Test
    public void testSwap() {
        Assertions.assertEquals(0, Day8.swap(0));
        Assertions.assertEquals(0b11, Day8.swap(0b11));
        Assertions.assertEquals(0b1001, Day8.swap(0b0110));
        Assertions.assertEquals(0b11100100, Day8.swap(0b11011000));
    }
}
