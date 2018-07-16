package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day6Test {

    @Test
    public void testFlipBitToWin() {
        Assertions.assertEquals(0, Day6.flipBitToWin(0));
        Assertions.assertEquals(2, Day6.flipBitToWin(0b1));
        Assertions.assertEquals(2, Day6.flipBitToWin(0b10));
        Assertions.assertEquals(3, Day6.flipBitToWin(0b11));
        Assertions.assertEquals(3, Day6.flipBitToWin(0b11001));
        Assertions.assertEquals(8, Day6.flipBitToWin(0b11011101111));
        Assertions.assertEquals(11, Day6.flipBitToWin(0b1111111011101111));
        Assertions.assertEquals(10, Day6.flipBitToWin(0b100111111011101111));
    }
}
