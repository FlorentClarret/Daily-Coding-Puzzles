package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day12Test {

    @Test
    public void testBalancedStrin() {
        Assertions.assertFalse(Day12.balancedString(null));
        Assertions.assertFalse(Day12.balancedString("(a)"));
        Assertions.assertFalse(Day12.balancedString("[(a)]"));
        Assertions.assertFalse(Day12.balancedString("[() ]"));
        Assertions.assertFalse(Day12.balancedString("[()] []"));
        Assertions.assertFalse(Day12.balancedString(")("));
        Assertions.assertFalse(Day12.balancedString("{)(}"));


        Assertions.assertTrue(Day12.balancedString(""));
        Assertions.assertTrue(Day12.balancedString("()"));
        Assertions.assertTrue(Day12.balancedString("[]"));
        Assertions.assertTrue(Day12.balancedString("{}"));
        Assertions.assertTrue(Day12.balancedString("[()][]"));
        Assertions.assertTrue(Day12.balancedString("{[()][]}"));
        Assertions.assertTrue(Day12.balancedString("{[()][]}[]"));
        Assertions.assertTrue(Day12.balancedString("(({[()][]}[]))"));
    }
}
