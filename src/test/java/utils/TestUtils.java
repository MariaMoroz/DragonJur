package utils;

import java.util.List;
import java.util.Random;

public class TestUtils {

    public static  <T> T getRandomValue(List<T> listValues) {
        Random random = new Random();

        return listValues.get(random.nextInt(listValues.size()));
    }

    public static int getRandomInt(int min, int max) {
        Random random = new Random();

        return random.nextInt(max - min) + min;
    }
}
