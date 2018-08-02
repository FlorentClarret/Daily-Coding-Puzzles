package io.github.florentclarret.dailycodingpuzzles.month1;

import java.util.List;

/**
 * Two Sum
 * <p>
 * Write a function that takes an array of numbers and a target number. It should find two different items in the array that, when added together, give the target value
 */
public class Day22 {

    public static Day22Result twoSum(final List<Integer> list, final int target) {

        for (int i = 0, max = list.size(); i < max; ++i) {
            for (int j = i + 1; j < max; ++j) {
                int a = list.get(i), b = list.get(j);
                if (a + b == target) {
                    return new Day22Result(a, b);
                }
            }
        }

        throw new IllegalArgumentException("no solution");
    }

    public static final class Day22Result {
        private final int value1, value2;

        public Day22Result(final int value1, final int value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        public int getValue1() {
            return value1;
        }

        public int getValue2() {
            return value2;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            final Day22Result that = (Day22Result) o;

            return (value1 == that.value1 && value2 == that.value2) || (value1 == that.value2 && value2 == that.value1);
        }

        @Override
        public int hashCode() {
            int result = value1;
            result = 31 * result + value2;
            return result;
        }

        @Override
        public String toString() {
            return "Day22Result{" +
                    "value1=" + value1 +
                    ", value2=" + value2 +
                    '}';
        }
    }
}
