package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import static hexlet.code.Utils.SCANNER;

public class App {
    private static final int EXIT = 0;
    private static final int GREET = 1;
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int PRIME_GAME = 6;
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");

        System.out.print("Your choice: ");
        int gameNumber = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.println();

        switch (gameNumber) {
            case EXIT:
                break;
            case GREET:
                Engine.greetUser();
                break;
            case EVEN_GAME:
                Even.init();
                break;
            case CALC_GAME:
                Calc.init();
                break;
            case GCD_GAME:
                GCD.init();
                break;
            case PROGRESSION_GAME:
                Progression.init();
                break;
            case PRIME_GAME:
                Prime.init();
                break;
            default:
                System.out.println("Ошибка! Неверное значение для игры.");
        }

        SCANNER.close();
    }
}
