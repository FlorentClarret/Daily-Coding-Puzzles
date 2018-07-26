package io.github.florentclarret.dailycodingpuzzles.month1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * You are given two positive integers a and b (a < b <= 20000). Complete the function which returns a list of all those
 * numbers in the interval [a, b) whose digits are made up of prime numbers (2, 3, 5, 7) but which are not primes
 * themselves.
 */
public class Day15 {

    private static final String[] PRIME = new String[]{ "2", "3", "5", "7" };

    public static final boolean isPrime(final int number) {
        if (number < 2) {
            return false;
        } else if (number == 2 || number == 3) {
            return true;
        } else if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (long i = 6, max = (long) Math.sqrt(number) + 1; i <= max; i += 6) {
            if (number % (i - 1) == 0 || number % (i + 1) == 0) {
                return false;
            }
        }

        return true;
    }

    // I put the set in parameter to avoid creating one for each call
    // Optim : we test all values, and some several times (like 1111 for example)
    // Optim : We can stop recursion before if we check the current value
    private static void recursivePrime(final int min, final int max, final int depth, final String[] array,
                                               final String inputString, final Set<Integer> result) {
        if(depth < 0) {
            return;
        }

        for (int i = 0; i < array.length; ++i) {
            final int currentValue = Integer.valueOf(inputString + array[i]);
            if (currentValue >= min && currentValue <= max && Day15.isPrime(currentValue)) {
                result.add(currentValue);
            }

            recursivePrime(min, max, depth - 1, array, inputString + array[i], result);
        }
    }

    public static Set<Integer> prime(final int min, final int max) {
        final Set<Integer> result = new HashSet<>();
        recursivePrime(min, max, PRIME.length, PRIME, "", result);
        return result;
    }
}
