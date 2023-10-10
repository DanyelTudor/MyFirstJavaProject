package Lab4;

import java.util.Scanner;
import java.lang.Math;

public class LoopStatement {
    public static void main(String[] args) {
        int[] array = {3, 4, 6, 1, 8};
        printEveryElementSimplified(array);

        System.out.println(Math.sqrt(121));
    }

    public static void whileExercise() {
        long a = 0;
        while (a < 100) {
            System.out.println("Hello!" + (a++));
        }
        System.out.println("Finished!");
    }

    public static void doWhileExercise() {
        long a = 0;
        do {
            System.out.println("Hello! " + (a++));
        } while (a < 100);
    }

    public static void forExercise() {
        for (long a = 0; a < 100; a++) {
            System.out.println("Hello! " + a);
        }
    }

    public static void repeatUntilExit() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        while (!word.equals("exit")) {
            System.out.println("Hello! " + word);
            word = scanner.nextLine();
        }
    }

    public static void printEveryElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printEveryElementSimplified(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }
}

//Variable Scope, Branch Control>String