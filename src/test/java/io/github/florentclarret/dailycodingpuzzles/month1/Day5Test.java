package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day5Test {

    @Test
    public void testCompress() {
        Assertions.assertEquals("", Day5.compress(""));
        Assertions.assertEquals("a", Day5.compress("a"));
        Assertions.assertEquals("ab", Day5.compress("ab"));
        Assertions.assertEquals("abc", Day5.compress("abc"));
        Assertions.assertEquals("a4b3c4d1", Day5.compress("aaaabbbccccd"));
        Assertions.assertEquals("a4b3c4d1", Day5.compress("aaaabbbccccd"));
    }
}
