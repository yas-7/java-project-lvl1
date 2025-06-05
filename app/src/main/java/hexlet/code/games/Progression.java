package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.RANDOM;
import static hexlet.code.Utils.BOUND;
import static hexlet.code.Utils.NUMBER_OF_ITERATIONS;

public class Progression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 11;
    private static final int STEP_BOUND = 10;

    private static int[] generateProgression() {
        int arrayLength = RANDOM.nextInt(MIN_LENGTH, MAX_LENGTH);
        int firstElement = RANDOM.nextInt(BOUND);
        int step = RANDOM.nextInt(1, STEP_BOUND);
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = firstElement + i * step;
        }

        return array;
    }

    private static String generateQuestionString(int[] array, int hiddenElementIndex) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = i == hiddenElementIndex ? ".." : String.valueOf(array[i]);
        }
        return String.join(" ", result);
    }

    public static void init() {
        Engine.greetUser();
        Engine.showDescription("What number is missing in the progression?");

        String[] questions = new String[NUMBER_OF_ITERATIONS];
        String[] correctAnswers = new String[NUMBER_OF_ITERATIONS];

        for (int i = 0; i < NUMBER_OF_ITERATIONS; i++) {
            int[] array = generateProgression();
            int hiddenElementIndex = RANDOM.nextInt(array.length);

            questions[i] = generateQuestionString(array, hiddenElementIndex);
            correctAnswers[i] = String.valueOf(array[hiddenElementIndex]);
        }

        Engine.run(questions, correctAnswers);
    }
}
