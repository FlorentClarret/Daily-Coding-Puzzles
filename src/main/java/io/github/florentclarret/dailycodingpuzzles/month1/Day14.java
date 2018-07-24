package io.github.florentclarret.dailycodingpuzzles.month1;

import java.util.Objects;

/**
 * Diagonal Difference
 * <p>
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 */
public class Day14 {

    public static int diagonalDifference(final int[][] matrix) {
        Objects.requireNonNull(matrix, "Matrix must not be null");

        int result = 0;

        for (int index = 0; index < matrix.length; ++index) {
            if (matrix.length != Objects.requireNonNull(matrix[index], "The matrix must be square").length) {
                throw new IllegalArgumentException("The matrix must be square");
            }
            result = matrix[index][index] - matrix[index][matrix.length - 1 - index];
        }

        return Math.abs(result);
    }
}
