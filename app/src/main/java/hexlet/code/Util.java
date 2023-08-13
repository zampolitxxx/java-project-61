package hexlet.code;

public class Util {

    private static int minRandom = 0;

//    generates values from minRandom to maxRandom
    public static int getRandom(int maxRandom, int minRandom) {
        int randomNumber = (int) (Math.random() * (maxRandom - minRandom) + minRandom);
        return randomNumber;
    }

//    generates values from zero to maxRandom
    public static int getRandom(int maxRandom) {
        int randomNumber = (int) (Math.random() * (maxRandom - minRandom) + minRandom);
        return randomNumber;
    }
}
