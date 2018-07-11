package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.github.florentclarret.dailycodingpuzzles.month1.Day1.evenFibonacciNumbers;

public class Day1Test {

    @Test
    public void testEvenFibonacciNumbers() {
        Assertions.assertEquals(0, evenFibonacciNumbers(0));
        Assertions.assertEquals(0, evenFibonacciNumbers(1));
        Assertions.assertEquals(2, evenFibonacciNumbers(2));
        Assertions.assertEquals(2, evenFibonacciNumbers(3));
        Assertions.assertEquals(10, evenFibonacciNumbers(6));
        Assertions.assertEquals(44, evenFibonacciNumbers(9));
        Assertions.assertEquals(44, evenFibonacciNumbers(10));
    }
}
