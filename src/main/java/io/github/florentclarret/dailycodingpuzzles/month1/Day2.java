package io.github.florentclarret.dailycodingpuzzles.month1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/**
 * Find the Odd Int
 *
 * Given an array, find the int that appears an odd number of times.
 *
 * TODO : I just wanted to avoid parsing the collection two times. Not sure that's very clever, I will test it with
 * JMH
 */
public final class Day2 {

    public static Collection<Integer> oddInt(final Collection<Integer> collection) {
        if (collection == null) {
            return Collections.emptySet();
        }

        final Collection<Integer> result = new HashSet<>(collection.size());

        for (final Integer integer : collection) {
            if (result.contains(integer)) {
                result.remove(integer);
            } else {
                result.add(integer);
            }
        }

        return result;
    }
}
