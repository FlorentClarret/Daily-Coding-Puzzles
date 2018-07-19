package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class Day9Test {

    @TestFactory
    public Stream<DynamicTest> testTripleStep() {
        final Map<String, Function<Integer, Integer>> functions = new HashMap<>();

        functions.put("tripleStepRecursion", Day9::tripleStepRecursion);
        functions.put("tripleStep", Day9::tripleStep);
        functions.put("tripleStepWithBigArray", Day9::tripleStepWithBigArray);

        return functions.entrySet().stream().map(element -> DynamicTest.dynamicTest(element.getKey(), () -> {
            Assertions.assertEquals(0, element.getValue().apply(-1).intValue());
            Assertions.assertEquals(1, element.getValue().apply(0).intValue());
            Assertions.assertEquals(1, element.getValue().apply(1).intValue());
            Assertions.assertEquals(2, element.getValue().apply(2).intValue());
            Assertions.assertEquals(4, element.getValue().apply(3).intValue());
            Assertions.assertEquals(7, element.getValue().apply(4).intValue());
        }));
    }
}
