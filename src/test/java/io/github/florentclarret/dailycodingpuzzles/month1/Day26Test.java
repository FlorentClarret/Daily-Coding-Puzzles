package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class Day26Test {

    @Test
    public void testIsOrdered() {
        Assert.assertTrue(Day26.isOrdered(Collections.singletonList(1)));
        Assert.assertTrue(Day26.isOrdered(Arrays.asList(1,2,3,4,5,6)));
        Assert.assertFalse(Day26.isOrdered(Arrays.asList(1,2,3,4,7,6)));
        Assert.assertFalse(Day26.isOrdered(Arrays.asList(3,2,1,50)));
    }
}
