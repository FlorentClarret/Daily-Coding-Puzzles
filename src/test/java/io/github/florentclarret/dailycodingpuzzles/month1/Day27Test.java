package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Day27Test {
    @TestFactory
    public Stream<DynamicTest> testGetStatuses() throws IOException {
        final Map<String, String> map = new HashMap<>();

        map.put("[{\"username\":\"David\",\"status\":\"online\",\"lastActivity\":10},{\"username\":\"Lucy\",\"status\":\"offline\",\"lastActivity\": 22},{\"username\":\"Bob\",\"status\":\"online\",\"lastActivity\":104}]", "{\"away\":[\"Bob\"],\"offline\":[\"Lucy\"],\"online\":[\"David\"]}");
        map.put("[{\"username\":\"David\",\"status\":\"offline\",\"lastActivity\":10},{\"username\":\"Lucy\",\"status\":\"offline\",\"lastActivity\": 22},{\"username\":\"Bob\",\"status\":\"online\",\"lastActivity\":104}]", "{\"away\":[\"Bob\"],\"offline\":[\"David\",\"Lucy\"],\"online\":[]}");
        map.put("[{\"username\":\"David\",\"status\":\"offline\",\"lastActivity\":10},{\"username\":\"Lucy\",\"status\":\"offline\",\"lastActivity\": 22},{\"username\":\"Bob\",\"status\":\"offline\",\"lastActivity\":104}]", "{\"away\":[],\"offline\":[\"David\",\"Lucy\",\"Bob\"],\"online\":[]}");

        return map.entrySet().stream().map(element ->
            DynamicTest.dynamicTest(element.getKey(), () -> Assertions.assertEquals(element.getValue(), Day27.getStatuses(element.getKey()))));
    }
}
