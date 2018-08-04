package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day23Test {

    @Test
    public void testNextHappyYear() {
        Assertions.assertEquals(7801, Day23.nextHappyYear(7712));
        Assertions.assertEquals(23, Day23.nextHappyYear(22));
        Assertions.assertEquals(8901, Day23.nextHappyYear(8800));
        Assertions.assertEquals(8901, Day23.nextHappyYear(8810));
        Assertions.assertEquals(340, Day23.nextHappyYear(333));
        Assertions.assertEquals(345, Day23.nextHappyYear(343));
        Assertions.assertEquals(346, Day23.nextHappyYear(345));
    }
}
