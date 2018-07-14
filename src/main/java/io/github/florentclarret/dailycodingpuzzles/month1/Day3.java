package io.github.florentclarret.dailycodingpuzzles.month1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Check if Permutation
 *
 * Checks to see if one string is a permutation of another one.
 */
public final class Day3 {

    private static final Map<Character, Integer> PRIME_NUMBERS_CHARS;

    static {
        PRIME_NUMBERS_CHARS = new HashMap<>();

        // TODO add other letters to be completely generic
        // TODO create this automatically from a list of chars
        // TODO handle uppercase
        // TODO handle other stuff, the point was to check that this idea was working fine, adding values is very simple
        PRIME_NUMBERS_CHARS.put('a', 2);
        PRIME_NUMBERS_CHARS.put('b', 3);
        PRIME_NUMBERS_CHARS.put('c', 5);
        PRIME_NUMBERS_CHARS.put('d', 7);
        PRIME_NUMBERS_CHARS.put('e', 11);
        PRIME_NUMBERS_CHARS.put('f', 13);
        PRIME_NUMBERS_CHARS.put('g', 17);
        PRIME_NUMBERS_CHARS.put('h', 19);
        PRIME_NUMBERS_CHARS.put('i', 23);
        PRIME_NUMBERS_CHARS.put('j', 29);
        PRIME_NUMBERS_CHARS.put('k', 31);
        PRIME_NUMBERS_CHARS.put('l', 37);
        PRIME_NUMBERS_CHARS.put('m', 41);
        PRIME_NUMBERS_CHARS.put('n', 43);
        PRIME_NUMBERS_CHARS.put('o', 47);
        PRIME_NUMBERS_CHARS.put('p', 53);
        PRIME_NUMBERS_CHARS.put('q', 59);
        PRIME_NUMBERS_CHARS.put('r', 61);
        PRIME_NUMBERS_CHARS.put('s', 67);
        PRIME_NUMBERS_CHARS.put('t', 71);
        PRIME_NUMBERS_CHARS.put('u', 73);
        PRIME_NUMBERS_CHARS.put('v', 79);
        PRIME_NUMBERS_CHARS.put('w', 83);
        PRIME_NUMBERS_CHARS.put('x', 89);
        PRIME_NUMBERS_CHARS.put('y', 97);
        PRIME_NUMBERS_CHARS.put('z', 101);
    }

    public static boolean checkPermutation(final String s1, final String s2) {
        return sortChar(s1).equals(sortChar(s2));
    }

    private static String sortChar(final String string) {
        final char[] chars = string.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    // Better version in O(n) using prime numbers
    public static boolean checkPermutation2(final String s1, final String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }

        int s1Value = 1, s2Value = 1;

        for (int index = 0; index < s1.length(); ++index) {
            s1Value = s1Value * PRIME_NUMBERS_CHARS.get(s1.charAt(index));
            s2Value = s2Value * PRIME_NUMBERS_CHARS.get(s2.charAt(index));
        }

        return s1Value == s2Value;
    }

}
