package Lab3;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Day of the week");
        int day = s.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            //...
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Not a day!");
        }
        System.out.println("End of app");
    }
}

//Recap & Homework>Loops>Variable Scope, Branch Control>String