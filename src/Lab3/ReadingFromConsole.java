package Lab3;

import java.util.Scanner;

public class ReadingFromConsole {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti 2 numere intregi:");
        int intValue = scanner.nextInt();
        int anotherValue = scanner.nextInt();
        System.out.println("Valorile citite sunt: " + intValue + " si " + anotherValue);
        System.out.println("Introduceti 2 numere fractionare:");
        double doubleValue = scanner.nextDouble();
        float floatValue = scanner.nextFloat();
        System.out.println("Valorile citite sunt: " + doubleValue + " si " + floatValue);

        System.out.println("Introduceti orice text");
        String text = scanner.nextLine();
        System.out.println("Am citit de la tastatura: " + text);

        System.out.println("Introduceti un boolean");
        boolean boolValue = scanner.nextBoolean();
        System.out.println(boolValue);
    }
}

//Recap & Homework>Control statements