package io.github.florentclarret.dailycodingpuzzles.month1;

/**
 * Flip Bit to Win
 *
 * You have an integer and you can flip exactly one bit from a 13 to a 1.
 * Write code to find the length of the longest sequence of ls you could create.
 *
 * EXAMPLE
 * Input: 1775 ( o r : 11011101111)
 * Output: 8
 */
public class Day6 {
    public static int flipBitToWin(final int input) {
        int currentCount = 0;
        int maxCount = 0;
        int oneSinceLastFlipped = 0;

        for (int currentPosition = 0; currentPosition < 32; ++currentPosition) {
            final int currentBit = 1 << currentPosition;

            if (currentBit > (input << 1)) { // In this case, no need to go any further, no more 1 to do
                return maxCount;
            }

            // It's a 1 !
            if ((currentBit & input) != 0) {
                ++currentCount;
                ++oneSinceLastFlipped;
            } else { // It's a 0 :( Flip it !
                currentCount = oneSinceLastFlipped + 1;
                oneSinceLastFlipped = 0;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }

        return maxCount;
    }
}
