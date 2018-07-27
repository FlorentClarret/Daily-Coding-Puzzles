package io.github.florentclarret.dailycodingpuzzles.month1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Mexican Wave
 * <p>
 * 1.  The input string will always be lower case but maybe empty.
 * <p>
 * 2.  If the character in the string is whitespace then pass over it as if it was an empty seat.
 */
public class Day16 {

    public static List<String> mexicanWave(final String seed) {
        if (seed == null || seed.length() == 0) {
            return Collections.emptyList();
        }

        final List<String> wave = new ArrayList<>(seed.length());
        final char[] array = seed.toCharArray();

        for (int index = 0, max = seed.length(); index < max; ++index) {
            final char currentChar = array[index];
            array[index] = Character.toUpperCase(array[index]);
            wave.add(new String(array));
            array[index] = currentChar;
        }

        return wave;
    }
}
