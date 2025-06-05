package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.NUMBER_OF_ITERATIONS;
import static hexlet.code.Utils.BOUND;
import static hexlet.code.Utils.RANDOM;

public class Calc {
    public static void init() {
        Engine.greetUser();
        Engine.showDescription("What is the result of the expression?");

        String[] questions = new String[NUMBER_OF_ITERATIONS];
        String[] correctAnswers = new String[NUMBER_OF_ITERATIONS];
        int numberOfOperation = 3;

        for (int i = 0; i < NUMBER_OF_ITERATIONS; i++) {
            int value1 = RANDOM.nextInt(BOUND);
            int value2 = RANDOM.nextInt(BOUND);
            int operation = RANDOM.nextInt(numberOfOperation);

            String expression;
            int correctAnswer;
            switch (operation) {
                case 0:
                    expression = String.format("%d + %d", value1, value2);
                    correctAnswer = value1 + value2;
                    break;
                case 1:
                    expression = String.format("%d - %d", value1, value2);
                    correctAnswer = value1 - value2;
                    break;
                case 2:
                    expression = String.format("%d * %d", value1, value2);
                    correctAnswer = value1 * value2;
                    break;
                default:
                    throw new IllegalArgumentException("Неверное значение операции");
            }
            questions[i] = expression;
            correctAnswers[i] = String.valueOf(correctAnswer);
        }

        Engine.run(questions, correctAnswers);
    }
}
