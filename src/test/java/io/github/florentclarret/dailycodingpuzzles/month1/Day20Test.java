package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day20Test {
    @Test
    public void testRomanNumberToInt() {
        Assertions.assertEquals(1, Day20.romanNumberToInt("I"));
        Assertions.assertEquals(12, Day20.romanNumberToInt("XII"));
        Assertions.assertEquals(13, Day20.romanNumberToInt("XIII"));
        Assertions.assertEquals(14, Day20.romanNumberToInt("XIV"));
        Assertions.assertEquals(1990, Day20.romanNumberToInt("MCMXC"));
        Assertions.assertEquals(1999, Day20.romanNumberToInt("MCMXCIX"));
        Assertions.assertEquals(3521, Day20.romanNumberToInt("MMMDXXI"));
        Assertions.assertEquals(4000, Day20.romanNumberToInt("MMMM"));
    }
}
