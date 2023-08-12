package hexlet.code;

public class Util {
    private static int minRandom = 0;
    public static int getRandom(int maxRandom) {
        int randomNumber = 1 + (int) (Math.random() * (maxRandom - minRandom) + minRandom);
        return randomNumber;
    }
}
