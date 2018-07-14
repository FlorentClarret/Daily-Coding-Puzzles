package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day3Test {

    @Test
    public void testCheckPermutation() {
        Assertions.assertTrue(Day3.checkPermutation("", ""));
        Assertions.assertTrue(Day3.checkPermutation("a", "a"));
        Assertions.assertTrue(Day3.checkPermutation("toto", "toto"));
        Assertions.assertTrue(Day3.checkPermutation("abcd", "dbac"));
        Assertions.assertTrue(Day3.checkPermutation("abcd", "dcba"));

        Assertions.assertFalse(Day3.checkPermutation("abcd", "dcbaa"));
        Assertions.assertFalse(Day3.checkPermutation("abcd", ""));
    }

    @Test
    public void testCheckPermutation2() {
        Assertions.assertTrue(Day3.checkPermutation2("", ""));
        Assertions.assertTrue(Day3.checkPermutation2("a", "a"));
        Assertions.assertTrue(Day3.checkPermutation2("toto", "toto"));
        Assertions.assertTrue(Day3.checkPermutation2("abcd", "dbac"));
        Assertions.assertTrue(Day3.checkPermutation2("abcd", "dcba"));

        Assertions.assertFalse(Day3.checkPermutation2("abcd", "dcbaa"));
        Assertions.assertFalse(Day3.checkPermutation2("abcd", ""));
    }
}
