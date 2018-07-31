package io.github.florentclarret.dailycodingpuzzles.month1;

import java.util.HashMap;
import java.util.Map;

/**
 * Convert roman number to int
 */
public class Day20 {

    private static final Map<String, Integer> MAP;

    static {
        MAP = new HashMap<>();
        MAP.put("M", 1000);
        MAP.put("CM", 900);
        MAP.put("D", 500);
        MAP.put("CD", 400);
        MAP.put("C", 100);
        MAP.put("XC", 90);
        MAP.put("L", 50);
        MAP.put("XL", 40);
        MAP.put("X", 10);
        MAP.put("IX", 9);
        MAP.put("V", 5);
        MAP.put("IV", 4);
        MAP.put("I", 1);
    }

    public static int romanNumberToInt(final String romanNumber) {
        int result = 0;
        int index = 0, max = romanNumber.length();

        do {
            String currentDigit;

            if(index + 2 <= max) {
                currentDigit = romanNumber.substring(index, index + 2);
                final Integer value = MAP.get(currentDigit);
                if(value != null) {
                    result = result + value;
                    index = index + 2;
                    continue;
                }
            }

            currentDigit = romanNumber.substring(index, index + 1);
            final Integer value = MAP.get(currentDigit);
            result = result + value;
            ++index;
        } while (index < max);

        return result;
    }
}
