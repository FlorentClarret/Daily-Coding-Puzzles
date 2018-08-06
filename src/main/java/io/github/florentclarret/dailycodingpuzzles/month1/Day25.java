package io.github.florentclarret.dailycodingpuzzles.month1;

import java.util.ArrayList;
import java.util.List;

/**
 * Complete the function which get an input number n such that n > 100 and n < 10000, then:
 *
 *     Sum all the digits of n.
 *     Subtract the sum from n, and it is your new n.
 *     If the new n is in the list below return the associated fruit, otherwise return back to task 1.
 *
 * Example
 *
 * n = 325
 * sum = 3+2+5 = 10
 * n = 325-10 = 315 (not in the list)
 * sum = 3+1+5 = 9
 * n = 315-9 = 306 (not in the list)
 * sum = 3+0+6 = 9
 * n =306-9 = 297 (not in the list)
 * .
 * .
 * .
 * ...until you find the first n in the list below.
 */
public class Day25 {

    private static final List<String> FRUITS;

    static {
        FRUITS = new ArrayList<>();
        FRUITS.add("kiwi");
        FRUITS.add("pear");
        FRUITS.add("kiwi");
        FRUITS.add("banana");
        FRUITS.add("melon");
        FRUITS.add("banana");
        FRUITS.add("melon");
        FRUITS.add("pineapple");
        FRUITS.add("apple");
        FRUITS.add("pineapple");
        FRUITS.add("cucumber");
        FRUITS.add("pineapple");
        FRUITS.add("cucumber");
        FRUITS.add("orange");
        FRUITS.add("grape");
        FRUITS.add("orange");
        FRUITS.add("grape");
        FRUITS.add("apple");
        FRUITS.add("grape");
        FRUITS.add("cherry");
        FRUITS.add("pear");
        FRUITS.add("cherry");
        FRUITS.add("pear");
        FRUITS.add("kiwi");
        FRUITS.add("banana");
        FRUITS.add("kiwi");
        FRUITS.add("apple");
        FRUITS.add("melon");
        FRUITS.add("banana");
        FRUITS.add("melon");
        FRUITS.add("pineapple");
        FRUITS.add("melon");
        FRUITS.add("pineapple");
        FRUITS.add("cucumber");
        FRUITS.add("orange");
        FRUITS.add("apple");
        FRUITS.add("orange");
        FRUITS.add("grape");
        FRUITS.add("orange");
        FRUITS.add("grape");
        FRUITS.add("cherry");
        FRUITS.add("pear");
        FRUITS.add("cherry");
        FRUITS.add("pear");
        FRUITS.add("apple");
        FRUITS.add("pear");
        FRUITS.add("kiwi");
        FRUITS.add("banana");
        FRUITS.add("kiwi");
        FRUITS.add("banana");
        FRUITS.add("melon");
        FRUITS.add("pineapple");
        FRUITS.add("melon");
        FRUITS.add("apple");
        FRUITS.add("cucumber");
        FRUITS.add("pineapple");
        FRUITS.add("cucumber");
        FRUITS.add("orange");
        FRUITS.add("cucumber");
        FRUITS.add("orange");
        FRUITS.add("grape");
        FRUITS.add("cherry");
        FRUITS.add("apple");
        FRUITS.add("cherry");
        FRUITS.add("pear");
        FRUITS.add("cherry");
        FRUITS.add("pear");
        FRUITS.add("kiwi");
        FRUITS.add("pear");
        FRUITS.add("kiwi");
        FRUITS.add("banana");
        FRUITS.add("apple");
        FRUITS.add("banana");
        FRUITS.add("melon");
        FRUITS.add("pineapple");
        FRUITS.add("melon");
        FRUITS.add("pineapple");
        FRUITS.add("cucumber");
        FRUITS.add("pineapple");
        FRUITS.add("cucumber");
        FRUITS.add("apple");
        FRUITS.add("grape");
        FRUITS.add("orange");
        FRUITS.add("grape");
        FRUITS.add("cherry");
        FRUITS.add("grape");
        FRUITS.add("cherry");
        FRUITS.add("pear");
        FRUITS.add("cherry");
        FRUITS.add("apple");
        FRUITS.add("kiwi");
        FRUITS.add("banana");
        FRUITS.add("kiwi");
        FRUITS.add("banana");
        FRUITS.add("melon");
        FRUITS.add("banana");
        FRUITS.add("melon");
        FRUITS.add("pineapple");
        FRUITS.add("apple");
        FRUITS.add("pineapple");
    }

    public static String substractTheSum(final int n) {
        // The substracting will always be divisible by 9
        // Just put it on paper and think
        return "apple";
    }
}
