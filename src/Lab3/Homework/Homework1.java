package Lab3.Homework;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();
        int division = a / b;
        int remainder = a % b;
        System.out.println(a + " divided by " + b + " is " + division + " remainder " + remainder);
    }
}