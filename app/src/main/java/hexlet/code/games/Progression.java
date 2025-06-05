package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.RANDOM;
import static hexlet.code.Utils.BOUND;
import static hexlet.code.Utils.NUMBER_OF_ITERATIONS;

public class Progression {

    private static int[] generateProgression() {
        int minLength = 5;
        int maxLength = 11;
        int stepBound = 10;
        int arrayLength = RANDOM.nextInt(minLength, maxLength);
        int firstElement = RANDOM.nextInt(BOUND);
        int step = RANDOM.nextInt(1, stepBound);
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
