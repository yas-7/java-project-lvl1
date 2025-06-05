package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.BOUND;
import static hexlet.code.Utils.RANDOM;
import static hexlet.code.Utils.NUMBER_OF_ITERATIONS;

public class Prime {
    private static boolean isPrime(int value) {
        if (value < 2) {
            return false;
        }

        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void init() {
        Engine.greetUser();
        Engine.showDescription("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        String[] questions = new String[NUMBER_OF_ITERATIONS];
        String[] correctAnswers = new String[NUMBER_OF_ITERATIONS];

        for (int i = 0; i < NUMBER_OF_ITERATIONS; i++) {
            int value = RANDOM.nextInt(BOUND);
            questions[i] = String.valueOf(value);
            correctAnswers[i] = isPrime(value) ? "yes" : "no";
        }

        Engine.run(questions, correctAnswers);
    }
}
