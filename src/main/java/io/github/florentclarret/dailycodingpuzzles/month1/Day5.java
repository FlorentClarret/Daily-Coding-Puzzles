package io.github.florentclarret.dailycodingpuzzles.month1;

/**
 * String Compression
 *
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2b1c5a3.
 * If the "compressed" string would not become smaller than the original string,
 * your method should return the original string.
 * You can assume the string has only uppercase and lowercase letters (a - z).
 */
public class Day5 {

    public static String compress(final String input) {
        final StringBuilder builder = new StringBuilder(input.length());
        int currentIndex = 0;

        while (currentIndex < input.length()) {
            int charIndex = currentIndex + 1;

            while(charIndex < input.length() && input.charAt(currentIndex) == input.charAt(charIndex)) {
                ++charIndex;
            }

            builder.append(input.charAt(currentIndex))
                    .append(charIndex - currentIndex);
            currentIndex = charIndex;

            if(builder.length() >= input.length()) {
                return input;
            }
        }

        return builder.toString();
    }
}
