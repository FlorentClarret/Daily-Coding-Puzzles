package io.github.florentclarret.dailycodingpuzzles.month1;

import org.apache.commons.collections.CollectionUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class Day2Test {

    @Test
    public void oddIntTest() {
        Assertions.assertTrue(Day2.oddInt(null).isEmpty());
        Assertions.assertTrue(Day2.oddInt(Collections.emptyList()).isEmpty());
        Assertions.assertTrue(CollectionUtils.isEqualCollection(Arrays.asList(1,2,3), Day2.oddInt(Arrays.asList(1,1,
                1,2,3,1,1))));
        Assertions.assertTrue(CollectionUtils.isEqualCollection(Arrays.asList(1), Day2.oddInt(Arrays.asList(1,1,
                1,1,1))));
        Assertions.assertTrue(CollectionUtils.isEqualCollection(Arrays.asList(1), Day2.oddInt(Arrays.asList(1,1,
                1,1,1,2,2,3,3,2,3,2,3))));
    }
}
