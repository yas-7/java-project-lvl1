package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        if (number < 1 || number > 2) {
            return;
        }

        Cli.greet();
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s!%n", name);

        switch (number) {
            case 2:
                EvenGame.run(name);
                break;
            default:
                break;
        }

        scanner.close();
    }
}
