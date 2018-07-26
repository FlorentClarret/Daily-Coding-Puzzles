package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Day15Test {

    @Test
    public void testIsPrime() {
        Assertions.assertTrue(Day15.isPrime(2));
        Assertions.assertTrue(Day15.isPrime(3));
        Assertions.assertTrue(Day15.isPrime(5));
        Assertions.assertTrue(Day15.isPrime(7));
        Assertions.assertTrue(Day15.isPrime(11));
        Assertions.assertTrue(Day15.isPrime(53));
        Assertions.assertTrue(Day15.isPrime(73));
        Assertions.assertTrue(Day15.isPrime(83));
        Assertions.assertTrue(Day15.isPrime(101));
    }

    @Test
    public void testPrime() {
        Assertions.assertEquals(Collections.emptySet(), Day15.prime(10, 20));
        Assertions.assertEquals(new HashSet<>(Arrays.asList(2, 3, 5, 7)), Day15.prime(0, 20));
        Assertions.assertEquals(new HashSet<>(Collections.singletonList(7)), Day15.prime(6, 20));
        Assertions.assertEquals(new HashSet<>(Arrays.asList(7, 23)), Day15.prime(6, 30));
        Assertions.assertEquals(new HashSet<>(Arrays.asList(7, 23, 37)), Day15.prime(6, 50));
        Assertions.assertEquals(new HashSet<>(Arrays.asList(257, 2, 3, 5, 773, 7, 523, 3727, 277, 3733, 7573, 23,
                5527, 5273, 7577, 2333, 37, 7333, 7723, 3373, 557, 7727, 2357, 3253, 53, 5557, 3257, 2237, 2753, 577,
                5573, 7237, 3527, 2377, 73, 7753, 5323, 3533, 7757, 337, 5333, 7253, 727, 2777, 733, 223, 2273, 353,
                227, 7523, 3557, 233, 5737, 5227, 5233, 7537, 373, 5237, 757, 3323, 2557)), Day15.prime(0, 20000));
    }
}
