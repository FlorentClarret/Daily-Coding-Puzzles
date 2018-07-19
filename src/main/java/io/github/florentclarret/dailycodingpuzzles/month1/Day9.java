package io.github.florentclarret.dailycodingpuzzles.month1;

/**
 * Triple Step
 * <p>
 * A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time. Implement a
 * method to count how many possible ways the child can run up the stairs.
 */
public class Day9 {

    public static int tripleStep(final int n) {
        if (n < 0) {
            return 0;
        }

        final int[] stepBuffer = new int[]{ 1, 1, 2, -1 }; // -1 is going to be erased on the first loop iteration

        for (int i = 3, max = n + 1; i < max; ++i) {
            stepBuffer[i % 4] = stepBuffer[(i - 1) % 4] + stepBuffer[(i - 2) % 4] + stepBuffer[(i - 3) % 4];
        }

        return stepBuffer[n % 4];
    }

    public static int tripleStepWithBigArray(final int n) {
        if (n < 0) {
            return 0;
        } else if (n < 2) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        final int[] stepBuffer = new int[n + 1];
        stepBuffer[0] = 1;
        stepBuffer[1] = 1;
        stepBuffer[2] = 2;

        for (int i = 3, max = n + 1; i < max; ++i) {
            stepBuffer[i] = stepBuffer[i - 1] + stepBuffer[i - 2] + stepBuffer[i - 3];
        }

        return stepBuffer[n];
    }

    public static int tripleStepRecursion(final int n) {
        if (n < 0) {
            return 0;
        } else if (n < 2) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        return tripleStepRecursion(n - 1) + tripleStepRecursion(n - 2) + tripleStepRecursion(n - 3);
    }
}
