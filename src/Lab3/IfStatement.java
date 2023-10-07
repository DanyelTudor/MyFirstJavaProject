package Lab3;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        multipleIfElse(n);
    }

    public static void simpleIf(int number) {
        if (number >= 0) {
            System.out.println("Numarul e pozitiv");
        }
    }

    public static void ifElse(int number) {
        if (number % 2 == 0) {
            System.out.println("Numarul este par");
        } else {
            System.out.println("Numarul este impar");
        }
    }

    public static void multipleIfElse(int number) {
        if (number < 0) {
            System.out.println("Numarul este negativ");
        } else if (number < 100) {
            System.out.println("Numaul este intre 0 si 99");
        } else if (number < 1000) {
            System.out.println("Numarul este intre 100 si 999");
        } else {
            System.out.println("Numarul este peste 999");
        }
    }
}