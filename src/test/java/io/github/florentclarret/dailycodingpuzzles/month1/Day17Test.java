package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Day17Test {

    @Test
    public void testFind() {
        Day17.Day17Result day17Result = Day17.find(Arrays.asList(2, 4, 1, 6, 3, 4));

        Assertions.assertEquals(5, day17Result.getMissingNumber());
        Assertions.assertEquals(4, day17Result.getDuplicatedNumber());

        day17Result = Day17.find(Arrays.asList(2, 5, 1, 6, 3, 4, 8, 8));

        Assertions.assertEquals(7, day17Result.getMissingNumber());
        Assertions.assertEquals(8, day17Result.getDuplicatedNumber());
    }
}
