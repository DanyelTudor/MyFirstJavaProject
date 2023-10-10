package Lab4.Homework;

import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        guessTheNumber();
    }

    public static void prinEvenNumbers(int[] numbers) {
        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }

    public static void guessTheNumber() {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int generatedNumber = r.nextInt(20);
        System.out.println("Guess a number from 1 to 20");
        do {
            int number = s.nextInt();
            if (number == generatedNumber) {
                break;
            }
            System.out.println("Try again!");
        } while (true);
        System.out.println("Congrats! You have guessed the number");
    }
}