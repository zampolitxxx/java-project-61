package hexlet.code;

public class Util {

    //    generates values from minRandom to maxRandom
    public static int getRandom(int maxRandom, int minRandom) {
        return (int) (Math.random() * (maxRandom - minRandom) + minRandom);
    }

//    generates values from zero to maxRandom
    public static int getRandom(int maxRandom) {
        int minRandom = 0;
        return getRandom(maxRandom, minRandom);
    }
}
