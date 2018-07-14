package io.github.florentclarret.dailycodingpuzzles.month1;

import java.util.ArrayList;
import java.util.List;

/**
 * Prime factors
 *
 * find all the prime factor of a number
 */
public final class Day4 {

    public static List<Integer> primeFactors(int number) {
        final List<Integer> result = new ArrayList<>();

        for (int i = 2; i <= number / i; i++) {
            while (number % i == 0) {
                result.add(i);
                number /= i;
            }
        }

        if (number > 1) {
            result.add(number);
        }

        return result;
    }
}
