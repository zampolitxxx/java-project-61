package hexlet.code;
import java.util.Scanner;
public class App {
    public static String user = "";
    public static void main(String[] args) {
        String[] games = {"Exit", "Greet", "Even"};
        int choice = 0;
        System.out.println("Please enter the game number and press Enter.");
        for(int i = 1; i < games.length; i++) {
            System.out.printf("%d - %s\n", i, games[i]);
        }
        System.out.println("0 - Exit");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        System.out.println("Your choice: " + choice + "\n");
        if (choice == 0) {
            return;
        }
        switch (choice) {
            case 1: Cli.greeting(); break;
            case 2: Game.gameParityNumber(); break;
            default: break;
        }
    }
}
