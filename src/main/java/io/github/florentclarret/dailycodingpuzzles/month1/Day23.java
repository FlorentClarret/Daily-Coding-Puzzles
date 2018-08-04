package io.github.florentclarret.dailycodingpuzzles.month1;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Scenario
 * <p>
 * You're saying good-bye your best friend , See you next happy year .
 * <p>
 * Happy Year is the year with only distinct digits , (e.g) 2018
 * Task
 * <p>
 * Given a year, Find The next happy year or The closest year You'll see your best friend !alt !alt
 * Notes
 * <p>
 * Year Of Course always Positive .
 * Have no fear , It is guaranteed that the answer exists .
 * It's not necessary that the year passed to the function is Happy one .
 * Input Year with in range (1000  ≤  y  ≤  9000)Scenario
 * <p>
 * You're saying good-bye your best friend , See you next happy year .
 * <p>
 * Happy Year is the year with only distinct digits , (e.g) 2018
 * Task
 * <p>
 * Given a year, Find The next happy year or The closest year You'll see your best friend !alt !alt
 * Notes
 * <p>
 * Year Of Course always Positive .
 * Have no fear , It is guaranteed that the answer exists .
 * It's not necessary that the year passed to the function is Happy one .
 * Input Year with in range (1000  ≤  y  ≤  9000)
 */
public class Day23 {

    public static int nextHappyYear(int year) {
        final StringBuilder result = new StringBuilder();
        final Stack<Integer> yearDigits = new Stack<>();
        final Set<Integer> digits = new HashSet<>();
        boolean alreadyChanged = false;

        ++year; // Next year

        while(year != 0) {
            yearDigits.push(year % 10);
            year /= 10;
        }

        while(!yearDigits.isEmpty()) {
            final int currentDigit = yearDigits.pop();

            if(!alreadyChanged && digits.add(currentDigit)) {
                result.append(currentDigit);
            } else {
                int possibleDigit = alreadyChanged ? 0 : (currentDigit + 1) % 10;

                for(int i = 0; i < 10; ++i, possibleDigit = (possibleDigit + 1) % 10) {
                    if(digits.add(possibleDigit)) {
                        result.append(possibleDigit);
                        break;
                    }
                }

                alreadyChanged = true;
            }
        }

        return Integer.valueOf(result.toString());
    }
}
