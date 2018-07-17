package io.github.florentclarret.dailycodingpuzzles.month1;

/**
 * Conversion
 *
 * Write a function to determine the number of bits you would need to flip to convert integer A to integer B.
 *
 * Example : Input: 29 (or: 11101), 15 (or: 01111) Output: 2
 */
public class Day7 {

    public static int conversion(final int a, final int b) {
        if (a == b) {
            return 0;
        }

        int xor = a ^ b;
        int result = 0;

        while (xor != 0) {
            if((xor & 1) == 1) {
                ++result;
            }
            xor = xor >> 1;
        }

        return result;
    }
}
