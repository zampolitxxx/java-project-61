package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static int getGameNumber(String[][] games) {
        int choice = 0;
        System.out.println("Please enter the game number and press Enter.");
        //show list of the games
        for (int i = 1; i < games.length; i++) {
            System.out.printf("%d - %s\n", i, games[i][1]);
        }
        System.out.println("0 - Exit");
        //end section of list games
        return Engine.getNumber("Your choice: ");
    }
    public static String getName(String question) {
        System.out.println(question);
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //sc.close();
        return str;
    }
    public static String getStr(String question) {
        System.out.print(question);
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //sc.close();
        return str;
    }
    public static int getNumber(String question) {
        System.out.print(question);
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //sc.close();
        return number;
    }

    public static void announceTheResult(String message) {
            System.out.println(message);
    }
    public static int getGCD(int a, int b) {
        int remainder = 0;
        int smallerNumber = a;
        int largerNumber = b;
        if (a >= b) {
            smallerNumber = b;
            largerNumber = a;
        }
        do {
            remainder = largerNumber % smallerNumber;
            largerNumber = smallerNumber;
            smallerNumber = remainder;
        } while (remainder != 0);
        return largerNumber;
    }
    public static int[] getProgression(String mode, int progressionLength) {
        int[] progressionNumbers = new int[progressionLength];
        for (int i = 0; i < progressionLength; i++) {
            progressionNumbers[i] = i;
        }
        return progressionNumbers;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
