package hexlet.code;

public class App {
    private static final int NumberOfRounds = 3;
    private static int score = 0;
    private final String CorrectAnswer = "Correct!";
    public static void main(String[] args) {
        String[][] games = {
                {"0", "Exit", ""},
                {"1", "Greet", ""},
                {"2", "Even", "Answer 'yes' if the number is even, otherwise answer 'no'."},
                {"3", "Calc", "What is the result of the expression?"},
                {"4", "GCD", "Find the greatest common divisor of given numbers."},
                {"5", "Progression", "What number is missing in the progression?"},
                {"6", "Prime", "Answer 'yes' if given number is prime. Otherwise answer 'no'."}
        };
        int choice = Engine.getGameNumber(games);
        String result = ""; // Если игрок выиграл раунд, возвращается строка "Correct!", иначе выводим строку с правильным ответом и предлагаем сыграть еще раз

        if (choice == 1) {
            Cli.greeting();
        }

        if (choice > 1 & choice < games.length) {
            Cli.greeting();
            Engine.printMessage(games[choice][2]);
            do {
                switch (choice) {
                    case 2: result = Game.playParityNumber(); break;
                    case 3: result = Game.playCalc(); break;
                    case 4: result = Game.playGCD(); break;
                    case 5: result = Game.playProgression(); break;
                    case 6: result = Game.playPrime(); break;
                }
                if (result.equals(CorrectAnswer)) {
                    Engine.printMessage(CorrectAnswer);
                    score++;
                } else {
                    Engine.printMessage(result);
                    Engine.printMessage("Let's try again, " + Cli.getName() + "!");
                    break;
                }
            } while (score < NumberOfRounds);
        }
        if (score == NumberOfRounds) {
            Engine.printMessage("Congratulations, " + Cli.getName() + "!");
        }
    }
}
