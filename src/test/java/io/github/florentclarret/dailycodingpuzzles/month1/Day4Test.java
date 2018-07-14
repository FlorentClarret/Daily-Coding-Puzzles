package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class Day4Test {

    @Test
    public void testPrimeFactors() {
        Assertions.assertEquals(Collections.singletonList(2), Day4.primeFactors(2));
        Assertions.assertEquals(Collections.singletonList(3), Day4.primeFactors(3));
        Assertions.assertEquals(Arrays.asList(2, 3), Day4.primeFactors(6));
        Assertions.assertEquals(Arrays.asList(2, 2, 3), Day4.primeFactors(12));
        Assertions.assertEquals(Collections.singletonList(13), Day4.primeFactors(13));
        Assertions.assertEquals(Arrays.asList(2, 7), Day4.primeFactors(14));
        Assertions.assertEquals(Arrays.asList(2, 5, 5), Day4.primeFactors(50));
    }
}
