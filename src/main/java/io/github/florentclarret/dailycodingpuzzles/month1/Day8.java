package io.github.florentclarret.dailycodingpuzzles.month1;

/**
 * Pairwise Swap
 *
 * Write a program to swap odd and even bits in an integer with as few instructions as possible
 * (e.g., bit 13 and bit 1 are swapped, bit 2 and bit 3 are swapped, and so on).
 */
public class Day8 {

    public static int swap(final int input) {
        return ((input & 0xAAAAAAAA) >> 1) | ((input & 0x55555555) << 1);
    }

}
