package Lab3.Homework;

import java.util.Scanner;

public class Homework3ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int taxPercentage = getTaxPercentage(input);
        System.out.println(taxPercentage + "%");
    }

    public static int getTaxPercentage(int amount) {
        if (amount <= 2000) {
            return 0;
        }
        if (amount <= 5000) {
            return 20;
        }
        return 35;
    }
}