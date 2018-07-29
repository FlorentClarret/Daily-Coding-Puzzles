package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day18Test {

    @Test
    public void testSumOfABeach() {
        Assertions.assertEquals(1, Day18.sumOfABeach("WAtErSlIde"));
        Assertions.assertEquals(3, Day18.sumOfABeach("GolDeNSanDyWateRyBeaChSuNN"));
        Assertions.assertEquals(4, Day18.sumOfABeach("gOfIshsunesunFiSh"));
        Assertions.assertEquals(0, Day18.sumOfABeach("cItYTowNcARShoW"));
    }
}
