package io.github.florentclarret.dailycodingpuzzles.month1;

/**
 * Recursive Multiply
 *
 * Write a recursive function to multiply two positive integers without using the * operator.
 * You can use addition, subtraction, and bit shifting, but you should minimize the number of those operations.
 */
public class Day10 {

    public static int recursiveMultiply(final int x, final int y) {
        return y == 0 ? 0 : x + recursiveMultiply(x, y - 1);
    }
}
