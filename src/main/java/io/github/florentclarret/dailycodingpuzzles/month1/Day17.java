package io.github.florentclarret.dailycodingpuzzles.month1;

import java.util.List;

/**
 * You are given an array containing all integers from 1 to N, except one that is missing.
 * <p>
 * In order to fill the array, one of the elements of the sequence has been duplicated.
 * <p>
 * Your mission is to find which number is missing and which one is duplicated.
 * <p>
 * Example:
 * <p>
 * solution([2,4,1,6,3,4]) should return [5,4] because 5 is missing and 4 appears twice.
 * <p>
 * Remarks:
 * <p>
 * You are not allowed to sort the array. Your solution should not time out for large values of N. Ideally, your
 * solution should not use extra space except the one provided by the input array (which can be modified).
 */
public class Day17 {

    public static Day17Result find(final List<Integer> list) {
        int missingNumber = (list.size() * (list.size() + 1)) / 2;
        int duplicatedNumber = 0;

        for (int i = 0, max = list.size(); i < max; ++i) {
            missingNumber = missingNumber - list.get(i);

            for (int j = i + 1; j < max && duplicatedNumber == 0; ++j) {
                if (list.get(i).equals(list.get(j))) {
                    duplicatedNumber = list.get(i);
                    break;
                }
            }
        }

        return new Day17Result(missingNumber + duplicatedNumber, duplicatedNumber);
    }


    public static final class Day17Result {
        private final int missingNumber;

        private final int duplicatedNumber;

        public Day17Result(final int missingNumber, final int duplicatedNumber) {
            this.missingNumber = missingNumber;
            this.duplicatedNumber = duplicatedNumber;
        }

        public int getMissingNumber() {
            return missingNumber;
        }

        public int getDuplicatedNumber() {
            return duplicatedNumber;
        }
    }
}
