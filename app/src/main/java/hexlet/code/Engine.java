package hexlet.code;

import static hexlet.code.Utils.NUMBER_OF_ITERATIONS;
import static hexlet.code.Utils.SCANNER;

public class Engine {

    public static String userName;

    public static void greetUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = SCANNER.nextLine();
        System.out.printf("Hello, %s!%n", userName);
    }

    public static void showDescription(String description) {
        System.out.println(description);
    }

    public static void run(String[] questions, String[] correctAnswers) {
        for (int i = 0; i < NUMBER_OF_ITERATIONS; i++) {
            System.out.printf("Question: %s %n", questions[i]);
            System.out.print("Your answer: ");
            String answer = SCANNER.nextLine();
            String correctAnswer = correctAnswers[i];

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("""
                '%s' is wrong answer ;(. Correct answer was '%s'.
                Let's try again, %s!""", answer, correctAnswer, userName);
                return;
            }
        }

        System.out.printf("Congratulations, %s!", userName);
    }
}
