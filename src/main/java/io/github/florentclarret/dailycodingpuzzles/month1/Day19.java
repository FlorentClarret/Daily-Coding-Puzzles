package io.github.florentclarret.dailycodingpuzzles.month1;

import java.util.TreeMap;

/**
 * Convert int to roman number
 */
public class Day19 {

    private static final TreeMap<Integer, String> MAP;

    static {
        MAP = new TreeMap<>();
        MAP.put(1000, "M");
        MAP.put(900, "CM");
        MAP.put(500, "D");
        MAP.put(400, "CD");
        MAP.put(100, "C");
        MAP.put(90, "XC");
        MAP.put(50, "L");
        MAP.put(40, "XL");
        MAP.put(10, "X");
        MAP.put(9, "IX");
        MAP.put(5, "V");
        MAP.put(4, "IV");
        MAP.put(1, "I");
    }

    public static String intToRomanNumber(int number) {
        final StringBuilder builder = new StringBuilder();

        do {
            int currentValue = MAP.floorKey(number);
            builder.append(MAP.get(currentValue));
            number = number - currentValue;
        } while (number > 0);

        return builder.toString();
    }
}
