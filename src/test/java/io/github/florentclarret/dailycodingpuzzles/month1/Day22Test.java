package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Day22Test {

    @Test
    public void testTwoSum() {
        Assertions.assertEquals(new Day22.Day22Result(1, 4), Day22.twoSum(Arrays.asList(1, 2, 3, 4, 5, 6, 10), 5));
        Assertions.assertEquals(new Day22.Day22Result(6, 3), Day22.twoSum(Arrays.asList(1, 2, 3, 4, 5, 6, 10), 9));
        Assertions.assertEquals(new Day22.Day22Result(5, 10), Day22.twoSum(Arrays.asList(1, 2, 3, 4, 5, 6, 10), 15));
        Assertions.assertEquals(new Day22.Day22Result(1, 2), Day22.twoSum(Arrays.asList(1, 2, 3, 4, 5, 6, 10), 3));

        Assertions.assertThrows(IllegalArgumentException.class, () -> Day22.twoSum(Arrays.asList(1, 2, 3, 4, 5, 6, 10), 42));
    }
}
