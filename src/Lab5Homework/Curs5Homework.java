package Lab5Homework;

import java.util.Arrays;
import java.util.Random;

public class Curs5Homework {
    public static void main(String[] args) {
        int[] numbers1 = {2, 3, 5, 6, 4};
        int[] numbers2 = {7, 9, 6, 5, 6};
        sumOfNumber(numbers1);
        sumOfNumber(numbers2);

        returnNumbersGreaterThan(numbers1, 3);

        printSentences("Prima propozitie. A doua. A treia.");
    }

    public static long sumOfNumber(int[] numbers) {
        long sum = 0L;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    public static int countOddNumbers(int[] numbers) {
        int counter = 0;
        for (int n : numbers) {
            if (n % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] returnNumbersGreaterThan(int[] numbers, int number) {
        int[] result = new int[numbers.length];
        int index = 0;
        for (int n : numbers) {
            if (n > number) {
                result[index++] = n;
            }
        }
        int[] finalResult = new int[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }
        System.out.println(Arrays.toString(finalResult));
        return result;
    }

    public static int[] returnNumbersGreaterThan2(int[] numbers, int number) {
        int[] result = new int[numbers.length];
        int index = 0;
        for (int n : numbers) {
            if (n > number) {
                index++;
            }
        }
        int[] finalResult = new int[index];
        index = 0;
        for (int n : numbers) {
            if (n > number) {
                finalResult[index++] = n;
            }
        }
        return finalResult;
    }

    public static void donations(int target) {
        Random random = new Random();
        int sum = 0;
        do {
            int donation = random.nextInt(target);
            sum = +donation;
        } while (sum < target);
        System.out.println("Target was reached!");

    }

    public static void donations2(int target, int maxDonations) {
        Random random = new Random();
        int sum = 0;
        int numberOfDonations = 0;
        do {
            int donation = random.nextInt(target);
            sum += donation;
            numberOfDonations++;
        } while (sum < target && numberOfDonations < maxDonations);
        if (sum >= target) {
            System.out.println("Target was reached!");
        } else {
            System.out.println("Max number of donations was reached!");
        }

        // target = 100, maxDonations = 2, donation = 50, numberOfDonations = 1
        // target = 100, maxDonations = 2, donation = 10, numberOfDonations = 2
    }

    public static void printSentences(String phrase) {
        String[] sentences = phrase.split("\\.");
        for (String sentence : sentences) {
            System.out.println(sentence.trim());
        }
    }
}

//IntelliJ & Git(00:33)>OOP intro>Recap & Homework(7)