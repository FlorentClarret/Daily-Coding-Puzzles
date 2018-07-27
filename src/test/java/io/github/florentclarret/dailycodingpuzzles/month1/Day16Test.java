package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.Collections;

public class Day16Test {

    @Test
    public void testMexicanWave() {
        Assertions.assertEquals(Collections.EMPTY_LIST, Day16.mexicanWave(null));
        Assertions.assertEquals(Collections.EMPTY_LIST, Day16.mexicanWave(""));
        Assertions.assertEquals(Collections.singletonList("A"), Day16.mexicanWave("a"));
        Assertions.assertEquals(Arrays.asList("Hello", "hEllo", "heLlo", "helLo", "hellO"), Day16.mexicanWave("hello"));
    }

}
