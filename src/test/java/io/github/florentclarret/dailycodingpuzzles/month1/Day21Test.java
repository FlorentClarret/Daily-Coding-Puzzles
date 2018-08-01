package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class Day21Test {

    @Test
    public void testArraySum() {
        Assertions.assertEquals(16, Day21.arraySum(Arrays.asList(
                Arrays.asList(3, 2, 1, 0),
                Arrays.asList(4, 6, 5, 3, 2),
                Arrays.asList(9, 8, 7, 4))
        ));

        Assertions.assertEquals(15, Day21.arraySum(Arrays.asList(
                Arrays.asList(3, 2),
                Arrays.asList(4, 6, 5, 3, 2),
                Arrays.asList(9, 8, 7, 4))
        ));

        Assertions.assertEquals(17, Day21.arraySum(Arrays.asList(
                Arrays.asList(3, 2, 3, 4, 2, 4),
                Arrays.asList(3, 2),
                Arrays.asList(3, 2),
                Arrays.asList(4, 6, 5, 3, 2),
                Arrays.asList(9, 8, 7, 4),
                Collections.emptyList())
        ));
    }
}
