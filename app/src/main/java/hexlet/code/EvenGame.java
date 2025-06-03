package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    private static boolean isEven(int value) {
        return value % 2 == 0;
    }
    public static void run(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();
        int numberOfIteration = 3;
        int bound = 100;

        for (int i = 0; i < numberOfIteration; i++) {
            int value = random.nextInt(bound);
            System.out.printf("Question: %d \n", value);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            var correctAnswer = isEven(value) ? "yes" : "no";

            if (!answer.equals(correctAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
                System.out.printf("Let's try again, %s!", name);
                return;
            }

            System.out.println("Correct!");
        }

        System.out.printf("Congratulations, %s!", name);
    }
}
