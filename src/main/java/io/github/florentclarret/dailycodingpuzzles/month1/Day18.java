package io.github.florentclarret.dailycodingpuzzles.month1;

import java.util.Arrays;
import java.util.List;

/**
 * Sum of a Beach
 * <p>
 * Beaches are filled with sand, water, fish, and sun. Given a string, calculate how many times the words "Sand", "Water", "Fish", and "Sun" appear without overlapping (regardless of the case).
 */
public class Day18 {

    private static final List<String> WORDS = Arrays.asList("sun", "water", "fish", "sand");

    public static int sumOfABeach(String input) {
        int index = 0, max = input.length(), count = 0;
        input = input.toLowerCase();

        while (index < max) {
            boolean found = false;
            for(final String word : WORDS) {
                if(input.startsWith(word, index)) {
                    ++count;
                    found = true;
                    index = index + word.length();
                    break;
                }
            }

            if (!found) {
                ++index;
            }
        }

        return count;
    }

}
