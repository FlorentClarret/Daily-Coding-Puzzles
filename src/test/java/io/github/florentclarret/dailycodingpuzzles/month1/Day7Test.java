package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day7Test {

    @Test
    public void testConversion(){
        Assertions.assertEquals(0, Day7.conversion(0, 0));
        Assertions.assertEquals(0, Day7.conversion(30, 30));
        Assertions.assertEquals(1, Day7.conversion(0b100000, 0b100001));
        Assertions.assertEquals(2, Day7.conversion(0b11101, 0b1111));
        Assertions.assertEquals(3, Day7.conversion(0b11000, 0b1101));
        Assertions.assertEquals(9, Day7.conversion(0b000000000, 0b111111111));
    }
}
