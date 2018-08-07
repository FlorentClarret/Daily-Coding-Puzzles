package io.github.florentclarret.dailycodingpuzzles.month1;

import java.util.List;

/**
 * Are the numbers in order?
 *
 * In this Kata, your function receives an array of integers as input. Your task is to determine whether the numbers are in ascending order. An array is said to be in ascending order if there are no two adjacent integers where the left integer exceeds the right integer in value.
 */
public class Day26 {

    public static <T extends Comparable<T>> boolean isOrdered(final List<T> list) {
        for(int i = 0, max = list.size() - 1; i < max; ++i) {
            if(list.get(i).compareTo(list.get(i+1)) >= 0) {
                return false;
            }
        }

        return true;
    }
}
