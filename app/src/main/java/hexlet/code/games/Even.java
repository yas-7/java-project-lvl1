package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.NUMBER_OF_ITERATIONS;
import static hexlet.code.Utils.RANDOM;
import static hexlet.code.Utils.BOUND;

public class Even {

    private static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static void init() {
        Engine.greetUser();
        Engine.showDescription("Answer 'yes' if the number is even, otherwise answer 'no'.");

        String[] questions = new String[NUMBER_OF_ITERATIONS];
        String[] correctAnswers = new String[NUMBER_OF_ITERATIONS];

        for (int i = 0; i < NUMBER_OF_ITERATIONS; i++) {
            int value = RANDOM.nextInt(BOUND);
            questions[i] = String.valueOf(value);
            correctAnswers[i] = isEven(value) ? "yes" : "no";
        }

        Engine.run(questions, correctAnswers);
    }
}
