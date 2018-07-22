package io.github.florentclarret.dailycodingpuzzles.month1;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.Stack;

/**
 * Balanced strings
 * <p>
 * A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B
 * are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.
 * <p>
 * Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
 * <p>
 * Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
 * <p>
 * Given a string, determine if it is balanced or not.
 */
public class Day12 {

    private static final BiMap<Character, Character> VALID_CHARS;

    static {
        VALID_CHARS = HashBiMap.create(3);
        VALID_CHARS.put('{', '}');
        VALID_CHARS.put('(', ')');
        VALID_CHARS.put('[', ']');
    }

    public static boolean balancedString(final String input) {
        if (input == null || input.length() % 2 != 0) {
            return false;
        }

        final Stack<Character> charStack = new Stack<>();

        for (final char currentChar : input.toCharArray()) {
            final Character endChar = VALID_CHARS.get(currentChar);

            if (endChar != null) { // It's supposed to be the beginning of a pattern
                charStack.push(currentChar);
            } else {
                final Character beginChar = VALID_CHARS.inverse().get(currentChar);
                if(beginChar == null || (!charStack.isEmpty() && !charStack.pop().equals(beginChar))) {
                    return false;
                }
            }
        }

        return charStack.isEmpty();
    }
}
