package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import static hexlet.code.Utils.SCANNER;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                0 - Exit
               """);

        System.out.print("Your choice: ");
        int gameNumber = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.println();

        switch (gameNumber) {
            case 1:
                Engine.greetUser();
                break;
            case 2:
                Even.init();
                break;
            case 3:
                Calc.init();
                break;
            case 4:
                GCD.init();
                break;
            default:
                System.out.println("Ошибка! Неверное значение для игры.");
        }

        SCANNER.close();
    }
}
