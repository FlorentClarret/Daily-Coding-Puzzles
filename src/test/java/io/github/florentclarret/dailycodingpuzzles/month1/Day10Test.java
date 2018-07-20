package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day10Test {

    @Test
    public void testRecursiveMultiply() {
        Assertions.assertEquals(0, Day10.recursiveMultiply(10, 0));
        Assertions.assertEquals(0, Day10.recursiveMultiply(0, 0));
        Assertions.assertEquals(5, Day10.recursiveMultiply(5, 1));
        Assertions.assertEquals(21, Day10.recursiveMultiply(7, 3));
        Assertions.assertEquals(100, Day10.recursiveMultiply(10, 10));
    }
}
