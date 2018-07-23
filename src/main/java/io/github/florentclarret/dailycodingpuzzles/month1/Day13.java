package io.github.florentclarret.dailycodingpuzzles.month1;

/**
 * Lexicographic rank of a string
 * <p>
 * Given a string, find its rank among all its permutations sorted lexicographically. For example, rank of “abc” is 1,
 * rank of “acb” is 2, and rank of “cba” is 6.
 */
public class Day13 {

    // We could cache the value to make it faster
    public static int factorial(final int input) {
        if (input <= 1) {
            return 1;
        }

        int result = 1;

        for(int i = 1; i <= input; ++i) {
            result = i * result;
        }

        return result;
    }

    public static int rank(final String input) {
        if(input == null) {
            return 0;
        }

        int result = 1;

        for (int currentCharIndex = 0, max = input.length(); currentCharIndex < max; ++currentCharIndex) {
            final char currentChar = input.charAt(currentCharIndex);
            int higherCharCount = 0;

            for(int rightCharIndex = currentCharIndex + 1; rightCharIndex < max; ++rightCharIndex){
                if (currentChar > input.charAt(rightCharIndex)) {
                    higherCharCount++;
                }
            }

            result = result + higherCharCount * factorial(input.length() - currentCharIndex - 1);
        }

        return result;
    }
}
