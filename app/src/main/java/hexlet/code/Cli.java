package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s!", name);
        scanner.close();
    }
}
