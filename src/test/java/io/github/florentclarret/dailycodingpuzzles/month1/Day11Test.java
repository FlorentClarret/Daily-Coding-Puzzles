package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Day11Test {

    @Test
    public void testClimb(){
        final List<Integer> leaderboard = Arrays.asList(100, 100, 50, 40, 40, 20, 10);

        Assert.assertEquals(Arrays.asList(6,4,2,1), Day11.climb(leaderboard, Arrays.asList(5, 25, 50, 120)));
        Assert.assertEquals(Arrays.asList(1,2,4,6), Day11.climb(leaderboard, Arrays.asList(120, 50, 25, 5)));
        Assert.assertEquals(Arrays.asList(1,2,4), Day11.climb(leaderboard, Arrays.asList(120, 50, 25)));
        Assert.assertEquals(Arrays.asList(1,2,3), Day11.climb(leaderboard, Arrays.asList(120, 50, 45)));
    }
}
