package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day13Test {

    @Test
    public void testFactorial() {
        Assertions.assertEquals(1, Day13.factorial(1));
        Assertions.assertEquals(2, Day13.factorial(2));
        Assertions.assertEquals(6, Day13.factorial(3));
        Assertions.assertEquals(5040, Day13.factorial(7));
    }

    @Test
    public void testRank() {
        Assertions.assertEquals(0, Day13.rank(null));
        Assertions.assertEquals(1, Day13.rank(""));
        Assertions.assertEquals(1, Day13.rank("a"));
        Assertions.assertEquals(1, Day13.rank("aa"));
        Assertions.assertEquals(2, Day13.rank("acb"));
        Assertions.assertEquals(6, Day13.rank("cba"));
        Assertions.assertEquals(598, Day13.rank("string"));
    }
}
