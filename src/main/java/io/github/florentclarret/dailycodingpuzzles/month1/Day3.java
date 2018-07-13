package io.github.florentclarret.dailycodingpuzzles.month1;

import java.util.Arrays;

/**
 * Check if Permutation
 *
 * Checks to see if one string is a permutation of another one.
 */
public final class Day3 {

    public static boolean checkPermutation(final String s1, final String s2) {
        return sortChar(s1).equals(sortChar(s2));
    }

    private static String sortChar(final String string) {
        final char[] chars = string.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
