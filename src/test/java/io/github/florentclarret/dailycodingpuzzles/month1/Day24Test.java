package io.github.florentclarret.dailycodingpuzzles.month1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day24Test {

    @Test
    public void testCreateTrie() {
        Assertions.assertEquals("{ h -> { e -> { l -> { l -> { o -> { }}}}}}", new Day24.PrefixTree("hello").toString());
        Assertions.assertEquals("{ h -> { e -> { l -> { l -> { o -> { }}}}}, w -> { o -> { r -> { l -> { d -> { }}}}}}", new Day24.PrefixTree("hello").addElement("world").toString());
        Assertions.assertEquals("{ h -> { e -> { l -> { l -> { o -> { }}}}, o -> { b -> { b -> { i -> { t -> { }}}}}}}", new Day24.PrefixTree("hello").addElement("hobbit").toString());
    }
}
