package hexlet.code;

public class Util {
    //    generates values from minRandom to maxRandom
    public static int getRandom(int maxRandom, int minRandom) {
        return (int) (Math.random() * (maxRandom - minRandom) + minRandom);
    }

    public static int calculate(int firstNumber, int sign, int secondNumber) {
        switch (sign) {
            case 0:
                return firstNumber + secondNumber;
            case 1:
                return firstNumber - secondNumber;
            case 2:
                return firstNumber * secondNumber;
            default: return 0;
        }
    }
}
