package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day19Test {
    @Test
    public void testInToRoman() {
        Assertions.assertEquals("I", Day19.intToRomanNumber(1));
        Assertions.assertEquals("XII", Day19.intToRomanNumber(12));
        Assertions.assertEquals("XIII", Day19.intToRomanNumber(13));
        Assertions.assertEquals("XIV", Day19.intToRomanNumber(14));
        Assertions.assertEquals("MCMXC", Day19.intToRomanNumber(1990));
        Assertions.assertEquals("MCMXCIX", Day19.intToRomanNumber(1999));
        Assertions.assertEquals("MMMDXXI", Day19.intToRomanNumber(3521));
        Assertions.assertEquals("MMMM", Day19.intToRomanNumber(4000));
    }
}
