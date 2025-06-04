package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.NUMBER_OF_ITERATIONS;
import static hexlet.code.Utils.BOUND;
import static hexlet.code.Utils.RANDOM;

public class GCD {

    private static int getGcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void init() {
        Engine.greetUser();
        Engine.showDescription("Find the greatest common divisor of given numbers.");

        String[] questions = new String[NUMBER_OF_ITERATIONS];
        String[] correctAnswers = new String[NUMBER_OF_ITERATIONS];

        for (int i = 0; i < NUMBER_OF_ITERATIONS; i++) {
            int value1 = RANDOM.nextInt(BOUND);
            int value2 = RANDOM.nextInt(BOUND);
            questions[i] = String.format("%d %d", value1, value2);
            correctAnswers[i] = String.valueOf(getGcd(value1, value2));
        }

        Engine.run(questions, correctAnswers);
    }
}
