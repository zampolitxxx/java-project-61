package hexlet.code;
public class App {
    public static void main(String[] args) {
        String[] games = {"Exit", "Greet", "Even", "Calc", "GCD", "Progression", "Prime"};
        int choice = Engine.getGameNumber(games);
        boolean result = false; //if user win - true, if lose - false
        boolean wasGame = true; //if game has been played - true;, else - false
            if (choice >= 0 && choice <= games.length) {
                Cli.greeting();
                switch (choice) {
                    case 2: result = Game.playParityNumber(); break;
                    case 3: result = Game.playCalc(); break;
                    case 4: result = Game.playGCD(); break;
                    case 5: result = Game.progression(); break;
                    case 6: result = Game.playPrime(); break;
                    default: wasGame = false;
                }
            }
        if (result) {
            Engine.announceTheResult(result, "Congratulations, " + Cli.name + "!");
        } else if (!result & wasGame){
            Engine.printMessage("Let's try again, " + Cli.name);
        }
    }
}
