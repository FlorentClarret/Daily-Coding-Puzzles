package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day14Test {

    @Test
    public void testDiagonalDifference() {
        Assertions.assertEquals(2, Day14.diagonalDifference(new int[][]{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }));
        Assertions.assertEquals(7, Day14.diagonalDifference(new int[][]{ { 3, 2, 3 }, { 4, 3, 6 }, { 2, 6, 9 } }));
    }
}
