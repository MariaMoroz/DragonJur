package utils;

import java.util.Random;

public class TestUtils {

    /**
     * Generates a random integer within the range from min to max numbers.
     * @param min The minimum value of the range (inclusive)
     * @param max The maximum value of the range (exclusive)
     * @return A random integer within the specified range
     */
    public static int getRandomInt(int min, int max) {
        Random random = new Random();

        return random.nextInt(max - min) + min;
    }
}
